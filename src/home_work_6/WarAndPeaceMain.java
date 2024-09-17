package home_work_6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class WarAndPeaceMain {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите путь к книге:");
        String path = scanner.nextLine();
        String content = new String(Files.readAllBytes(new File(path).toPath()));

        // 2.1 Найти все использованные слова и поместить их в коллекцию Set
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(content.split("[\\p{Punct}\\s]+")));
        System.out.println("Количество уникальных слов: " + uniqueWords.size());

        // 2.2 Найти топ N слов и вывести количество этих слов используя Map и List
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : content.split("[\\p{Punct}\\s]+")) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCounts.entrySet());
        sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        System.out.println("Введите количество топ N слов для их вывода:");
        int topN = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < topN && i < sortedEntries.size(); i++) {
            Map.Entry<String, Integer> entry = sortedEntries.get(i);
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();
        System.out.println("Тест реализаций интерфейса ISearchEngine: \n");

        // 5.1 Поиск слов "война", "и", "мир"
        ISearchEngine searchEngine = new RegExSearch();
        System.out.println("Слово 'война' встречается " + searchEngine.search(content, "война") + " раз.");
        System.out.println("Слово 'и' встречается " + searchEngine.search(content, "и") + " раз.");
        System.out.println("Слово 'мир' встречается " + searchEngine.search(content, "мир") + " раз.");

        // 5.2 Поиск без учета регистра
        ISearchEngine caseInsensitiveSearchEngine = new CaseInsensitiveSearchEngine(new RegExSearch());
        System.out.println("Слово 'война' (без учета регистра) встречается " +
                caseInsensitiveSearchEngine.search(content, "война") + " раз.");
        System.out.println("Слово 'и' (без учета регистра) встречается " +
                caseInsensitiveSearchEngine.search(content, "и") + " раз.");
        System.out.println("Слово 'мир' (без учета регистра) встречается " +
                caseInsensitiveSearchEngine.search(content, "мир") + " раз.");
    }
}

