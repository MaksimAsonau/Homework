package test.home_work_1.task_4;

import home_work_1.task_4.Subtask_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Subtask1Test {

    @DisplayName("Тест на нечетность числа")
    @ParameterizedTest
    @CsvSource({
     "10, false",
     "11, true",
     "-10, false",
     "-11, true",
     "0, false"
    })

    public void isOddTest (int x, boolean result) {
        Assertions.assertEquals(Subtask_1.isOdd(x), result);
    }
}
