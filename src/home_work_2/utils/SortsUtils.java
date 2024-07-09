/*
4.1.1. Написать метод public static void sort(int[] arr). Данный метод будет сортировать переданный ему массив
при помощи алгоритма пузырьковая сортировка.
4.1.2. Написать метод public static void shake(int[] arr). Данный метод будет сортировать переданный ему массив
при помощи алгоритма шейкерная сортировка.
 */

package home_work_2.utils;

public class SortsUtils {


//Сортировка массива методом пузырьковой сортировки.

    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];  // меняем место arr[j] и arr[j+1]
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {     // Если на данной итерации не было перестановок - массив уже отсортирован
                break;
            }
        }
    }

// Сортировка массива методом шейкерной сортировки

    public static void shake(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        boolean swapped = true;

        while (left < right && swapped) {
            swapped = false;

            for (int i = left; i < right; i++) {    // Проход слева направо
                if (arr[i] > arr[i + 1]) {

                    int temp = arr[i];  // меняем местами arr[i] и arr[i+1]
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            right--;

            for (int i = right; i > left; i--) {    // Проход справа налево
                if (arr[i] < arr[i - 1]) {

                    int temp = arr[i];  // меняем местами arr[i] и arr[i-1]
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swapped = true;
                }
            }
            left++;
        }
    }
}

