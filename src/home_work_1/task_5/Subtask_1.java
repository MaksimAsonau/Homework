package home_work_1.task_5;

import java.util.Scanner;

public class Subtask_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Is it a weekday? (true/false): ");
        boolean weekday = in.nextBoolean();
        System.out.print("Are you on vacation? (true/false): ");
        boolean vacation = in.nextBoolean();

        System.out.println(sleepIn(weekday,vacation) ? "You can sleep." : "Go to work." );
        in.close();
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}