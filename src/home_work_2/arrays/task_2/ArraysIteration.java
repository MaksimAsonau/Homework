/*
2.2 Создать класс ArraysIteration. В этом классе написать перебор (итерирование) массива при помощи do....while, while,
for, foreach. Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив.
Все задачи в одном классе, в отдельных методах, в каждом методе используется 4 разных цикла. Должно получиться 3 метода:
2.2.1. Вывести все элементы в консоль.
2.2.2. Вывести каждый второй элемент массива в консоль.
2.2.3. Вывести все элементы массива в консоль в обратном порядке.
 */

package home_work_2.arrays.task_2;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole();
        System.out.println();
        allElementsToConsole(container);
        System.out.println();
        everySecondElementsToConsole(container);
        System.out.println();
        reversAllElementsToConsole(container);
    }

    private static void allElementsToConsole(int[] array){
        System.out.println("Выводми все элементы в консоль:");

        int i = 0;                                  // Используем цикл do...while
        do {
            System.out.print(array[i] + " ");
            i++;
        }while (i < array.length);
        System.out.println();

        i = 0;                                      // Используем цикл while
        while (i < array.length){
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();

        for (i = 0; i < array.length; i++){         // Используем цикл for
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int element : array) {                 // Используем цикл foreach
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void everySecondElementsToConsole(int[] array) {
        System.out.println("Выводим каджый второй элемент массива в консоль:");

        int i = 1;                                  // Используем цикл do...while
        do {
            if (i < array.length) {
                System.out.print(array[i] + " ");
            }
            i += 2;
        } while (i < array.length);
        System.out.println();

        i = 1;                                      // Используем цикл while
        while (i < array.length){
            System.out.print(array[i] + " ");
            i += 2;
        }
        System.out.println();

        for (i = 1; i < array.length; i += 2){      // Используем цикл for
            System.out.print(array[i] + " ");
        }
        System.out.println();

        i = 1;                                      // Используем цикл foreach
        for (int element : array) {
            if (i % 2 == 0){
                System.out.print(element + " ");
            }
            i++;
        }
        System.out.println();
    }

    private static void reversAllElementsToConsole(int[] array) {

        System.out.println("Выводим все элементы массива в консоль в обратном порядке:");

        int i = array.length - 1;                   // Используем цикл do...while
        do {
            System.out.print(array[i] + " ");
            i--;
        }while (i >= 0);
        System.out.println();

        i = array.length - 1;                       // Используем цикл while
        while (i >= 0){
            System.out.print(array[i] + " ");
            i--;
        }
        System.out.println();

        for (i = array.length - 1; i >= 0; i--){    // Используем цикл while
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int[] mirroredArray = new int[array.length];        // Используем цикл foreach
        for (i = 0; i < array.length; i++) {                // Создаем новый массив с длинной исходного массива
            mirroredArray[i] = array[array.length - 1 - i]; // Заполняем массив элементами исходного массива, но
        }                                                   // в обратном порядке
        for (int element : mirroredArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
