package home_work_2.arrays.task_3;

public class WhileOperation implements IArraysOperation {

    @Override
    public String allElementsToConsole(int[] array) {
        StringBuilder builder1 = new StringBuilder();
        int i = 0;

        while (i < array.length) {
            builder1.append(array[i]);
            if (i < array.length - 1) {
                builder1.append(" ");
            }
            i++;
        }
        return builder1.toString();
    }

    @Override
    public String everySecondElementsToConsole(int[] array) {
        StringBuilder builder2 = new StringBuilder();
        int i = 1;

        if (array.length == 1) {
            return null;
        }
        while (i < array.length) {
            if (i > 2) {
                builder2.append(" " + array[i]);
                i += 2;
            } else {
                builder2.append(array[i]);
                i += 2;
            }
        }
        return builder2.toString();
    }

    @Override
    public String reversAllElementsToConsole(int[] array) {
        StringBuilder builder3 = new StringBuilder();
        int i = array.length;

        while (i > 0) {
            builder3.append(array[i - 1]);
            if (i != 1) {
                builder3.append(" ");
            }
            i--;
        }
        return builder3.toString();
    }
}
