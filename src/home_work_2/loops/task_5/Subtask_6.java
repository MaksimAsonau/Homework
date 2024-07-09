/*
1.5.6. Переворот числа
 */

package home_work_2.loops.task_5;

import java.util.Scanner;

public class Subtask_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ввод числа с клавиатуры
        System.out.print("Введите число: ");
        int n = in.nextInt();

        int reversedNumber = 0;                             // Переменная для хранения числа с обратным порядком цифр


        while (n > 0) {                                     // Цикл для обратного формирования числа по порядку цифр
            reversedNumber = reversedNumber * 10 + n % 10;  // Добавляем текущую цифру в конец reversedNumber
            n = n / 10;                                     // Убираем последнюю цифру из n
        }

        System.out.println("Число с обратным порядком цифр: " + reversedNumber);

        in.close();
    }
}

