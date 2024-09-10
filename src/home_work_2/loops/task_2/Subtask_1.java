/*
1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход
вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что
пользователь ввёл некорректные данные.
1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
 */

package home_work_2.loops.task_2;

public class Subtask_1 {
    // Метод для проверки и обработки входных данных
    public String validateAndProcessInput(String input) {
        if (input == null || input.isEmpty()) {
            return "Необходимо ввести одно целое число в качестве аргумента.";
        }

        if (!input.matches("-?\\d+")) {  // Учтем отрицательные числа
            return "Вы ввели не целое число.";
        }

        if (input.startsWith("-")) {  // Проверяем, если число отрицательное
            return "Введите положительное число.";
        }

        long product = calculateProductOfDigits(input); // Вычисляем произведение цифр числа
        return getCalculationSteps(input, product); // Возвращаем строку с ходом вычислений
    }

    // Метод для вычисления произведения цифр числа, принимает строку с числом
    public long calculateProductOfDigits(String numberStr) {
        long product = 1;
        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            product *= digit;
        }
        return product;
    }

    // Метод для получения строки с ходом вычислений и результатом, принимает строку с числом и произведение его цифр
    public String getCalculationSteps(String numberStr, long product) {
        StringBuilder steps = new StringBuilder();
        for (int i = 0; i < numberStr.length(); i++) {
            if (i > 0) {
                steps.append(" * ");
            }
            steps.append(numberStr.charAt(i));
        }
        steps.append(" = ").append(product);
        return steps.toString();
    }
}
