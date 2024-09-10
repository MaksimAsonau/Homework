package home_work_1.task_4;

import java.util.Scanner;

public class Subtask_6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input year: ");
        int year = in.nextInt();
        in.close();

        System.out.println("it's a " + (isLeapYear(year) ? "leap year" : "normal year"));

    }
    public static boolean isLeapYear (int x){
        return !((x % 4 != 0) || (x % 100 == 0) && (x % 400 != 0));
    }
}