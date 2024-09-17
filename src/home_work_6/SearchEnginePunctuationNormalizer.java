package home_work_6;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        text = text.replaceAll("[\\p{Punct}&&[^-]]+", " ");
        text = text.trim().replaceAll("\\s+", " ");
        return searchEngine.search(text, word);
    }
}
