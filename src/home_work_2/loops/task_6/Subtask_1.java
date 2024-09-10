/*
1.6. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке
(динозаврика рисовать не надо): https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0
 */

package home_work_2.loops.task_6;

public class Subtask_1 {

    public static String printMultipliedTable(int startNumber, int endNumber, int columnsInRow) {
        StringBuilder builder = new StringBuilder();
        int factor = 1;

        while (startNumber <= endNumber) {
            for (int i = 0; i < columnsInRow && startNumber + i <= endNumber; i++) {
                int currentNumber = startNumber + i;
                builder.append(currentNumber).append(" * ").append(factor)
                        .append(" = ").append(currentNumber * factor);
                if (i < columnsInRow - 1 && currentNumber + 1 <= endNumber) {
                    builder.append("\t\t");
                }
            }

            builder.append("\n");

            if (++factor > 10) {
                factor = 1;
                startNumber += columnsInRow;
                builder.append("\n");
            }
        }
        return builder.toString();
    }
}