package home_work_5;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int numberOfEntries = 300_000;

        // Генерация данных
        List<Person> persons = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        generateRandomPersons(persons, numberOfEntries);
        generateRandomAnimals(animals, numberOfEntries);

        // Заполнение коллекций
        LinkedList<Person> linkedListPersons = new LinkedList<>(persons);
        ArrayList<Person> arrayListPersons = new ArrayList<>(persons);
        HashSet<Person> hashSetPersons = new HashSet<>(persons);
        TreeSet<Person> treeSetPersons = new TreeSet<>(new Comparators.PasswordAndNickComparator());
        treeSetPersons.addAll(persons);

        LinkedList<Animal> linkedListAnimals = new LinkedList<>(animals);
        ArrayList<Animal> arrayListAnimals = new ArrayList<>(animals);
        HashSet<Animal> hashSetAnimals = new HashSet<>(animals);
        TreeSet<Animal> treeSetAnimals = new TreeSet<>(new Comparators.AnimalAgeAndNickComparator());
        treeSetAnimals.addAll(animals);


        // Сортировка и замер времени
        measureSortingAndTime(
                linkedListPersons, arrayListPersons, hashSetPersons, treeSetPersons,
                linkedListAnimals, arrayListAnimals, hashSetAnimals, treeSetAnimals);
    }

    private static void generateRandomPersons(List<Person> persons, int count) {
        for (int i = 0; i < count; i++) {
            String nick = NameGenerator.generateRandomString(8, 15);
            String password = NameGenerator.generateRandomString(5, 10);
            String name = NameGenerator.generateRandomName();
            persons.add(new Person(nick, password, name));
        }
    }

    private static void generateRandomAnimals(List<Animal> animals, int count) {
        for (int i = 0; i < count; i++) {
            int age = ThreadLocalRandom.current().nextInt(1, 16);
            String nick = NameGenerator.generateRandomAnimalName();
            animals.add(new Animal(age, nick));
        }
    }

    private static void measureSortingAndTime(
            List<Person> linkedListPersons, List<Person> arrayListPersons,
            Set<Person> hashSetPersons, Set<Person> treeSetPersons,
            List<Animal> linkedListAnimals, List<Animal> arrayListAnimals,
            Set<Animal> hashSetAnimals, Set<Animal> treeSetAnimals) {

        // Замер времени заполнения коллекций
        long startTime = System.currentTimeMillis();
        generateRandomPersons(new ArrayList<>(linkedListPersons), linkedListPersons.size());
        System.out.println("Заполнение LinkedList<Person>: " + (System.currentTimeMillis() - startTime) + " мс");

        startTime = System.currentTimeMillis();
        generateRandomAnimals(new ArrayList<>(linkedListAnimals), linkedListAnimals.size());
        System.out.println("Заполнение LinkedList<Animal>: " + (System.currentTimeMillis() - startTime) + " мс");

        // Сортировка и замер времени
        startTime = System.currentTimeMillis();
        Collections.sort(arrayListPersons, new Comparators.PasswordLengthComparator());
        System.out.println("Сортировка ArrayList<Person> по длине пароля: " +
                (System.currentTimeMillis() - startTime) + " мс");

        startTime = System.currentTimeMillis();
        BubbleSort.sort(arrayListPersons, new Comparators.PasswordLengthComparator());
        System.out.println("Пузырьковая сортировка ArrayList<Person> по длине пароля: " +
                (System.currentTimeMillis() - startTime) + " мс");

        startTime = System.currentTimeMillis();
        Collections.sort(arrayListAnimals, new Comparators.AnimalAgeComparator());
        System.out.println("Сортировка ArrayList<Animal> по возрасту: " +
                (System.currentTimeMillis() - startTime) + " мс");

        startTime = System.currentTimeMillis();
        BubbleSort.sort(arrayListAnimals, new Comparators.AnimalAgeComparator());
        System.out.println("Пузырьковая сортировка ArrayList<Animal> по возрасту: " +
                (System.currentTimeMillis() - startTime) + " мс");

        // Итерирование и удаление элементов
        measureIterationAndDeletion(linkedListPersons, arrayListPersons, hashSetPersons, treeSetPersons);
        measureIterationAndDeletion(linkedListAnimals, arrayListAnimals, hashSetAnimals, treeSetAnimals);
    }

    private static void measureIterationAndDeletion(
            List<?> linkedList, List<?> arrayList, Set<?> hashSet, Set<?> treeSet) {

        // Итерирование
        long startTime = System.currentTimeMillis();
        Iterator<?> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        System.out.println("Итерирование LinkedList: " + (System.currentTimeMillis() - startTime) + " мс");

        startTime = System.currentTimeMillis();
        for (Object item : arrayList) {
        }
        System.out.println("Итерирование ArrayList: " + (System.currentTimeMillis() - startTime) + " мс");

        startTime = System.currentTimeMillis();
        iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        System.out.println("Итерирование HashSet: " + (System.currentTimeMillis() - startTime) + " мс");

        startTime = System.currentTimeMillis();
        iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        System.out.println("Итерирование TreeSet: " + (System.currentTimeMillis() - startTime) + " мс");

        // Удаление
        startTime = System.currentTimeMillis();
        iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println("Удаление элементов из LinkedList: " + (System.currentTimeMillis() - startTime) + " мс");

        startTime = System.currentTimeMillis();
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println("Удаление элементов из ArrayList: " + (System.currentTimeMillis() - startTime) + " мс");

        startTime = System.currentTimeMillis();
        iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println("Удаление элементов из HashSet: " + (System.currentTimeMillis() - startTime) + " мс");

        startTime = System.currentTimeMillis();
        iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println("Удаление элементов из TreeSet: " + (System.currentTimeMillis() - startTime) + " мс");
    }
}