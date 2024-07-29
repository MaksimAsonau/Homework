package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithOperator calcOperator = new CalculatorWithOperator();
        CalculatorWithMemory calcMemory = new CalculatorWithMemory(calcOperator);

        // Вычисляем значение выражения:  4.1 + 15 * 7 + (28 / 5) ^ 2
        calcMemory.divide(28, 5);
        calcMemory.save();
        calcMemory.pow(calcMemory.load(), 2);
        calcMemory.save();
        calcMemory.add(4.1, calcMemory.load());
        calcMemory.save();
        calcMemory.add(calcMemory.load(), calcMemory.multiply(15, 7));
        calcMemory.save();

        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calcMemory.load());
    }
}
