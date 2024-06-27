package home_work_1.task_1;

import java.util.Scanner;

public class Subtask_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input number1:  ");
        /*
        При вводе числа 42,5 получим ошибку компиляции, т.к. побитовые операции не применимы к
        вещественному типу. Решением будет приведение типа double к типу int (42,5 к 42)
        */
        double number3 = in.nextDouble();       //  ввод промежуточной переменной типа double (42,5)
        int number1 = (int)number3;             //  приведение к типу int 42   0010_1010

        System.out.print("Input number2:  ");   //      0001_1000   24
        int number2 = in.nextInt();

        int andResult = number1 & number2;      //      0010_1010   42
                                                //   &  0001_1000   24
                                                //   _________________
                                                //      0000_1000   8

        int orResult = number1 | number2;       //      0010_1010   42
                                                //   |  0001_1000   24
                                                //   _________________
                                                //      0011_1010   58

        System.out.println("Result AND (&): " + andResult);
        System.out.println("Result OR (|):  " + orResult);
        in.close();
    }
}