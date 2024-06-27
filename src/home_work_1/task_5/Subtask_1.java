package home_work_1.task_5;

import java.util.Scanner;

public class Subtask_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Is it a weekday? (true/false): ");
        boolean weekday = in.nextBoolean();

        boolean vacation = false;

        if (weekday == true) {
            System.out.print("Are you on vacation? (true/false): ");
            vacation = in.nextBoolean();
        }

        if (sleepIn(weekday == true, vacation == true)) {
            System.out.println("You can sleep.");
        } else {
            System.out.println("Go to work.");
        }

        in.close();
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday == true || vacation == true) {
            return true;
        }
        return false;
    }
}