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

        int[] defaultArray = ArraysUtils.arrayRandom(10,50);

        System.out.println("Массив для расчетов: " + Arrays.toString(defaultArray));
        System.out.println("\nСумма четных положительных элементов массива: " + sumOfEvenPositiveElements(defaultArray));
        System.out.println("\nМаксимальный из элементов массива с четными индексами: " + maxElementEvenIndex(defaultArray));
        System.out.println("\nЭлементы массива, которые меньше среднего арифметического: " + elementsLessAverage(defaultArray));
        System.out.println("\nНайти два наименьших (минимальных) элемента массива: " + Arrays.toString(twoMinimalElements(defaultArray)));
        System.out.println("\nСжать массив, удалив элементы, принадлежащие интервалу -27 : 27: " + Arrays.toString(compressArray(defaultArray,-27,27)));
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
        int maxElement = array[0];

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        return maxElement;
    }

    //  2.4.3. Элементы массива, которые меньше среднего арифметического
    public static String elementsLessAverage (int[] array) {
        StringBuilder builder = new StringBuilder();
        int sum = 0;
        double average;

        // Вычисление суммы элементов
        for (int value : array) {
            sum += value;
        }

        // Вычисление среднего
        average = (double) sum / array.length;

        // Поиск и добавление элементов, меньших среднего
        for (int value : array) {
            if (value < average) {
                builder.append(value).append(" ");
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

        return new int[]{min1, min2};
    }

    //  2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
    public static int[] compressArray(int[] array, int startInterval, int endInterval) {

        int[] newArray = new int[array.length];     // Создаем копию исходного массива
        System.arraycopy(array, 0, newArray, 0, array.length);

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
            int temp = Math.abs(num); // Используем абсолютное значение числа
            while (temp > 0) {
                summ += temp % 10; // Добавляем последнюю цифру числа к сумме
                temp /= 10; // Удаляем последнюю цифру числа
            }
        }

        return summ;
    }
}