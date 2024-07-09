/*
1.6. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке
(динозаврика рисовать не надо): https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0
 */

package home_work_2.loops.task_6;

public class Subtask_1 {
    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++) {   // цикл строк (от 1 до 10)

            for (int i = 2; i <= 5; i++) {  // Внутренний цикл первых столбцов (от 2 до 5)

                int result = i * j;
                String output = i + " x " + j + " = " + result + "\t\t";
                System.out.print(output);
            }
            System.out.println();// Разделяем блоки умножения
        }
        System.out.println(); // Разделяем верхние столбцы от нижних


        for (int j = 1; j <= 10; j++) {     // цикл строк (от 1 до 10)

            for (int i = 6; i <= 9; i++) {  // Внутренний цикл первых столбцов (от 6 до 9)

                int result = i * j;
                String output = i + " x " + j + " = " + result + "\t\t";
                System.out.print(output);
            }
            System.out.println(); // Разделяем блоки умножения
        }
    }
}