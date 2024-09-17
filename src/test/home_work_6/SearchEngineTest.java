package test.home_work_6;

import home_work_6.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchEngineTest {

    @Test
    @DisplayName("Тест для EasySearch")
    public void test1() {
        ISearchEngine searchEngine = new EasySearch();
        String text = "Привет, как дела? Привет, все хорошо.";

        assertEquals(2, searchEngine.search(text, "Привет"));
        assertEquals(1, searchEngine.search(text, "как"));
        assertEquals(1, searchEngine.search(text, "дела"));
        assertEquals(0, searchEngine.search(text, "пока"));
    }

    @Test
    @DisplayName("Тест для RegExSearch")
    public void test2() {
        ISearchEngine searchEngine = new RegExSearch();
        String text = "Привет, как дела? Привет, все хорошо.";

        assertEquals(2, searchEngine.search(text, "Привет"));
        assertEquals(1, searchEngine.search(text, "как"));
        assertEquals(1, searchEngine.search(text, "дела"));
        assertEquals(0, searchEngine.search(text, "пока"));
    }

    @Test
    @DisplayName("Тест для SearchEnginePunctuationNormalizer")
    public void test3() {
        ISearchEngine searchEngine = new SearchEnginePunctuationNormalizer(new RegExSearch());
        String text = "Привет, как дела? Привет, все хорошо.";

        assertEquals(2, searchEngine.search(text, "Привет"));
        assertEquals(1, searchEngine.search(text, "как"));
        assertEquals(1, searchEngine.search(text, "дела"));
        assertEquals(0, searchEngine.search(text, "пока"));
    }

    @Test
    @DisplayName("Тест для CaseInsensitiveSearchEngine")
    public void test4() {
        ISearchEngine searchEngine = new CaseInsensitiveSearchEngine(new RegExSearch());
        String text = "Привет, как дела? Привет, все хорошо.";

        assertEquals(2, searchEngine.search(text, "привет"));
        assertEquals(1, searchEngine.search(text, "Как"));
        assertEquals(1, searchEngine.search(text, "ДЕЛА"));
        assertEquals(0, searchEngine.search(text, "пока"));
    }

    @Test
    @DisplayName("Тест для чисел")
    public void test5() {
        ISearchEngine searchEngine = new RegExSearch();
        String text = "2-2 2-2 2, 22, 222";

        assertEquals(2, searchEngine.search(text, "2-2"));
        assertEquals(5, searchEngine.search(text, "2"));
        assertEquals(1, searchEngine.search(text, "222"));
    }

    @Test
    @DisplayName("Тест текста с различным форматом")
    public void test6() {
        ISearchEngine searchEngine = new RegExSearch();
        String text = "яблоко яблоки яблочные яблочко";

        assertEquals(1, searchEngine.search(text, "яблоко"));
        assertEquals(1, searchEngine.search(text, "яблоки"));
        assertEquals(1, searchEngine.search(text, "яблочные"));
        assertEquals(1, searchEngine.search(text, "яблочко"));
    }

    @Test
    @DisplayName("Тест текста с перемешиванием")
    public void test7() {
        ISearchEngine searchEngine = new RegExSearch();
        String text = "Hello-World! HelloWorld hello_world Hello   World";

        assertEquals(2, searchEngine.search(text, "Hello"));
        assertEquals(1, searchEngine.search(text, "HelloWorld"));
        assertEquals(1, searchEngine.search(text, "hello_world"));
        assertEquals(2, searchEngine.search(text, "World"));
    }

    @Test
    @DisplayName("Тест текста с строками и числами")
    public void testTextWithTextAndNumbers() {
        ISearchEngine searchEngine = new RegExSearch();
        String text = "Test123 123Test test 123 Test";

        assertEquals(1, searchEngine.search(text, "Test123"));
        assertEquals(1, searchEngine.search(text, "123Test"));
        assertEquals(1, searchEngine.search(text, "test"));
        assertEquals(1, searchEngine.search(text, "Test"));
    }
}
