package test.home_work_2.loops.task_1;

import home_work_2.loops.task_1.Subtask_1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Subtask1Test {

    @Test
    @DisplayName("Тест c положительны числом")
    void factorialOfPositiveNumbersTest() {
        Subtask_1 factorial = new Subtask_1();

        assertEquals(120, factorial.calculateFactorial(5)); // 5! = 120
        assertEquals(3628800, factorial.calculateFactorial(10)); // 10! = 3628800
    }

    @Test
    @DisplayName("Тест c нулем")
    void factorialOfZeroTest() {
        Subtask_1 factorial = new Subtask_1();

        assertEquals(1, factorial.calculateFactorial(0)); // 0! = 1
    }

    @Test
    @DisplayName("Тест c единицей")
    void factorialOfOneTest() {
        Subtask_1 factorial = new Subtask_1();

        assertEquals(1, factorial.calculateFactorial(1)); // 1! = 1
    }

    @Test
    @DisplayName("Тест с переполнением")
    void factorialOverflowTest() {
        Subtask_1 factorial = new Subtask_1();

        // 21! больше, чем может содержать long, должно возвращать -1
        assertEquals(-1, factorial.calculateFactorial(21));

        // Проверяем ещё более большое число
        assertEquals(-1, factorial.calculateFactorial(100));
    }

    @Test
    @DisplayName("Тест c отрицательным числом")
    void negativeNumberThrowsExceptionTest() {

        assertThrows(IllegalArgumentException.class, () -> {
            Subtask_1.validateNotNegativeNumber(-5);
        });
    }
}
