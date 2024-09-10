/*
 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
 Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
 1.1.2.* Используя рекурсию
 */

package home_work_2.loops.task_1;

public class Subtask_2 implements IMultiply{
    @Override
    public long calculateFactorial(long number) {
        // Условие завершения рекурсии
        if (number  <= 1) {
            return 1;
        }
        // Рекурсивный вызов для вычисления факториала предыдущего числа
        long previousResult = calculateFactorial(number  - 1);
        // Проверка на возможное переполнение
        if (number > Long.MAX_VALUE / previousResult) {
            return -1; // Возвращаем -1 при переполнении
        }
        // Возвращаем результат умножения текущего числа на результат предыдущего шага
        return number * previousResult;
    }

    public static void validateNotNegativeNumber(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }
    }

    //    public static void main(String[] args) {
//        // Проверяем, что аргумент был передан
//        if (args.length == 0) {
//            System.out.println("Необходимо ввести целое число в качестве аргумента.");
//            return;
//        }
//
//        // Получаем строку из аргументов командной строки
//        String input = args[0];
//
//        // Проверяем, что введено целое число
//        try {
//            // Пробуем преобразовать строку в целое число
//            int number = Integer.parseInt(input);
//
//            // Проверяем, что число положительное
//            if (number < 1) {
//                System.out.println("Введено некорректное число. Введите положительное целое число.");
//                return;
//            }
//
//            // Вызываем рекурсивную функцию для вычисления факториала числа
//            long result = factorial(number);
//
//            // Выводим результат
//            System.out.println("Факториал числа " + number + " = " + result);
//
//        } catch (NumberFormatException e) {
//            // Если строка не является целым числом, выводим сообщение об ошибке
//            System.out.println("Введено не целое число.");
//        }
//    }
//
//    // Рекурсивная функция для вычисления факториала числа
//    public static long factorial(int n) {
//        // Базовый случай: если n равно 0 или 1, возвращаем 1
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//
//        // Рекурсивный случай: перемножаем n на факториал (n-1)
//        return n * factorial(n - 1);
//    }
}

