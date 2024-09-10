package test.home_work_2.arrays.task_3;

import home_work_2.arrays.task_3.IArraysOperation;
import home_work_2.arrays.task_3.WhileOperation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class WhileOperationTest {

    private final IArraysOperation operation = new WhileOperation();

    @Test
    @DisplayName("Тестирование всех элементов массива для метода allElementsToConsole")
    void Test1() {
        int[] array = {1, 2, 3, 4, 5};
        String expected = "1 2 3 4 5";
        assertEquals(expected, operation.allElementsToConsole(array));
    }

    @Test
    @DisplayName("Тестирование всех элементов массива с одним элементом для метода allElementsToConsole")
    void Test2() {
        int[] array = {42};
        String expected = "42";
        assertEquals(expected, operation.allElementsToConsole(array));
    }

    @Test
    @DisplayName("Тестирование всех элементов пустого массива для метода allElementsToConsole")
    void Test3() {
        int[] array = {};
        String expected = "";
        assertEquals(expected, operation.allElementsToConsole(array));
    }

    @Test
    @DisplayName("Тестирование каждого второго элемента массива для метода everySecondElementsToConsole")
    void Test4() {
        int[] array = {1, 2, 3, 4, 5};
        String expected = "2 4";
        assertEquals(expected, operation.everySecondElementsToConsole(array));
    }

    @Test
    @DisplayName("Тестирование каждого второго элемента массива с одним элементом для метода everySecondElementsToConsole")
    void Test5() {
        int[] array = {42};
        assertNull(operation.everySecondElementsToConsole(array));
    }

    @Test
    @DisplayName("Тестирование каждого второго элемента пустого массива для метода everySecondElementsToConsole")
    void Test6() {
        int[] array = {};
        String expected = "";
        assertEquals(expected, operation.everySecondElementsToConsole(array));
    }

    @Test
    @DisplayName("Тестирование переворота всех элементов массива для метода reversAllElementsToConsole")
    void Test7() {
        int[] array = {1, 2, 3, 4, 5};
        String expected = "5 4 3 2 1";
        assertEquals(expected, operation.reversAllElementsToConsole(array));
    }

    @Test
    @DisplayName("Тестирование переворота всех элементов массива с одним элементом для метода reversAllElementsToConsole")
    void Test8() {
        int[] array = {42};
        String expected = "42";
        assertEquals(expected, operation.reversAllElementsToConsole(array));
    }

    @Test
    @DisplayName("Тестирование переворота всех элементов пустого массива для метода reversAllElementsToConsole")
    void Test9() {
        int[] array = {};
        String expected = "";
        assertEquals(expected, operation.reversAllElementsToConsole(array));
    }
}
