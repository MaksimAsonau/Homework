package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {

        // Вычисляем значение выражения:  4.1 + 15 * 7 + (28 / 5) ^ 2
        double result1 = 28.0 / 5;
        double result2 = result1 * result1;
        double result3 = 15 * 7;
        double result4 = 4.1 + result3;
        double finalResult = result2 + result4;

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + finalResult);   // 140.45999999999998
    }
}
