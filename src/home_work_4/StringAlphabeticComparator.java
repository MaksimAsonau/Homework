package home_work_4;

import java.util.Comparator;

public class StringAlphabeticComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
}
