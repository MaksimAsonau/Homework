package home_work_6;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ChooseBookMain {
    private static final String RESULT_FILE = "result.txt";

    public static void main(String[] args) throws IOException {
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
            System.out.println("В указанной папке нет текстовых файлов.");
            return;
        }

        System.out.println("Найдены следующие текстовые файлы:");
        for (int i = 0; i < files.length; i++) {
            System.out.println((i + 1) + ". " + files[i].getName());
        }

        System.out.println("Выберите номер файла для работы (или введите 0 для выхода):");
        int fileIndex = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        if (fileIndex < 1 || fileIndex > files.length) {
            System.out.println("Некорректный номер файла.");
            return;
        }

        File selectedFile = files[fileIndex - 1];
        String fileName = selectedFile.getName();

        try (PrintWriter resultWriter = new PrintWriter(new FileWriter(RESULT_FILE, true))) {
            boolean continueSearching = true;

            while (continueSearching) {
                System.out.println("Введите слово для поиска в файле '" + fileName + "':");
                String searchWord = scanner.nextLine();

                String content = new String(Files.readAllBytes(selectedFile.toPath()));

                ISearchEngine searchEngine = new RegExSearch();
                long count = searchEngine.search(content, searchWord);

                String result = String.format("%s – %s – %d", fileName, searchWord, count);
                System.out.println(result);
                resultWriter.println(result);

                System.out.println("Хотите продолжить поиск в этом файле? (да/нет)");
                String continueResponse = scanner.nextLine().trim().toLowerCase();
                if (!continueResponse.equals("да")) {
                    continueSearching = false;
                }
            }
        }
        System.out.println("Результаты поиска сохранены в файле '" + RESULT_FILE + "'.");
    }
}
