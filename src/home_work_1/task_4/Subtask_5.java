package home_work_1.task_4;

import java.util.Scanner;

public class Subtask_5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");
        int num = in.nextInt();
        in.close();
        System.out.println(isLetter(num) ? "its letter" : "its other symbol");
    }
    public static boolean isLetter (int x) {
        return ( 65 <= x && x <= 90) || (97 <= x && x <= 122);
    }
}