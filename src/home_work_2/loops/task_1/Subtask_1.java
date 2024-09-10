/*
 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
 Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
 1.1.1. Используя только цикл
 */

package home_work_2.loops.task_1;

public class Subtask_1 implements IMultiply{
    @Override
    public long calculateFactorial(long number) {
        long result = 1;

        for (long i = 1; i <= number; i++) {
            // Проверка на переполнение при каждом шаге
            if (result > Long.MAX_VALUE / i) {
                return -1; // Возвращаем -1 при переполнении
            }
            result *= i;
        }
        return result;
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
//        String input = args[0]; // Получаем строку из аргументов командной строки
//
//
//        try { // Проверяем, что введено целое число
//
//            int number = Integer.parseInt(input); // Пробуем преобразовать строку в целое число
//
//            if (number < 1) { // Проверяем, что число положительное
//                System.out.println("Введено некорректное число. Введите положительное целое число.");
//                return;
//            }
//
//
//            long result = 1; // Переменная для хранения результата умножения
//
//            StringBuilder output = new StringBuilder(); // Строка для построения вывода промежуточных вычислений
//
//            for (int i = 1; i <= number; i++) { // Перемножаем числа от 1 до введенного числа
//
//                if (result > Long.MAX_VALUE / i) { // Проверяем на переполнение перед умножением
//                    System.out.println("Произошло переполнение при умножении числа " + i);
//                    return;
//                }
//
//                result *= i;
//
//                output.append(i); // Добавляем число в строку вывода
//                if (i < number) {
//                    output.append(" * ");
//                }
//            }
//
//            output.append(" = ").append(result); // Добавляем итоговый результат
//
//            System.out.println(output.toString()); // Выводим результат
//
//        } catch (NumberFormatException e) {
//            // Если строка не является целым числом, выводим сообщение об ошибке
//            System.out.println("Введено не целое число.");
//        }
//    }
}

