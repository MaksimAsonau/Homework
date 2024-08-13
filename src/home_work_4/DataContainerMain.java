package home_work_4;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[]{});
        int index01 = container.add("Привет");
        int index02 = container.add("Как дела");
        int index03 = container.add("Работаю");
        int index04 = container.add("Давай потом");
        System.out.println(container.get(index01)); // Привет
        System.out.println(container.get(index02)); // Как дела
        System.out.println(container.get(index03)); // Работаю
        System.out.println(container.get(index04)); // Давай потом
        container.deleteItem("Привет");
        System.out.println(container.get(index01)); // Как дела
        container.sort(new StringLengthComparator()); // Сортируется по длине
        System.out.println(container); // ["Работаю", "Как дела", "Давай потом"]
        container.sort(new StringAlphabeticComparator()); // Сортируется по алфавиту
        System.out.println(container); // ["Давай потом", "Как дела", "Работаю"]
        System.out.println("____________________________");

        System.out.println("\nТестирование добавления и расширения:");

        DataContainer<Integer> container1 = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});
        int index1 = container1.add(777);
        System.out.println(container1); // [1, 2, 3, 777, null, null]
        System.out.println("Returned index: " + index1); // 3
        System.out.println("");

        DataContainer<Integer> container2 = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});
        int index2 = container2.add(null);
        System.out.println(container2); // [1, 2, 3, null, null, null]
        System.out.println("Returned index: " + index2); // -1
        System.out.println("");

        DataContainer<Integer> container3 = new DataContainer<>(new Integer[]{1, null, 3, null, null, null});
        int index3 = container3.add(777);
        System.out.println(container3); // [1, 777, 3, null, null, null]
        System.out.println("Returned index: " + index3); // 1
        System.out.println("");

        DataContainer<Integer> container4 = new DataContainer<>(new Integer[]{1, 2, 3});
        int index4 = container4.add(777);
        System.out.println(container4); // [1, 2, 3, 777]
        System.out.println("Returned index: " + index4); // 3
        System.out.println("");

        DataContainer<Integer> container5 = new DataContainer<>(new Integer[]{});
        int index5 = container5.add(777);
        System.out.println(container5); // [777]
        System.out.println("Returned index: " + index5); // 0
        System.out.println("");

        DataContainer<Integer> container6 = new DataContainer<>(new Integer[]{});
        int index6 = container6.add(9999);
        System.out.println(container6.get(0)); // 9999
        System.out.println(container6.get(1)); // null
        System.out.println("____________________________");

        System.out.println("\nТестирование удаления:");

        DataContainer<Integer> container7 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean deleted1 = container7.deleteIndex(3);
        System.out.println(container7); // [1, 2, 3]
        System.out.println("Deleted: " + deleted1); // true
        System.out.println("");

        DataContainer<Integer> container8 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean deleted2 = container8.deleteIndex(9);
        System.out.println(container8); // [1, 2, 3, 777]
        System.out.println("Deleted: " + deleted2); // false
        System.out.println("");

        DataContainer<Integer> container9 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean deleted3 = container9.deleteIndex(2);
        System.out.println(container9); // [1, 2, 777]
        System.out.println("Deleted: " + deleted3); // true
        System.out.println("");

        DataContainer<Integer> container10 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean deleted4 = container10.deleteItem(null);
        System.out.println(container10); // [1, 2, 3, 777]
        System.out.println("Deleted: " + deleted4); // false
        System.out.println("");

        DataContainer<Integer> container11 = new DataContainer<>(new Integer[]{1, 2, 3, 777, null});
        boolean deleted5 = container11.deleteItem(null);
        System.out.println(container11); // [1, 2, 3, 777, null]
        System.out.println("Deleted: " + deleted5); // false
        System.out.println("");

        DataContainer<Integer> container12 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean deleted6 = container12.deleteItem(777);
        System.out.println(container12); // [1, 2, 3]
        System.out.println("Deleted: " + deleted6); // true
        System.out.println("");

        DataContainer<Integer> container13 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean deleted7 = container13.deleteItem(111);
        System.out.println(container13); // [1, 2, 3, 777]
        System.out.println("Deleted: " + deleted7); // false
        System.out.println("");

        DataContainer<Integer> container14 = new DataContainer<>(new Integer[]{1, 2, 3, 777, 3});
        boolean deleted8 = container14.deleteItem(3);
        System.out.println(container14); // [1, 2, 777, 3]
        System.out.println("Deleted: " + deleted8); // true
        System.out.println("____________________________");

        System.out.println("\nТестирование сортировки:");

        DataContainer<Integer> container15 = new DataContainer<>(new Integer[]{3, 1, 3, 777});
        container15.sort(new IntegerComparator());
        System.out.println(container15); // [1, 3, 3, 777]
        System.out.println("");

        DataContainer<String> container16 = new DataContainer<>(new String[]{"i", "hello", "1", "Как домашка"});
        container16.sort(new StringLengthComparator());
        System.out.println(container16); // ["i", "1", "hello", "Как домашка"]
        System.out.println("____________________________");

        System.out.println("\nТестирование toString:");
        System.out.println("");

        DataContainer<Integer> container17 = new DataContainer<>(new Integer[]{1, 2, 3, 777, 3});
        System.out.println(container17); // [1, 2, 3, 777, 3]
        System.out.println("");

        DataContainer<Integer> container18 = new DataContainer<>(new Integer[]{1, 2, 3, null});
        System.out.println(container18); // [1, 2, 3]
        System.out.println("");

        DataContainer<Integer> container19 = new DataContainer<>(new Integer[]{});
        System.out.println(container19); // []
        System.out.println("");
        System.out.println("____________________________");

        System.out.println("\nТестирование getItems:");
        DataContainer<Integer> container20 = new DataContainer<>(new Integer[4]);
        container20.add(1);
        container20.add(2);
        container20.add(3);
        container20.add(777);
        Integer[] items = container20.getItems();
        System.out.print("getItems(): [");
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.print(items[i]);
                if (i < items.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println("]");
    }
}

