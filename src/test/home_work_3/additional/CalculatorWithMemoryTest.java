package test.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithMemoryTest {

    @Test
    @DisplayName("Тест выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 с использованием памяти")
    void test() {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        CalculatorWithMemory calcMemory = new CalculatorWithMemory(calc);

        // Шаг 1: 28 / 5
        double divisionResult = calcMemory.divide(28, 5);
        assertEquals(5.6, divisionResult, 0.0001, "Результат 28 / 5 должен быть 5.6");
        calcMemory.save();  // Сохраняем результат в память

        // Шаг 2: (28 / 5) ^ 2
        double powResult = calcMemory.pow(calcMemory.load(), 2);
        assertEquals(31.36, powResult, 0.0001, "Результат (28 / 5) ^ 2 должен быть 31.36");
        calcMemory.save();  // Сохраняем результат возведения в степень в память

        // Шаг 3: 4.1 + результат возведения в степень
        double addResult1 = calcMemory.add(4.1, calcMemory.load());
        assertEquals(35.46, addResult1, 0.0001, "Результат 4.1 + (28 / 5) ^ 2 должен быть 35.46");
        calcMemory.save();  // Сохраняем результат сложения в память

        // Шаг 4: 15 * 7
        double multiplyResult = calcMemory.multiply(15, 7);
        assertEquals(105, multiplyResult, 0.0001, "Результат 15 * 7 должен быть 105");

        // Шаг 5: результат сложения + результат умножения
        double finalResult = calcMemory.add(calcMemory.load(), multiplyResult);
        assertEquals(140.46, finalResult, 0.0001, "Окончательный результат выражения должен быть 140.46");
        calcMemory.save();  // Сохраняем окончательный результат

        // Проверка окончательного результата из памяти
        assertEquals(140.46, calcMemory.load(), 0.0001, "Значение из памяти должно быть 140.46");
    }
}
