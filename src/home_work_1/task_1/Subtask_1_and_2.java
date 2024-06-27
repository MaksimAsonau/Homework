package home_work_1.task_1;

import java.util.Scanner;

public class Subtask_1_and_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input number1:  ");   //     0001_0011    19
        int number1 = in.nextInt();
        System.out.print("Input number2:  ");   //     0101_0100    84
        int number2 = in.nextInt();

        int andResult = number1 & number2;      //     0001_1011    19
                                                //   & 0101_0100    84
                                                //   _________________
                                                //     0001_0000    16

        int orResult = number1 | number2;       //     0001_0011    19
                                                //   | 0101_0100    84
                                                //   _________________
                                                //     0101_0111    87

        System.out.println("Result AND (&): " + andResult);
        System.out.println("Result OR (|):  " + orResult);
        in.close();
    }
}
