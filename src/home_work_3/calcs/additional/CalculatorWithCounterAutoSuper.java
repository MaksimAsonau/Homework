package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long count;

    public long getCountOperation() {
        return count;
    }

    public double add(double a, double b) {
        count++;
        return super.add(a,b);
    }

    public double subtract(double a, double b) {
        count++;
        return super.subtract(a, b);
    }

    public double multiply(double a, double b) {
        count++;
        return super.multiply(a, b);
    }

    public double divide(double a, double b) {
        count++;
        return super.divide(a, b);
    }

    public double pow(double base, int exponent) {
        count++;
        return super.pow(base, exponent);
    }

    public double abs(double a) {
        count++;
        return super.abs(a);
    }

    public double sqrt(double a) {
        count++;
        return super.sqrt(a);
    }
}
