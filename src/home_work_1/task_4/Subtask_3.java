package home_work_1.task_4;

import java.util.Scanner;

public class Subtask_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number1: ");
        int num1 = in.nextInt();
        System.out.print("Input number2: ");
        int num2 = in.nextInt();

        if (num2 != 0) {
            int quotient = calculateQuotient(num1, num2);
            int remainder = calculateRemainder(num1, num2);

            if (remainder == 0) {
                System.out.println("number1 is divided by number2");
                System.out.println("quotient: " + quotient);
            } else {
                System.out.println("number1 is NOT divided by number2");
                System.out.println("quotient: " + quotient);
                System.out.println("remainder: " + remainder);
            }
        } else {
            System.out.println("Error: division by zero");
        }
        in.close();
    }

    // Метод для вычисления частного
    public static int calculateQuotient(int num1, int num2) {
        return num1 / num2;
    }

    // Метод для вычисления остатка
    public static int calculateRemainder(int num1, int num2) {
        return num1 % num2;
    }
}
