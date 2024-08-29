package home_work_5;

import java.util.Comparator;


public class Comparators {
    public static class PasswordLengthComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.getPassword().length(), p2.getPassword().length());
        }
    }

    public static class PasswordAndNickComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            int result = Integer.compare(p1.getPassword().length(), p2.getPassword().length());
            if (result == 0) {
                result = p1.getNick().compareTo(p2.getNick());
            }
            return result;
        }
    }

    public static class AnimalAgeComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal a1, Animal a2) {
            return Integer.compare(a1.getAge(), a2.getAge());
        }
    }

    public static class AnimalAgeAndNickComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal a1, Animal a2) {
            int result = Integer.compare(a1.getAge(), a2.getAge());
            if (result == 0) {
                result = a1.getNick().compareTo(a2.getNick());
            }
            return result;
        }
    }
}
