package home_work_1.task_3;

public class Subtask_1 {

    public static void main(String[] args) {

        // 1. Возведение в степень
        double base = 2.0;
        double exponent = 4.0;
        double powerResult = Math.pow(base, exponent);
        System.out.println("1. Power result: " + powerResult); // 16.0

        // 2. Квадратный корень
        double number = 144.0;
        double sqrtResult = Math.sqrt(number);
        System.out.println("2. Square root result: " + sqrtResult); // 12.0

        // 3. Абсолютное значение
        int negativeNumber = -10;
        int absoluteResult = Math.abs(negativeNumber);
        System.out.println("3. Absolute result: " + absoluteResult); // 10

        // 4. Округление числа
        double valueToRound = 5.56;
        long roundedValue = Math.round(valueToRound);
        System.out.println("4. Rounded value: " + roundedValue); // 6

        // 5. Максимальное значение из двух чисел
        int x = 18;
        int y = 89;
        int maxValue = Math.max(x, y);
        System.out.println("5. Max value: " + maxValue); // 89

        // 6. Нахождение минимального значения из двух чисел
        int a = 55;
        int b = 54;
        int minValue = Math.min(a, b);
        System.out.println("6. Min value: " + minValue); // 54

        // 7. Вычисление случайного числа (random)
        double randomValue = Math.random();
        System.out.println("7. Random value: " + randomValue); // Случайное число от 0.0 до 1.0
    }
}