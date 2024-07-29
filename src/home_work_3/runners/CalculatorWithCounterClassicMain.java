package home_work_3.runners;

import home_work_2.sorts.SortsMain;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();

        // Вычисляем значение выражения:  4.1 + 15 * 7 + (28 / 5) ^ 2
        double result1 = calc.divide(28, 5.0);
        calc.incrementCountOperation();

        double result2 = calc.pow(result1, 2);
        calc.incrementCountOperation();

        double result3 = calc.multiply(15, 7);
        calc.incrementCountOperation();

        double result4 = calc.add(4.1, result3);
        calc.incrementCountOperation();

        double finalResult = calc.add(result2, result4);
        calc.incrementCountOperation();

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + finalResult);   // 140.45999999999998
        System.out.println("Количество использований калькулятора: " + calc.getCountOperation());
    }
}
