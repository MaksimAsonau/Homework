package test.home_work_1.task_7;

import home_work_1.task_7.Subtask_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Subtask1Test {

    @Test
    @DisplayName("Тест с корректными данными")
    public void formatNumberTest1() {
        Assertions.assertEquals("(123) 456-7890",
                Subtask_1.formatNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
    @Test
    @DisplayName("Тест с некоректным количеством символов")
    public void formatNumberTest2() {
        Assertions.assertEquals("Неверное количество символов",
                Subtask_1.formatNumber(new int[]{1, 9, 8, 4}));
    }
    @Test
    @DisplayName("Тест с некоректным фоматом числа в массиве")
    public void formatNumberTest3() {
        Assertions.assertEquals("Неверный формат числа в массиве",
                Subtask_1.formatNumber(new int[]{1, 2, 33, 4, 5, 6, 7, 80, 9, 0}));
    }
}
