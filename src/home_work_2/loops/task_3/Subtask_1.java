/*
1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем
возводить, Второе число это степень в которую возводят первое число. Степень - только положительная и целая.
Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */

package home_work_2.loops.task_3;

public class Subtask_1 {

    // Метод для вычисления степени числа
    public double calculatePower(double base, int exponent) {
        if (exponent <= 0) {
            throw new IllegalArgumentException("Ошибка: Степень должна быть положительным целым числом.");
        }

        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
    // Метод для проверки и парсинга ввода степени
    public int parseExponent(String input) {
        try {
            int exponent = Integer.parseInt(input);
            if (exponent <= 0) {
                throw new IllegalArgumentException("Ошибка: Степень должна быть положительным целым числом.");
            }
            return exponent;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ошибка: Степень должна быть целым числом.", e);
        }
    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите число: ");
//        double base = in.nextDouble();
//
//        System.out.print("Введите степень (целое положительное число): ");
//
//        if (!in.hasNextInt()) {     // Проверка, что введенное значение - целое число
//            System.out.println("Ошибка: Степень должна быть целым числом.");
//            return;
//        }
//
//        int exponent = in.nextInt();
//
//        if (exponent <= 0) {        // Проверка, что степень - положительное число
//            System.out.println("Ошибка: Степень должна быть положительным целым числом.");
//            return;
//        }
//
//        // Вычисление степени числа
//        double result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result = result * base;
//        }
//
//        System.out.println(base + " ^ " + exponent + " = " + result);
//
//        in.close();
//    }
}
