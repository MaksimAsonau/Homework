package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator{
    private final ICalculator calc;
    private long count;

    // Конструктор, принимающий объект калькулятора
    public CalculatorWithCounterAutoDecorator(ICalculator calc) {
        this.calc = calc;
    }

    public ICalculator getCalc() {
        return calc;
    }

    public long getCount() {
        return count;
    }

    public double divide(double a, double b) {
        count++;
        return calc.divide(a, b); // Делегируем вызов методу вложенного калькулятора
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
