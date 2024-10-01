package home_work_6;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

public class MultiThreadedSearchMain {
    private static final String RESULT_FILE = "result.txt";
    private static final int THREAD_POOL_SIZE = 10;

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите путь к папке с текстовыми файлами:");
        String directoryPath = scanner.nextLine();
        File directory = new File(directoryPath);

        if (!directory.isDirectory()) {
            System.out.println("Указанный путь не является директорией.");
            return;
        }

        File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));
        if (files == null || files.length == 0) {
            System.out.println("Нет файлов для обработки.");
            return;
        }

        // Создание пула потоков
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        while (true) {
            System.out.println("Введите слово для поиска (или 'exit' для выхода и записи результатов поиска в файл):");
            String searchWord = scanner.nextLine();

            if (searchWord.equalsIgnoreCase("exit")) {
                break;
            }

            for (File file : files) {
                executorService.submit(new SearchTask(file, searchWord));
            }
        }

        // Завершение работы ExecutorService после выполнения всех задач
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        System.out.println("Все задания завершены. Результаты записаны в " + RESULT_FILE);
    }

    private static class SearchTask implements Runnable {
        private final File file;
        private final String wordToSearch;

        public SearchTask(File file, String wordToSearch) {
            this.file = file;
            this.wordToSearch = wordToSearch;
        }

        @Override
        public void run() {
            try {
                String text = new String(Files.readAllBytes(file.toPath()));
                ISearchEngine searchEngine = new RegExSearch(); // Используем нужную реализацию ISearchEngine
                long count = searchEngine.search(text, wordToSearch);

                writeResultToFile(file.getName(), wordToSearch, count);
            } catch (IOException e) {
                System.err.println("Ошибка при чтении файла: " + file.getName());
            }
        }

        private synchronized void writeResultToFile(String fileName, String word, long count) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(RESULT_FILE, true))) {
                writer.write(word + " - " + count + " - " + fileName);
                writer.newLine();
            } catch (IOException e) {
                System.err.println("Ошибка при записи в файл результатов.");
            }
        }
    }
}
