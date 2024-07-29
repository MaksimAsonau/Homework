package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private final ICalculator calc;
    private double memory;
    private double lastResult;

    public CalculatorWithMemoryDecorator(ICalculator calc) {
        this.calc = calc;
    }

    public ICalculator getCalc() {
        return calc;
    }

    public void save() {
        memory = lastResult;
    }

    public double load() {
        double temp = memory;
        memory = 0; // Чистим память после загрузки
        return temp;
    }

    public double divide(double a, double b) {
        lastResult = calc.divide(a, b); // Сохраняем результат
        return lastResult;
    }

    public double multiply(double a, double b) {
        lastResult = calc.multiply(a, b);
        return lastResult;
    }

    public double subtract(double a, double b) {
        lastResult = calc.subtract(a, b);
        return lastResult;
    }

    public double add(double a, double b) {
        lastResult = calc.add(a, b);
        return lastResult;
    }

    public double pow(double base, int exponent) {
        lastResult = calc.pow(base, exponent);
        return lastResult;
    }

    public double abs(double a) {
        lastResult = calc.abs(a);
        return lastResult;
    }

    public double sqrt(double a) {
        lastResult = calc.sqrt(a);
        return lastResult;
    }
}
