package home_work_5;

import java.util.Comparator;
import java.util.List;


public class BubbleSort {
    public static <T> void sort(List<T> list, Comparator<T> comparator) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (comparator.compare(list.get(i), list.get(i + 1)) > 0) {
                    T temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
