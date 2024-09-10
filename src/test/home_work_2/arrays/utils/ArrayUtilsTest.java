package test.home_work_2.arrays.utils;

import home_work_2.utils.ArraysUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

    @Test
    @DisplayName("Проверка генерирования массива с рандомными значениями в ячейках")
    public void test1() {
        int[] arr = ArraysUtils.arrayRandom(10, 50);

        Assertions.assertEquals(10, arr.length);

        for (int value : arr) {
            Assertions.assertTrue(value >= 0 && value < 50);
        }
    }

    @Test
    @DisplayName("Печать массива")
    public void test2() {
        int[] arr = {1, 2, 3};
    }
}
