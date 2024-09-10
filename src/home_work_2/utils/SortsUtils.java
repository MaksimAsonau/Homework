/*
4.1.1. Написать метод public static void sort(int[] arr). Данный метод будет сортировать переданный ему массив
при помощи алгоритма пузырьковая сортировка.
4.1.2. Написать метод public static void shake(int[] arr). Данный метод будет сортировать переданный ему массив
при помощи алгоритма шейкерная сортировка.
 */

package home_work_2.utils;

public class SortsUtils {


//Сортировка массива методом пузырьковой сортировки.

    public static int[] sort(int[] arr) {
        if (arr == null) return null; // Проверка на null

        int[] sortedArray = arr.clone(); // Создаем копию массива
        int n = sortedArray.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int temp = sortedArray[j];  // Меняем место sortedArray[j] и sortedArray[j+1]
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) { // Если на данной итерации не было перестановок - массив уже отсортирован
                break;
            }
        }

        return sortedArray;
    }

// Сортировка массива методом шейкерной сортировки

    public static int[] shake(int[] arr) {
        if (arr == null) return null; // Проверка на null

        int[] sortedArray = arr.clone(); // Создаем копию массива
        int left = 0;
        int right = sortedArray.length - 1;
        boolean swapped = true;

        while (left < right && swapped) {
            swapped = false;

            for (int i = left; i < right; i++) { // Проход слева направо
                if (sortedArray[i] > sortedArray[i + 1]) {
                    int temp = sortedArray[i];  // Меняем местами sortedArray[i] и sortedArray[i+1]
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    swapped = true;
                }
            }
            right--;

            for (int i = right; i > left; i--) { // Проход справа налево
                if (sortedArray[i] < sortedArray[i - 1]) {
                    int temp = sortedArray[i];  // Меняем местами sortedArray[i] и sortedArray[i-1]
                    sortedArray[i] = sortedArray[i - 1];
                    sortedArray[i - 1] = temp;
                    swapped = true;
                }
            }
            left++;
        }

        return sortedArray;
    }
}

