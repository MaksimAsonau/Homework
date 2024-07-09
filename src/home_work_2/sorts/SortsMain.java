/*
4.2. Создать класс SortsMain. Все проверки пишутся в main.
4.2.1. После каждого теста в консоль вы должны распечатать сообщение формата "[Какой массив был до сортировки] ->
[Каким стал массив после сортировки]". Для преобразования массива в текст можно использовать класс Arrays.
4.2.2. Для тестов используем предварительно созданные массивы:
4.2.2.1. new int[]{1,2,3,4,5,6}
4.2.2.2. new int[]{1,1,1,1}
4.2.2.3. new int[]{9,1,5,99,9,9}
4.2.2.4. new int[]{}
4.2.2.5. new int[]{6,5,4,3,2,1}
4.2.2 После предварительных тестов пишем тест с рандомным заполнением массива. Вызывая ранее созданный метод
arrayRandom (ArraysUtils.arrayRandom(50, 100)) получить массив. Отсортировать.
4.2.3 После теста с рандомно заполненным массивом пишем тест с массивом полученным через консоль. Вызывая ранее
созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив. Отсортировать.
 */

package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

public class SortsMain {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        System.out.println("\nМассив до сортировки \t" + ArraysUtils.arrayToString(array));
        SortsUtils.sort(array);
        System.out.println("Пузырьковая сортировка \t" + ArraysUtils.arrayToString(array));

        array = new int[]{1,2,3,4,5,6};
        System.out.println("Массив до сортировки \t" + ArraysUtils.arrayToString(array));
        SortsUtils.shake(array);
        System.out.println("Шейкерная сортировка \t" + ArraysUtils.arrayToString(array));
        System.out.println();

        array = new int[]{1,1,1,1};
        System.out.println("Массив до сортировки \t" + ArraysUtils.arrayToString(array));
        SortsUtils.sort(array);
        System.out.println("Пузырьковая сортировка \t" + ArraysUtils.arrayToString(array));

        array = new int[]{1,1,1,1};
        System.out.println("Массив до сортировки \t" + ArraysUtils.arrayToString(array));
        SortsUtils.shake(array);
        System.out.println("Шейкерная сортировка \t" + ArraysUtils.arrayToString(array));
        System.out.println();

        array = new int[]{9,1,5,99,9,9};
        System.out.println("Массив до сортировки \t" + ArraysUtils.arrayToString(array));
        SortsUtils.sort(array);
        System.out.println("Пузырьковая сортировка \t" + ArraysUtils.arrayToString(array));

        array = new int[]{9,1,5,99,9,9};
        System.out.println("Массив до сортировки \t" + ArraysUtils.arrayToString(array));
        SortsUtils.shake(array);
        System.out.println("Шейкерная сортировка \t" + ArraysUtils.arrayToString(array));
        System.out.println();

        array = new int[]{};
        System.out.println("Массив до сортировки \t" + ArraysUtils.arrayToString(array));
        SortsUtils.sort(array);
        System.out.println("Пузырьковая сортировка \t" + ArraysUtils.arrayToString(array));

        array = new int[]{};
        System.out.println("Массив до сортировки \t" + ArraysUtils.arrayToString(array));
        SortsUtils.shake(array);
        System.out.println("Шейкерная сортировка \t" + ArraysUtils.arrayToString(array));
        System.out.println();

        array = new int[]{6,5,4,3,2,1};
        System.out.println("Массив до сортировки \t" + ArraysUtils.arrayToString(array));
        SortsUtils.sort(array);
        System.out.println("Пузырьковая сортировка \t" + ArraysUtils.arrayToString(array));

        array = new int[]{6,5,4,3,2,1};
        System.out.println("Массив до сортировки \t" + ArraysUtils.arrayToString(array));
        SortsUtils.shake(array);
        System.out.println("Шейкерная сортировка \t" + ArraysUtils.arrayToString(array));
        System.out.println();

        array = ArraysUtils.arrayRandom(10, 100);
        System.out.println("Массив до сортировки \t" + ArraysUtils.arrayToString(array));
        SortsUtils.sort(array);
        System.out.println("Пузырьковая сортировка \t" + ArraysUtils.arrayToString(array));

        array = ArraysUtils.arrayRandom(10, 100);
        System.out.println("Массив до сортировки \t" + ArraysUtils.arrayToString(array));
        SortsUtils.shake(array);
        System.out.println("Шейкерная сортировка \t" + ArraysUtils.arrayToString(array));
        System.out.println();

        array = ArraysUtils.arrayFromConsole();
        System.out.println("Массив до сортировки \t" + ArraysUtils.arrayToString(array));
        SortsUtils.sort(array);
        System.out.println("Пузырьковая сортировка \t" + ArraysUtils.arrayToString(array));

        array = ArraysUtils.arrayFromConsole();
        System.out.println("Массив до сортировки \t" + ArraysUtils.arrayToString(array));
        SortsUtils.shake(array);
        System.out.println("Шейкерная сортировка \t" + ArraysUtils.arrayToString(array));
    }
}