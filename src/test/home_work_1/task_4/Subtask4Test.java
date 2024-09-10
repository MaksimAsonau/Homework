package test.home_work_1.task_4;

import home_work_1.task_4.Subtask_3;
import home_work_1.task_4.Subtask_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Subtask4Test {

    @DisplayName("Тест перевода килобайт в байты")
    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1024",
            "-10, -1",
            "0.5, 512"
    })
    public void convertKilobytesToBytesTest(double x, double result) {
        Assertions.assertEquals(Subtask_4.convertKilobytesToBytes(x), result);
    }

    @DisplayName("Тест перевода байт в килобайты")
    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "2048, 2",
            "512, 0.5",
            "-10, -1"
    })
    public void convertBytesToKilobytesTest(double x, double result) {
        Assertions.assertEquals(Subtask_4.convertBytesToKilobytes(x), result);
    }
}
