package home_work_1.task_4;

import java.util.Scanner;

public class Subtask_6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input year: ");
        int year = in.nextInt();

        if ((year % 4 != 0) || (year % 100 == 0) && (year % 400 != 0)) {
            System.out.println("this year is a normal year");

        } else {
            System.out.println("this year is a leap year");
        }
        in.close();
    }
}