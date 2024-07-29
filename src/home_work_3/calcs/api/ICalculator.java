package home_work_3.calcs.api;

public interface ICalculator {
    double divide(double a, double b);
    double multiply(double a, double b);
    double subtract(double a, double b);
    double add(double a, double b);
    double pow(double base, int exponent);
    double abs(double a);
    double sqrt(double a);
}
