package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    public double add(double a, double b) {                 // Метод сложения
        return a + b;
    }

    public double subtract(double a, double b) {            // Метод вычитания
        return a - b;
    }

    public double multiply(double a, double b) {            // Метод умножения
        return a * b;
    }

    public double divide(double a, double b) {              // Метод деления
        return a / b;
    }

    public double pow(double base, int exponent) {          // Метод возведения в степень из класса Math
        return Math.pow(base, exponent);
    }

    public double abs(double a) {                           // Метод получения модуля из класса Math
        return Math.abs(a);
    }

    public double sqrt(double a) {                          // Метод получения квадратного корня из класса Math
        return Math.sqrt(a);
    }
}
