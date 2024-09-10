package home_work_2.arrays.task_3;

import home_work_2.utils.ArraysUtils;

public class ArraysOperationMain {
    public static void main(String[] args) {

        int[] arrayRandom = ArraysUtils.arrayRandom(10, 99);

        DoWhileOperation doWhileOperation = new DoWhileOperation();
        WhileOperation whileOperation = new WhileOperation();
        ForOperation forOperation = new ForOperation();
        ForEachOperation forEachOperation = new ForEachOperation();

        System.out.println(doWhileOperation.allElementsToConsole(arrayRandom));
        System.out.println(doWhileOperation.everySecondElementsToConsole (arrayRandom));
        System.out.println(doWhileOperation.reversAllElementsToConsole (arrayRandom));
        System.out.println("****************");

        System.out.println(whileOperation.allElementsToConsole(arrayRandom));
        System.out.println(whileOperation.everySecondElementsToConsole (arrayRandom));
        System.out.println(whileOperation.reversAllElementsToConsole (arrayRandom));
        System.out.println("****************");

        System.out.println(forOperation.allElementsToConsole(arrayRandom));
        System.out.println(forOperation.everySecondElementsToConsole (arrayRandom));
        System.out.println(forOperation.reversAllElementsToConsole (arrayRandom));
        System.out.println("****************");

        System.out.println(forEachOperation.allElementsToConsole(arrayRandom));
        System.out.println(forEachOperation.everySecondElementsToConsole (arrayRandom));
        System.out.println(forEachOperation.reversAllElementsToConsole (arrayRandom));
    }
}
