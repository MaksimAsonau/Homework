package home_work_1.task_4;

import java.util.Scanner;

public class Subtask_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int num1 = in.nextInt();

        System.out.print("Enter number2: ");
        int num2 = in.nextInt();

            if (num2 == num1) {   // проверка на уникальность второго числа
                System.out.println("this number is already in use. Read tech.task");
                return;
            }

        System.out.print("Enter number3: ");
        int num3 = in.nextInt();

            if ((num3 == num1) || (num3 == num2)) {  // проверка на уникальность третьего числа
                System.out.println("this number is already in use. Read tech.task");
                return;
            }

        if ((num2 < num1 && num1 < num3) || (num2 > num1 && num1 > num3)) {                 //      10   5   15
                System.out.println("Your number is: " + num1);                              //      15   5   10

        }   else if    ((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1)) {     //      5    10  15  true
                System.out.println("Your number is: " + num2);                              //      15   10  5

        }   else {                                                                          //      5    15  10
                System.out.println("Your number is: " + num3);                              //      10   15  5
        }
        in.close();
    }
}

