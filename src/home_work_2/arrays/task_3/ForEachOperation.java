package home_work_2.arrays.task_3;

public class ForEachOperation implements IArraysOperation {

    @Override
    public String allElementsToConsole(int[] array) {
        StringBuilder builder1 = new StringBuilder();
        int i = 0;

        for (int element : array) {
            builder1.append(element);
            i++;

            if (i < array.length) {
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

        int i = 0;

        for (int element : array) {
            if (i % 2 != 0) {
                if (builder2.length() > 0) {
                    builder2.append(" ");
                }
                builder2.append(element);
            }
            i++;
        }
        return builder2.toString();
    }

    @Override
    public String reversAllElementsToConsole(int[] array) {
        StringBuilder builder3 = new StringBuilder();

        for (int i : array) {
            builder3.insert(0, i + " ");
        }

        if (builder3.length() > 0) {
            builder3.setLength(builder3.length() - 1);
        }
        return builder3.toString();
    }
}
