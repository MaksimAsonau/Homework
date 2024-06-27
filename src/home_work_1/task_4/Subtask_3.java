package home_work_1.task_4;

import java.util.Scanner;

public class Subtask_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input number1: ");
        int num1 = in.nextInt();
        System.out.print("Input number2: ");
        int num2 = in.nextInt();

        if (num2 != 0) {   // второе число не 0
            int quotient = num1 / num2;     // частоное
            int remainder = num1 % num2;    // остаток

            if (remainder == 0) {
                System.out.println("number1 is divided by number2");
                System.out.println("quotient: " + quotient);
            } else {
                System.out.println("number1 is NOT divided by number2");
                System.out.println("quotient: " + quotient);
                System.out.println("remainder: " + remainder);
            }
        } else {
            System.out.print("Error: division by zero");  // если второе число 0
        }

        in.close();
    }
}
