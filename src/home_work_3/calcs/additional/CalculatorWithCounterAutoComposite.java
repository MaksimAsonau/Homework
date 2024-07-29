package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    private CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
    private long count;

    public long getCountOperation() {
        return count;
    }

    public double divide(double a, double b) {
        count++;
        return calc.divide(a, b);
    }

    public double multiply(double a, double b) {
        count++;
        return calc.multiply(a, b);
    }

    public double subtract(double a, double b) {
        count++;
        return calc.subtract(a, b);
    }

    public double add(double a, double b) {
        count++;
        return calc.add(a, b);
    }

    public double pow(double base, int exponent) {
        count++;
        return calc.pow(base, exponent);
    }

    public double abs(double a) {
        count++;
        return calc.abs(a);
    }

    public double sqrt(double a) {
        count++;
        return calc.sqrt(a);
    }
}
