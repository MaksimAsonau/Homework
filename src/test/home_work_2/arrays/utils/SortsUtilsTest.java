package test.home_work_2.arrays.utils;

import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortsUtilsTest {
    private final int[] arrayPositive = {28, 0, 28, 39, 1, 17, 31, 33, 29, 48};
    private final int[] arrayNegative = {-28, 0, -28, -39, -1, -17, -31, -33, -29, -48};
    private final int[] arrayRandom = {-28, 0, 28, 39, -1, 17, -31, 33, 29, -48};
    private final int[] arrayEmpty = {};
    private final int[] arrayNull = null;

    @Test
    public void testBubbleSortPositive() {
        int[] expected = {0, 1, 17, 28, 28, 29, 31, 33, 39, 48};
        assertArrayEquals(expected, SortsUtils.sort(arrayPositive));
    }

    @Test
    public void testBubbleSortNegative() {
        int[] expected = {-48, -39, -33, -31, -29, -28, -28, -17, -1, 0};
        assertArrayEquals(expected, SortsUtils.sort(arrayNegative));
    }

    @Test
    public void testBubbleSortRandom() {
        int[] expected = {-48, -31, -28, -1, 0, 17, 28, 29, 33, 39};
        assertArrayEquals(expected, SortsUtils.sort(arrayRandom));
    }

    @Test
    public void testBubbleSortEmpty() {
        assertArrayEquals(arrayEmpty, SortsUtils.sort(arrayEmpty));
    }

    @Test
    public void testBubbleSortNull() {
        assertNull(SortsUtils.sort(arrayNull));
    }

    @Test
    public void testShakeSortPositive() {
        int[] expected = {0, 1, 17, 28, 28, 29, 31, 33, 39, 48};
        assertArrayEquals(expected, SortsUtils.shake(arrayPositive));
    }

    @Test
    public void testShakeSortNegative() {
        int[] expected = {-48, -39, -33, -31, -29, -28, -28, -17, -1, 0};
        assertArrayEquals(expected, SortsUtils.shake(arrayNegative));
    }

    @Test
    public void testShakeSortRandom() {
        int[] expected = {-48, -31, -28, -1, 0, 17, 28, 29, 33, 39};
        assertArrayEquals(expected, SortsUtils.shake(arrayRandom));
    }

    @Test
    public void testShakeSortEmpty() {
        assertArrayEquals(arrayEmpty, SortsUtils.shake(arrayEmpty));
    }

    @Test
    public void testShakeSortNull() {
        assertNull(SortsUtils.shake(arrayNull));
    }
}
