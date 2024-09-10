package home_work_1.task_4;

import java.util.Scanner;

public class Subtask_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number2: ");
        int num2 = in.nextInt();
        System.out.print("Enter number3: ");
        int num3 = in.nextInt();
        in.close();

        System.out.println(areNumbersUnique(num1, num2, num3)
                ? "Среднее число из введенных: " + getMiddleNumber(num1, num2, num3)
                : "Введеные числа не уникальны");
    }

    public static int getMiddleNumber(int num1, int num2, int num3) {
        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);
        return num1 + num2 + num3 - max - min;
    }

    public static boolean areNumbersUnique(int num1, int num2, int num3) {
        return num1 != num2 && num1 != num3 && num2 != num3;
    }
}

