package test.home_work_3.simple;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithMathExtendsTest {

    private final CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();

    @Test
    @DisplayName("Тест выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2")
    void test() {
        // Шаг 1: 15 * 7
        double multiplyResult = calculator.multiply(15, 7); // 105

        // Шаг 2: 28 / 5
        double divideResult = calculator.divide(28, 5); // 5.6

        // Шаг 3: (28 / 5) ^ 2
        double powResult = calculator.pow(divideResult, 2); // 31.36

        // Шаг 4: 4.1 + 105
        double addFirstResult = calculator.add(4.1, multiplyResult); // 109.1

        // Шаг 5: 109.1 + 31.36
        double finalResult = calculator.add(addFirstResult, powResult); // 140.46

        // Ожидаемый результат
        double expectedResult = 140.46;

        // Точность вычисления с плавающей точкой
        double delta = 0.0001;

        // Проверка результата
        assertEquals(expectedResult, finalResult, delta, "Результат вычисления выражения не совпадает");
    }
}
