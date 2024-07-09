/*
1.5.1. Найти наибольшую цифру натурального числа
 */

package home_work_2.loops.task_5;

import java.util.Scanner;

public class Subtask_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int a = in.nextInt();
        int m = findMaxDigit(a);
        System.out.println("Наибольшая цифра в числе: " + m);
        in.close();
    }

    public static int findMaxDigit(int a) {

        int m = a % 10;                     // Предполагаем, что последняя цифра числа и есть максимальная.
                                            // Извлечем ее с помощью операции нахождения остатка при делении на 10.

        a = a / 10;                         // Поскольку последнюю цифру мы уже учли, то избавимся от нее
                                            // с помощью операции деления нацело на 10.
        while (a > 0) {                     // Цикл для извлечения и сравнения каждой цифры числа
            int digit = a % 10;             // Извлекаем последнюю цифру числа
            if (digit > m) {
                m = digit;                  // Обновляем максимальную цифру, если текущая цифра больше
            }
            a = a / 10;                     // Избавляемся от последней цифры
        }
        return m;
    }
}
