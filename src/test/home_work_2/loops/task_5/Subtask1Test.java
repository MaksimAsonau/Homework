package test.home_work_2.loops.task_5;

import home_work_2.loops.task_5.Subtask_1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Subtask1Test {

    @Test
    @DisplayName("Тест: Наибольшая цифра в числе")
    public void findMaxDigitTest() {
        assertEquals(9, Subtask_1.findMaxDigit(2593));
        assertEquals(1, Subtask_1.findMaxDigit(1));
        assertEquals(8, Subtask_1.findMaxDigit(2147483647));
        assertThrows(IllegalArgumentException.class, () -> Subtask_1.findMaxDigit(0));
        assertThrows(IllegalArgumentException.class, () -> Subtask_1.findMaxDigit(-10));
    }

    @Test
    @DisplayName("Тест: Вероятность четных чисел")
    public void CalculateEvenProbabilityTest() {
        double probability = Subtask_1.calculateEvenProbability(10000);
        assertTrue(probability >= 0 && probability <= 100);
    }

    @Test
    @DisplayName("Тест: Подсчет четных цифр")
    public void EvenDigitsCounterTest() {
        assertEquals(3, Subtask_1.evenDigitsCounter(246));
        assertEquals(0, Subtask_1.evenDigitsCounter(1357));
        assertEquals(6, Subtask_1.evenDigitsCounter(2147483647));
        assertEquals(2, Subtask_1.evenDigitsCounter(-212));
        assertEquals(0, Subtask_1.evenDigitsCounter(0));
        assertEquals(1, Subtask_1.evenDigitsCounter(-8));
        assertEquals(1, Subtask_1.evenDigitsCounter(8));
    }
    @Test
    @DisplayName("Тест: Подсчет нечетных цифр")
    public void OddDigitsCounterTest() {
        assertEquals(0, Subtask_1.oddDigitsCounter(246));
        assertEquals(4, Subtask_1.oddDigitsCounter(1357));
        assertEquals(4, Subtask_1.oddDigitsCounter(2147483647));
        assertEquals(1, Subtask_1.oddDigitsCounter(-212));
        assertEquals(0, Subtask_1.oddDigitsCounter(0));
        assertEquals(1, Subtask_1.oddDigitsCounter(-9));
        assertEquals(1, Subtask_1.oddDigitsCounter(9));
    }

    @Test
    @DisplayName("Тест: Вывод ряда Фибоначчи")
    public void testShowFibonacci() {
        assertEquals("[1, 2, 3, 5, 8, 13]", Subtask_1.showFibonacci(6));
        assertEquals("[]", Subtask_1.showFibonacci(0));
        assertEquals("[1, 2]", Subtask_1.showFibonacci(2));
        assertEquals("[1, 2]", Subtask_1.showFibonacci(-2));
    }

    @Test
    @DisplayName("Тест: Ряд чисел с шагом")
    public void testLineMinMaxStepNumbers() {
        assertEquals("1 3 5", Subtask_1.lineMinMaxStepNumbers(1, 5, 2));
        assertEquals("-3 -1 1 3 5", Subtask_1.lineMinMaxStepNumbers(-3, 5, 2));
        assertEquals("10 12 14 16", Subtask_1.lineMinMaxStepNumbers(10, 16, 2));
        assertThrows(IllegalArgumentException.class, () -> Subtask_1.lineMinMaxStepNumbers(10, 5, 2));
    }

    @Test
    @DisplayName("Тест: Переворот числа")
    public void testReverseNumber() {
        assertEquals(321, Subtask_1.reverseNumber(123));
        assertEquals(77, Subtask_1.reverseNumber(77));
        assertEquals(5, Subtask_1.reverseNumber(5));
        assertEquals(0, Subtask_1.reverseNumber(0));
        assertThrows(IllegalArgumentException.class, () -> Subtask_1.reverseNumber(-101));
    }
}
