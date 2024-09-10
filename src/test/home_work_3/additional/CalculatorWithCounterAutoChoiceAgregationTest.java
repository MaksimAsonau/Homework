package test.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithCounterAutoChoiceAgregationTest {

    @Test
    @DisplayName("Тест выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 с использованием CalculatorWithOperator")
    void test1() {
        CalculatorWithOperator calcOperator = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation calculator =
                new CalculatorWithCounterAutoChoiceAgregation(calcOperator);

        testExample(calculator);
    }

    @Test
    @DisplayName("Тест выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 с использованием CalculatorWithMathCopy")
    void test2() {
        CalculatorWithMathCopy calcMathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation calculator =
                new CalculatorWithCounterAutoChoiceAgregation(calcMathCopy);

        testExample(calculator);
    }

    @Test
    @DisplayName("Тест выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 с использованием CalculatorWithMathExtends")
    void test3() {
        CalculatorWithMathExtends calcMathExtends = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calculator =
                new CalculatorWithCounterAutoChoiceAgregation(calcMathExtends);

        testExample(calculator);
    }

    // Общий метод для тестирования выражения 4.1 + 15 * 7 + (28 / 5) ^ 2
    private void testExample(CalculatorWithCounterAutoChoiceAgregation calculator) {
        // 1. 28 / 5
        double divisionResult = calculator.divide(28, 5);
        assertEquals(5.6, divisionResult, 0.0001, "Результат 28 / 5 должен быть 5.6");

        // 2. (28 / 5) ^ 2
        double powerResult = calculator.pow(divisionResult, 2);
        assertEquals(31.36, powerResult, 0.0001, "Результат (28 / 5) ^ 2 должен быть 31.36");

        // 3. 15 * 7
        double multiplicationResult = calculator.multiply(15, 7);
        assertEquals(105, multiplicationResult, 0.0001, "Результат 15 * 7 должен быть 105");

        // 4. 4.1 + 15 * 7
        double additionResult1 = calculator.add(4.1, multiplicationResult);
        assertEquals(109.1, additionResult1, 0.0001, "Результат 4.1 + 15 * 7 должен быть 109.1");

        // 5. 4.1 + 15 * 7 + (28 / 5) ^ 2
        double finalResult = calculator.add(additionResult1, powerResult);
        assertEquals(140.46, finalResult, 0.0001, "Окончательный результат выражения должен быть 140.46");

        // Проверка счётчика операций
        assertEquals(5, calculator.getCountOperation(), "Счётчик операций должен быть равен 5");
    }
}
