/*
1.5.5. Вывести ряд чисел в диапазоне с шагом
 */

package home_work_2.loops.task_5;

import java.util.Scanner;

public class Subtask_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите минимум: ");
        int min = in.nextInt();

        System.out.print("Введите максимум: ");
        int max = in.nextInt();

        System.out.print("Введите шаг: ");
        int step = in.nextInt();

        if (step <= 0) {         // Проверка на корректный ввода шага
            System.out.println("Шаг должен быть положительным числом!");
            return;
        }

        for (int i = min; i <= max; i += step) {
            System.out.print(i + " ");
        }

        in.close();
    }
}

