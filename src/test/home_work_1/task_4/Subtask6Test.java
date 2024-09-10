package test.home_work_1.task_4;

import home_work_1.task_4.Subtask_6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Subtask6Test {

    @DisplayName("Тест определяющий високосный ли год")
    @ParameterizedTest
    @CsvSource({
            "2000, true",
            "1700, false",
            "1700, false",
            "0, true",
            "2147483647, false",
            "-2147483648, true",
    })

    public void isLeapYearTest(int x, boolean result) {
        Assertions.assertEquals(Subtask_6.isLeapYear(x), result);
    }
}
