package test.home_work_2.arrays.task_3;

import home_work_2.arrays.task_3.DoWhileOperation;
import home_work_2.arrays.task_3.IArraysOperation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoWhileOperationTest {

    private final IArraysOperation operation = new DoWhileOperation();

    @Test
    @DisplayName("Тест метода allElementsToConsole с несколькими элементами")
    public void test1() {
        int[] array = {1, 2, 3, 4, 5};
        String expected = "1 2 3 4 5";
        String result = operation.allElementsToConsole(array);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Тест метода allElementsToConsole с одним элементом")
    public void test2() {
        int[] array = {1};
        String expected = "1";
        String result = operation.allElementsToConsole(array);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Тест метода everySecondElementsToConsole с несколькими элементами")
    public void test3() {
        int[] array = {1, 2, 3, 4, 5, 6};
        String expected = "2 4 6";
        String result = operation.everySecondElementsToConsole(array);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Тест метода everySecondElementsToConsole с одним элементом")
    public void test4() {
        int[] array = {1};
        String result = operation.everySecondElementsToConsole(array);
        assertNull(result);
    }

    @Test
    @DisplayName("Тест метода reversAllElementsToConsole с несколькими элементами")
    public void test5() {
        int[] array = {1, 2, 3, 4, 5};
        String expected = "5 4 3 2 1";
        String result = operation.reversAllElementsToConsole(array);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Тест метода reversAllElementsToConsole с одним элементом")
    public void test6() {
        int[] array = {1};
        String expected = "1";
        String result = operation.reversAllElementsToConsole(array);
        assertEquals(expected, result);
    }
}
