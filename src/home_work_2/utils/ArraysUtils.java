/*
2.1. Создать класс ArraysUtils. В этом классе не должно быть main метода. В этом классе написать следующие методы:
2.1.1. Написать метод public static int[] arrayFromConsole(). Данный метод размер массива и каждый его элемент
запрашивает у пользователя через консоль.
2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion). Данный метод принимает
два аргумента. Первый (size) указывает размер массива который мы хотим получить. Второй (maxValueExclusion)
указывает до какого числа генерировать рандомные числа.
 */

package home_work_2.utils;

import java.util.Scanner;
import java.util.Random;

public class ArraysUtils {

    public static int[] arrayFromConsole() {            // Метод для создания массива, элементы которого
        Scanner scanner = new Scanner(System.in);       // вводит пользователь через консоль

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        scanner.nextLine();


        int[] array = new int[size];                    // Создаем массив заданного размера

        while (true) {                                  // Вводим элементы массива через запятую
            System.out.print("Введите элементы массива через запятую: ");
            String input = scanner.nextLine();
            String[] elements = input.split(",");

            if (elements.length == size) {              // Проверка количества введенных элементов и размера массива
                for (int i = 0; i < size; i++) {
                    array[i] = Integer.parseInt(elements[i].trim());
                }
                break;
            } else {
                System.out.println("Количество введенных элементов не соответствует размеру массива.");
            }
        }

        return array;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) { // Метод для создания массива заданного размера
        Random random = new Random();                     //с случайными числами в диапазоне от 0 до maxValueExclusion

        int[] array = new int[size];                      // Создаем массив заданного размера

        for (int i = 0; i < size; i++) {                  // Заполняем массив случайными числами
            array[i] = random.nextInt(maxValueExclusion);
        }

        return array;
    }


    // метод для вывода в строку одномерного массива

    public static String arrayToString(int[] oneDimensionalArray) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < oneDimensionalArray.length; i++) {
            builder.append(oneDimensionalArray[i]);
            if (i < oneDimensionalArray.length - 1) {
                builder.append(", ");
            }
        }

        return builder.toString();
    }
}