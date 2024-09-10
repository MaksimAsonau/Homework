package home_work_1.task_7;

public class Subtask_1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(formatNumber(arr));
    }

    public static String formatNumber(int[] arr) {
        if (arr.length != 10) {
            return "Неверное количество символов";
        }

        for (int num : arr) {
            if (num < 0 || num >= 10) {
                return "Неверный формат числа в массиве";
            }
        }

        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                arr[0], arr[1], arr[2],
                arr[3], arr[4], arr[5],
                arr[6], arr[7], arr[8], arr[9]);
    }
}
