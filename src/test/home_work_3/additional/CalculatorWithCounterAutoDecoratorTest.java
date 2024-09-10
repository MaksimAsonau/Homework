package test.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithCounterAutoDecoratorTest {

    @Test
    @DisplayName("Тест выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 с использованием счётчика")
    void test() {
        // Создаём вложенный калькулятор и оборачиваем его в декоратор со счётчиком
        CalculatorWithCounterAutoDecorator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMathExtends());

        // Шаг 1: 28 / 5
        double result1 = calc.divide(28, 5);
        assertEquals(5.6, result1, 0.0001, "28 / 5 должно быть 5.6");

        // Шаг 2: (28 / 5) ^ 2
        double result2 = calc.pow(result1, 2);
        assertEquals(31.36, result2, 0.0001, "(28 / 5) ^ 2 должно быть 31.36");

        // Шаг 3: 15 * 7
        double result3 = calc.multiply(15, 7);
        assertEquals(105, result3, 0.0001, "15 * 7 должно быть 105");

        // Шаг 4: 4.1 + 105
        double result4 = calc.add(4.1, result3);
        assertEquals(109.1, result4, 0.0001, "4.1 + 105 должно быть 109.1");

        // Шаг 5: 109.1 + 31.36
        double finalResult = calc.add(result2, result4);
        assertEquals(140.46, finalResult, 0.0001, "Окончательный результат должен быть 140.46");

        // Проверка количества операций
        assertEquals(5, calc.getCount(), "Количество операций должно быть 5");
    }
}
