package test.home_work_1.task_4;

import home_work_1.task_4.Subtask_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Subtask5Test {

    @DisplayName("Тест определяющий английская ли буква")
    @ParameterizedTest
    @CsvSource({
            "65, true",
            "77, true",
            "90, true",
            "97, true",
            "111, true",
            "122, true",
            "123, false",
            "0, false",
            "-65, false",
    })

    public void isLetterTest(int x, boolean result) {
        Assertions.assertEquals(Subtask_5.isLetter(x), result);
    }
}
