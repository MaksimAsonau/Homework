package test.home_work_1.task_5;

import home_work_1.task_5.Subtask_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Subtask1Test {

    @DisplayName("Тест метода проверяющего можно ли спать")
    @ParameterizedTest
    @CsvSource({
            "true, true, true ",
            "true, false, false ",
            "false, false, true ",
            "false, true, true "
    })

    public void sleepInTest(boolean x, boolean y, boolean result) {
        Assertions.assertEquals(Subtask_1.sleepIn(x,y), result);
    }
}
