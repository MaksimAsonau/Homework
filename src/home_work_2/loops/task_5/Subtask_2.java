/*
1.5.2. Вероятность четных случайных чисел
 */
package home_work_2.loops.task_5;

import java.util.Random;

public class Subtask_2 {
    public static void main(String[] args) {
        int totalNumbers = 10000;
        double evenProbability = calculateEvenProbability(totalNumbers);

        System.out.println("Вероятность выпадения четных чисел: " + evenProbability + "%");
    }

    public static double calculateEvenProbability(int totalNumbers) {
        Random random = new Random();
        int evenCount = 0;

        for (int i = 0; i < totalNumbers; i++) {
            int number = random.nextInt();
            if (number % 2 == 0) {
                evenCount++;
            }
        }
        return (evenCount * 100.0) / totalNumbers;
    }
}

