/*
1.5.4. Ряд Фибоначчи
 */

package home_work_2.loops.task_5;

import java.util.Scanner;
import java.util.Arrays;

public class Subtask_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Сколько чисел ряда Фибоначчи вывести на экран?");
        int b = in.nextInt();

        System.out.println("Число Фибоначчи до " + b + " числа: " + showFibonacci(b));
        in.close();
    }
    public static String showFibonacci(int num) {
        int numToEndWith = Math.abs(num);

        int[] fibArray = new int[numToEndWith];

        if (numToEndWith >= 1) {
            fibArray[0] = 1;
        }
        if (numToEndWith >= 2) {
            fibArray[1] = 2;
        }

        for (int i = 2; i < numToEndWith; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        return Arrays.toString(fibArray);
    }
}


