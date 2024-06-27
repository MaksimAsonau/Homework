package home_work_1.task_4;

import java.util.Scanner;

public class Subtask_5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");
        int num = in.nextInt();

        if (( 65 <= num && num <= 90) || (97 <= num && num <= 122)) {
            System.out.println("its letter");

        } else {
            System.out.println("its symbol");  // если второе число 0
        }
        in.close();
    }
}