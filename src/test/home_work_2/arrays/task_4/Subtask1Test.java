package test.home_work_2.arrays.task_4;

import home_work_2.arrays.task_4.Subtask_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Subtask1Test {

    int[] arrayPositive = {28, 0, 28, 39, 1, 17, 31, 33, 29, 48};
    int[] arrayNegative = {-28, 0, -28, -39, -1, -17, -31, -33, -29, -48};
    int[] arrayRandom = {-28, 0, 28, 39, -1, 17, -31, 33, 29, -48};
    int[] arrayEmpty = {};
    int[] arrayNull = null;

    @Test
    @DisplayName("Тестирование суммы четных положительных элементов массива")
    void testSumOfEvenPositiveElements() {
        assertEquals(104, Subtask_1.sumOfEvenPositiveElements(arrayPositive));
        assertEquals(0, Subtask_1.sumOfEvenPositiveElements(arrayNegative));
        assertEquals(28, Subtask_1.sumOfEvenPositiveElements(arrayRandom));
        assertEquals(0, Subtask_1.sumOfEvenPositiveElements(arrayEmpty));
        assertThrows(NullPointerException.class, () -> Subtask_1.sumOfEvenPositiveElements(arrayNull));
    }

    @Test
    @DisplayName("Тестирование максимального элемента с четными индексами")
    void testMaxElementEvenIndex() {
        assertEquals(31, Subtask_1.maxElementEvenIndex(arrayPositive));
        assertEquals(-1, Subtask_1.maxElementEvenIndex(arrayNegative));
        assertEquals(29, Subtask_1.maxElementEvenIndex(arrayRandom));
        assertThrows(NullPointerException.class, () -> Subtask_1.maxElementEvenIndex(arrayNull));
    }

    @Test
    @DisplayName("Тестирование элементов массива, которые меньше среднего арифметического")
    void testElementsLessAverage() {
        assertEquals("0 1 17", Subtask_1.elementsLessAverage(arrayPositive));
        assertEquals("-28 -28 -39 -31 -33 -29 -48", Subtask_1.elementsLessAverage(arrayNegative));
        assertEquals("-28 0 -1 -31 -48", Subtask_1.elementsLessAverage(arrayRandom));
        assertEquals("", Subtask_1.elementsLessAverage(arrayEmpty));
        assertThrows(NullPointerException.class, () -> Subtask_1.elementsLessAverage(arrayNull));
    }

    @Test
    @DisplayName("Тестирование двух наименьших элементов массива")
    void testTwoMinimalElements() {
        assertArrayEquals(new int[]{0, 1}, Subtask_1.twoMinimalElements(arrayPositive));
        assertArrayEquals(new int[]{-48, -39}, Subtask_1.twoMinimalElements(arrayNegative));
        assertArrayEquals(new int[]{-48, -31}, Subtask_1.twoMinimalElements(arrayRandom));
        assertThrows(NullPointerException.class, () -> Subtask_1.twoMinimalElements(arrayNull));
    }

    @Test
    @DisplayName("Тестирование сжатия массива, удаляя элементы в интервале")
    void testCompressArray() {
        assertArrayEquals(new int[]{28, 28, 39, 31, 33, 29, 48, 0, 0, 0},
                Subtask_1.compressArray(arrayPositive, -27, 27));
        assertArrayEquals(new int[]{-28, -28, -39, -31, -33, -29, -48, 0, 0, 0},
                Subtask_1.compressArray(arrayNegative, -27, 27));
        assertArrayEquals(new int[]{-28, 28, 39, -31, 33, 29, -48, 0, 0, 0},
                Subtask_1.compressArray(arrayRandom, -27, 27));
        assertArrayEquals(new int[]{},
                Subtask_1.compressArray(arrayEmpty, -27, 27));
        assertThrows(NullPointerException.class, () -> Subtask_1.compressArray(arrayNull, -27, 27));
    }

    @Test
    @DisplayName("Тестирование суммы цифр массива")
    void testSumDigits() {
        assertEquals(74,
                Subtask_1.sumDigits(arrayPositive));
        assertEquals(74,
                Subtask_1.sumDigits(arrayNegative));
        assertEquals(74,
                Subtask_1.sumDigits(arrayRandom));
        assertEquals(0, Subtask_1.sumDigits(arrayEmpty));
        assertThrows(NullPointerException.class, () -> Subtask_1.sumDigits(arrayNull));
    }
}
