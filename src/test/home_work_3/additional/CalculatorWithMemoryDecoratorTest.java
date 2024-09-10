package test.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithMemoryDecoratorTest {

    @Test
    @DisplayName("Тест выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 с использованием памяти")
    void test() {
        // Создаём вложенный калькулятор и оборачиваем его в декоратор с памятью
        CalculatorWithMemoryDecorator calcMemory = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());

        // Шаг 1: 28 / 5
        double result1 = calcMemory.divide(28, 5);
        assertEquals(5.6, result1, 0.0001, "28 / 5 должно быть 5.6");
        calcMemory.save(); // Сохраняем результат деления в память

        // Шаг 2: (28 / 5) ^ 2
        double result2 = calcMemory.pow(calcMemory.load(), 2);
        assertEquals(31.36, result2, 0.0001, "(28 / 5) ^ 2 должно быть 31.36");
        calcMemory.save(); // Сохраняем результат возведения в степень

        // Шаг 3: 15 * 7
        double result3 = calcMemory.multiply(15, 7);
        assertEquals(105, result3, 0.0001, "15 * 7 должно быть 105");

        // Шаг 4: 4.1 + 105
        double result4 = calcMemory.add(4.1, result3);
        assertEquals(109.1, result4, 0.0001, "4.1 + 105 должно быть 109.1");

        // Шаг 5: 109.1 + 31.36
        double finalResult = calcMemory.add(result2, result4);
        assertEquals(140.46, finalResult, 0.0001, "Окончательный результат должен быть 140.46");

        // Проверка сохранённого результата из памяти
        calcMemory.save();
        assertEquals(140.46, calcMemory.load(), 0.0001, "Значение в памяти должно быть 140.46 после вычислений");
    }
}
