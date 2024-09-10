package test.home_work_1.task_4;

import home_work_1.task_4.Subtask_1;
import home_work_1.task_4.Subtask_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Subtask2Test {

    @DisplayName("Тест трех чисел на уникальность")
    @ParameterizedTest
    @CsvSource({
            "1, 2, 3, true",
            "1, 1, 2, false",
            "-1, 1, 0, true",
            "-2147483648, 2147483647, 0, true",
            "-1, 1, -1, false",
            "0, 0, 0, false"
    })
    public void areNumbersUniqueTest(int x, int y, int z, boolean result) {
        Assertions.assertEquals(Subtask_2.areNumbersUnique(x, y, z), result);
    }

    @DisplayName("Тест поиска среднего числа из трех уникальных")
    @ParameterizedTest
    @CsvSource({
            "0, 1, 2, 1",
            "2, 1, 0, 1",
            "1, 0, 2, 1",
            "0, 2, 1, 1",
            "-1, -2, -3, -2",
            "-1, 0, -2, -1",
            "-1, 1, 0, 0",
            "-2147483648, 0, 2147483647, 0"
    })
    public void getMiddleNumberTest(int x, int y, int z, int result) {
        Assertions.assertEquals(Subtask_2.getMiddleNumber(x, y, z), result);
    }
}
