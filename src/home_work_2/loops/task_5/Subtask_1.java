/*
1.5. Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах.
    	1.5.1. Найти наибольшую цифру натурального числа
    	1.5.2. Вероятность четных случайных чисел
    	1.5.3. Посчитать четные и нечетные цифры числа
    	1.5.4. Ряд Фибоначчи
    	1.5.5. Вывести ряд чисел в диапазоне с шагом
    	1.5.6. Переворот числа
 */

package home_work_2.loops.task_5;

import java.util.Arrays;
import java.util.Random;


public class Subtask_1 {

    // Метод для нахождения наибольшей цифры в натуральном числе
    public static int findMaxDigit(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Введенное число должно быть натуральным и больше нуля.");
        }

        int maxDigit = number % 10; // Начинаем с последней цифры
        number = number / 10;       // Удаляем последнюю цифру

        while (number > 0) {
            int digit = number % 10; // Извлекаем последнюю цифру
            if (digit > maxDigit) {
                maxDigit = digit;    // Обновляем максимальную цифру
            }
            number = number / 10;    // Удаляем последнюю цифру
        }

        return maxDigit;
    }

    // Метод расчета вероятности четных случайных чисел
    public static double calculateEvenProbability(int totalNumbers) {
        Random random = new Random();
        int evenCount = 0;

        for (int i = 0; i < totalNumbers; i++) {
            int number = random.nextInt();
            if (number % 2 == 0) {
                evenCount++;
            }
        }
        return (evenCount * 100.0) / totalNumbers;
    }

    // метод подсчета количества четных цифр в числе
    public static int evenDigitsCounter(int number) {
        number = Math.abs(number);
        int evenCount = 0;

        while (number > 0) {
            evenCount += (number % 10) % 2 == 0 ? 1 : 0; // Увеличиваем счетчик, если цифра четная
            number /= 10; // Удаление последней цифры
        }
        return evenCount;
    }

    // метод подсчета количества нечетных цифр в числе
    public static int oddDigitsCounter(int number) {
        number = Math.abs(number); // Обработка отрицательных чисел
        int oddCount = 0;

        while (number > 0) {
            // Увеличиваем счетчик, если цифра нечетная
            oddCount += (number % 10) % 2 != 0 ? 1 : 0;
            number /= 10; // Удаление последней цифры
        }

        return oddCount;
    }

    // метод для вывода ряда чисел Фибоначчи
    public static String showFibonacci(int num) {
        int numToEndWith = Math.abs(num);

        int[] fibArray = new int[numToEndWith];

        if (numToEndWith >= 1) {
            fibArray[0] = 1;
        }
        if (numToEndWith >= 2) {
            fibArray[1] = 2;
        }

        for (int i = 2; i < numToEndWith; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        return Arrays.toString(fibArray);
    }

    // метод для вывода ряда ряд чисел в диапазоне с шагом
    public static String lineMinMaxStepNumbers(int min, int max, int step) {
        StringBuilder sb = new StringBuilder();

        if (min > max) {
            throw new IllegalArgumentException("min не может быть больше max");
        }

        for (int i = min; i <= max; i += step) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i);
        }
        return sb.toString();
    }

    // метод для переворота числа
    public static int reverseNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("нельзя перевернуть отрицательное число");
        }
        if (number == 0) {
            return 0; // Возвращаем 0, если введено 0
        }

        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;   // Извлекаем последнюю цифру
            reversed = reversed * 10 + digit;  // Добавляем цифру к результату
            number /= 10;   // Убираем последнюю цифру числа
        }
        return reversed;
    }
}
