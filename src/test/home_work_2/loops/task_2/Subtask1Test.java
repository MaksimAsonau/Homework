package test.home_work_2.loops.task_2;

import home_work_2.loops.task_2.Subtask_1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Subtask1Test {

    Subtask_1 subtask = new Subtask_1();

    @Test
    @DisplayName("Тест c корректным вводом")
    void validInputTest() {
        assertEquals("1 * 2 * 3 * 4 = 24", subtask.validateAndProcessInput("1234"));
    }

    @Test
    @DisplayName("Тест c нечисловым вводом")
    void invalidInputTestTest() {
        assertEquals("Вы ввели не целое число.", subtask.validateAndProcessInput("123a"));
    }

    @Test
    @DisplayName("Тест c пустым вводом")
    void emptyInputTestTest() {
        assertEquals("Необходимо ввести одно целое число в качестве аргумента.",
                subtask.validateAndProcessInput(""));
    }

    @Test
    @DisplayName("Тест c вводом одной цифры")
    void singleDigitInputTest() {
        assertEquals("7 = 7", subtask.validateAndProcessInput("7"));
    }

    @Test
    @DisplayName("Тест c отрицательным вводом")
    void negativeNumberInputTest() {
        assertEquals("Введите положительное число.", subtask.validateAndProcessInput("-123"));
    }

    @Test
    @DisplayName("Тест метода вычисления произведения цифр")
    void calculateProductOfDigitsTest() {
        assertEquals(24, subtask.calculateProductOfDigits("234"));
    }

    @Test
    @DisplayName("Тест метода формирования финальной строки с шагами вычислений")
    void getCalculationStepsTest() {
        assertEquals("1 * 2 * 3 = 6", subtask.getCalculationSteps("123", 6));
    }
}
