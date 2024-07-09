/*
2.4 Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных
методах. Для получения массивов вызывать ранее созданный метод arrayRandom (ArraysUtils.arrayRandom(50, 100))
2.4.1. Сумма четных положительных элементов массива
2.4.2. Максимальный из элементов массива с четными индексами
2.4.3. Элементы массива, которые меньше среднего арифметического
2.4.4. Найти два наименьших (минимальных) элемента массива
2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
2.4.6. Сумма цифр массива
 */

package home_work_2.arrays.task_4;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

public class Subtask_1 {
    public static void main(String[] args) {

        int[] defaultArray = ArraysUtils.arrayRandom(5,50);

        System.out.println("Массив для расчетов: " + Arrays.toString(defaultArray));
        System.out.println("\nСумма четных положительных элементов массива: " + sumOfEvenPositiveElements(defaultArray));
        System.out.println("\nМаксимальный из элементов массива с четными индексами: " + maxElementEvenIndex(defaultArray));
        System.out.println("\nЭлементы массива, которые меньше среднего арифметического: " + elementsLessAverage(defaultArray));
        System.out.println("\nНайти два наименьших (минимальных) элемента массива: " + Arrays.toString(twoMinimalElements(defaultArray)));
        System.out.println("\nСжать массив, удалив элементы, принадлежащие интервалу 7 - 27: " + Arrays.toString(compressArray(defaultArray,7,27)));
        System.out.println("\nСумма цифр массива: " + sumDigits(defaultArray));
    }

    //  2.4.1. Сумма четных положительных элементов массива
    public static int sumOfEvenPositiveElements(int[] array) {
        int sum = 0;

        for (int value : array) {
            if (value > 0 && value % 2 == 0) {
                sum += value;
            }
        }

        return sum;
    }

    //  2.4.2. Максимальный из элементов массива с четными индексами
    public static int maxElementEvenIndex(int[] array) {
        int maxElement = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0 && array[i] > maxElement){
                maxElement = array[i];
            }
        }

        return maxElement;
    }

    //  2.4.3. Элементы массива, которые меньше среднего арифметического
    public static String elementsLessAverage (int[] array) {
        StringBuilder builder = new StringBuilder();
        int sum = 0;
        double average ;

        for (int value : array) {
            sum += value;
        }
        average = 1.0 * sum / array.length;

        for (int value : array) {
            if (value < average) {
                builder.append(value);
                builder.append(" ");
            }
        }

        return builder.toString().trim();
    }

    //  2.4.4. Найти два наименьших (минимальных) элемента массива
    public static int[] twoMinimalElements(int[] array) {
        int min1 = Integer.MAX_VALUE; // Первый минимальный элемент
        int min2 = Integer.MAX_VALUE; // Второй минимальный элемент

        for (int num : array) {
            if (num < min1) {
                min2 = min1; // Старый минимальный становится вторым
                min1 = num;  // Новый минимальный
            } else if (num < min2) {
                min2 = num; // Обновляем второй минимальный
            }
        }

        int[] minimalElements = {min1, min2};
        return minimalElements;
    }

    //  2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
    public static int[] compressArray(int[] array, int startInterval, int endInterval) {

        int[] newArray = new int[array.length];     // Создаем копию исходного массива
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        for (int i = 0; i < newArray.length; i++) {  // Проходим по копии массива и заменяем элементы, попадающие в интервал, на 0
            if (newArray[i] >= startInterval && newArray[i] <= endInterval) {
                newArray[i] = 0;
            }
        }

        int newIndex = 0;                                   // Сдвигаем оставшиеся элементы влево
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] != 0) {
                newArray[newIndex] = newArray[i];
                newIndex++;
            }
        }

        for (int i = newIndex; i < newArray.length; i++) {    // Заполняем конец массива нулями
            newArray[i] = 0;
        }

        return newArray;
    }

    //  2.4.6. Сумма цифр массива
    public static int sumDigits(int[] array) {
        int summ = 0;

        for (int num : array) {
            int temp = num; // сохраняем исходное число во временную переменную
            while (temp > 0) {
                summ += temp % 10; // добавляем последнюю цифру числа к сумме
                temp /= 10; // удаляем последнюю цифру числа
            }
        }

        return summ;
    }
}