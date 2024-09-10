package test.home_work_1.task_4;

import home_work_1.task_4.Subtask_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Subtask3Test {

    @DisplayName("Тест частного от деления двух чисел")
    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "-10, 2, -5",
            "10, -2, -5",
            "0, 2, 0",
            "33, 15, 2",
            "33, -15, -2",
            "-2147483648, 2147483647, -1"
    })
    public void calculateQuotientTest(int x, int y, int result) {
        Assertions.assertEquals(Subtask_3.calculateQuotient(x, y), result);
    }

    @DisplayName("Тест остатка от деления двух чисел")
    @ParameterizedTest
    @CsvSource({
            "10, 3, 1",
            "-10, 3, -1",
            "10, -3, 1",
            "0, 5, 0",
            "30, 15, 0",
            "-2147483648, 2147483647, -1"
    })
    public void calculateRemainderTest(int x, int y, int result) {
        Assertions.assertEquals(Subtask_3.calculateRemainder(x, y), result);
    }
}
