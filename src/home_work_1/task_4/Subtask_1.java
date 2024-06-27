package home_work_1.task_4;

import java.util.Random;

public class Subtask_1 {

    public static void main(String[] args) {

        Random random = new Random();
        int num1 = random.nextInt(100);  // вернет случайное число от 0 до 99
        int num2 = random.nextInt(100);  // вернет случайное число от 0 до 99

        if ((num1 %2 == 0 && num2 %2 == 0) || (num1 %2 != 0 && num2 %2 != 0)) {
            num1 += 1;
        }

        if (num1 %2 == 0) {
            System.out.print("Your number: " + num2);
        }   else {
            System.out.print("Your number: " + num1);
        }
    }
}
