package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calcOperator;
    private CalculatorWithMathCopy calcMathCopy;
    private CalculatorWithMathExtends calcMathExtends;
    private long count;

    // Конструктор для CalculatorWithOperator
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calc) {
        this.calcOperator = calc;
    }

    // Конструктор для CalculatorWithMathCopy
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calc) {
        this.calcMathCopy = calc;
    }

    // Конструктор для CalculatorWithMathExtends
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calc) {
        this.calcMathExtends = calc;
    }

    public long getCountOperation() {
        return count;
    }

    public double divide(double a, double b) {
        count++;
        if (calcOperator != null) {
            return calcOperator.divide(a, b);
        } else if (calcMathCopy != null) {
            return calcMathCopy.divide(a, b);
        } else {
            return calcMathExtends.divide(a, b);
        }
    }

    public double multiply(double a, double b) {
        count++;
        if (calcOperator != null) {
            return calcOperator.multiply(a, b);
        } else if (calcMathCopy != null) {
            return calcMathCopy.multiply(a, b);
        } else {
            return calcMathExtends.multiply(a, b);
        }
    }

    public double subtract(double a, double b) {
        count++;
        if (calcOperator != null) {
            return calcOperator.subtract(a, b);
        } else if (calcMathCopy != null) {
            return calcMathCopy.subtract(a, b);
        } else {
            return calcMathExtends.subtract(a, b);
        }
    }

    public double add(double a, double b) {
        count++;
        if (calcOperator != null) {
            return calcOperator.add(a, b);
        } else if (calcMathCopy != null) {
            return calcMathCopy.add(a, b);
        } else {
            return calcMathExtends.add(a, b);
        }
    }

    public double pow(double base, int exponent) {
        count++;
        if (calcOperator != null) {
            return calcOperator.pow(base, exponent);
        } else if (calcMathCopy != null) {
            return calcMathCopy.pow(base, exponent);
        } else {
            return calcMathExtends.pow(base, exponent);
        }
    }

    public double abs(double a) {
        count++;
        if (calcOperator != null) {
            return calcOperator.abs(a);
        } else if (calcMathCopy != null) {
            return calcMathCopy.abs(a);
        } else {
            return calcMathExtends.abs(a);
        }
    }

    public double sqrt(double a) {
        count++;
        if (calcOperator != null) {
            return calcOperator.sqrt(a);
        } else if (calcMathCopy != null) {
            return calcMathCopy.sqrt(a);
        } else {
            return calcMathExtends.sqrt(a);
        }
    }
}
