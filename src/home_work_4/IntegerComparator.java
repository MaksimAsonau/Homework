package home_work_4;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return Integer.compare(i1, i2);
    }
}
