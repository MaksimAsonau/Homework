package test.home_work_2.loops.task_3;

import home_work_2.loops.task_3.Subtask_1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Subtask1Test {

    Subtask_1 subtask = new Subtask_1();

    @Test
    @DisplayName("Тест c корректным вводом")
    void calculatePowerWithPositiveExponentTest() {
        assertEquals(8, subtask.calculatePower(2,3), "2^3 должно быть 8");
    }

    @Test
    @DisplayName("Тест c нулевым вводом")
    void calculatePowerWithZeroExponentTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            subtask.calculatePower(2, 0);
        });
        assertEquals("Ошибка: Степень должна быть положительным целым числом.", exception.getMessage());
    }

    @Test
    @DisplayName("Тест c отрицательным вводом")
    void calculatePowerWithNegativeExponentTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            subtask.calculatePower(2, -2);
        });
        assertEquals("Ошибка: Степень должна быть положительным целым числом.", exception.getMessage());
    }

    @Test
    @DisplayName("Тест парсинга степени c корректным вводом")
    void parseExponentWithValidInputTest() {
        assertEquals(5, subtask.parseExponent("5"));
    }

    @Test
    @DisplayName("Тест парсинга степени c нулевым вводом")
    void parseExponentWithZeroInputTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            subtask.parseExponent("0");
        });
        assertEquals("Ошибка: Степень должна быть положительным целым числом.", exception.getMessage());
    }

    @Test
    @DisplayName("Тест парсинга степени c отрицательным вводом")
    void parseExponentWithNegativeInputTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            subtask.parseExponent("-3");
        });
        assertEquals("Ошибка: Степень должна быть положительным целым числом.", exception.getMessage());
    }

    @Test
    @DisplayName("Тест парсинга степени c нечисловым вводом")
    void parseExponentWithNonIntegerInputTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            subtask.parseExponent("abc");
        });
        assertEquals("Ошибка: Степень должна быть целым числом.", exception.getMessage());
    }


}
