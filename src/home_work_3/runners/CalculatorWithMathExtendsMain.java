package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();

        // Вычисляем значение выражения:  4.1 + 15 * 7 + (28 / 5) ^ 2
        double result1 = calc.divide(28, 5.0);
        double result2 = calc.pow(result1, 2);
        double result3 = calc.multiply(15, 7);
        double result4 = calc.add(4.1, result3);
        double finalResult = calc.add(result2, result4);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + finalResult);   // 140.45999999999998
    }
}
