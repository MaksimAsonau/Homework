package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory implements ICalculator {
    private final ICalculator clac;
    private double memory;
    private double lastResult;

    public CalculatorWithMemory(ICalculator clac) {
        this.clac = clac;
    }

    public void save() {
        memory = lastResult;
    }

    public double load() {
        double temp = memory;
        memory = 0; // Чистим память после зарузки
        return temp;
    }
    
    public double divide(double a, double b) {
        lastResult = clac.divide(a, b);
        return lastResult;
    }

    public double multiply(double a, double b) {
        lastResult = clac.multiply(a, b);
        return lastResult;
    }

    public double subtract(double a, double b) {
        lastResult = clac.subtract(a, b);
        return lastResult;
    }

    public double add(double a, double b) {
        lastResult = clac.add(a, b);
        return lastResult;
    }

    public double pow(double base, int exponent) {
        lastResult = clac.pow(base, exponent);
        return lastResult;
    }

    public double abs(double a) {
        lastResult = clac.abs(a);
        return lastResult;
    }

    public double sqrt(double a) {
        lastResult = clac.sqrt(a);
        return lastResult;
    }
}
