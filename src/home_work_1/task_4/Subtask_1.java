package home_work_1.task_4;

/*
4.1 Определить нечётное число
Из двух случайных чисел, одно из которых четное, а другое нечетное, определить и вывести на экран нечетное число.
 */

import java.util.Random;

public class Subtask_1 {

    public static void main(String[] args) {

        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);

        if ((!isOdd(num1) && !isOdd(num2)) || (isOdd(num1) && isOdd(num2))) {
            num1 += 1;
        }

        System.out.println("Your number: " + (!isOdd(num1) ? num2 : num1));
    }

    public static boolean isOdd(int x) {
        return Math.abs(x % 2) == 1;
    }
}
