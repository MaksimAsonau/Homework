/*
1.5.3. Посчитать четные и нечетные цифры числа
 */

package home_work_2.loops.task_5;

import java.util.Scanner;

public class Subtask_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите натуральное число: ");
        int number = in.nextInt();
        int[] result = countEvenOddDigits(number);

        System.out.println("Четных цифр: " + result[0]);
        System.out.println("Нечетных цифр: " + result[1]);

        in.close();
    }

    public static int[] countEvenOddDigits(int number) {
        int even = 0;                                   // Кол-во четных
        int odd = 0;                                    // Кол-во нечетных

        while (number > 0) {                            // Извлекаем и проверяем цифры пока число больше нуля
            int digit = number % 10;                    // Извлекаем последнюю цифру числа

            if (digit % 2 == 0) {
                even++;                                 // Увеличиваем кол-во четных
            } else {
                odd++;                                  // Увеличиваем кол-во нечетных
            }

            number = number / 10;                       // Удаляем последнюю цифру числа
        }

        return new int[]{even, odd};
    }
}

