package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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

    public double pow(double base, int exponent) {          // Метод возведения в целую степень
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public double abs(double a) {                           // Метод получения модуля
        return a < 0 ? -a : a;
    }

    public double sqrt(double a) {                          // Метод вычисления квадратного корня
        return Math.sqrt(a);
    }
}
