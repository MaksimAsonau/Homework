package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        System.out.println("\nCalculatorWithOperator:");
        CalculatorWithOperator calcOperator = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation calc1 = new CalculatorWithCounterAutoChoiceAgregation(calcOperator);
        calculateAndPrintResults(calc1);

        System.out.println("\nCalculatorWithMathCopy:");
        CalculatorWithMathCopy calcMathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation calc2 = new CalculatorWithCounterAutoChoiceAgregation(calcMathCopy);
        calculateAndPrintResults(calc2);

        System.out.println("\nCalculatorWithMathExtends:");
        CalculatorWithMathExtends calcMathExtends = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calc3 = new CalculatorWithCounterAutoChoiceAgregation(calcMathExtends);
        calculateAndPrintResults(calc3);
    }
    private static void calculateAndPrintResults(CalculatorWithCounterAutoChoiceAgregation calc) {

        double result1 = calc.divide(28, 5.0);
        double result2 = calc.pow(result1, 2);
        double result3 = calc.multiply(15, 7);
        double result4 = calc.add(4.1, result3);
        double finalResult = calc.add(result2, result4);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + finalResult);   // 140.45999999999998
        System.out.println("Количество использований калькулятора: " + calc.getCountOperation());
    }

}
