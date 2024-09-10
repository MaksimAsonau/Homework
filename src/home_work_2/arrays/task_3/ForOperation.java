package home_work_2.arrays.task_3;

public class ForOperation implements IArraysOperation {

    @Override
    public String allElementsToConsole(int[] array) {
        StringBuilder builder1 = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            builder1.append(array[i]);
            if (i < array.length - 1) {
                builder1.append(" ");
            }
        }
        return builder1.toString();
    }

    @Override
    public String everySecondElementsToConsole(int[] array) {
        StringBuilder builder2 = new StringBuilder();

        if (array.length == 1) {
            return null;
        }

        for (int x = 1; x < array.length; x += 2) {
            builder2.append(array[x]);
            if (x < array.length - 2) {
                builder2.append(" ");
            }
        }
        return builder2.toString();
    }

    @Override
    public String reversAllElementsToConsole(int[] array) {
        StringBuilder builder3 = new StringBuilder();

        for (int i = array.length; i > 0; i--) {
            builder3.append(array[i - 1]);
            if (i > 1) {
                builder3.append(" ");
            }
        }
        return builder3.toString();
    }
}
