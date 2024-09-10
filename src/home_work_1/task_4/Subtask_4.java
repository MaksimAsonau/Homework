package home_work_1.task_4;

import java.util.Scanner;

public class Subtask_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");
        double number = in.nextDouble();

        System.out.print("Input 'b' for bytes, 'k' for kilobytes: ");
        char charValue = in.next().toLowerCase().charAt(0);

        switch (charValue) {
            case 'b':
                double numberInBytes = convertKilobytesToBytes(number);
                System.out.println(number + " kilobytes = " + numberInBytes + " bytes");
                break;
            case 'k':
                double numberInKilobytes = convertBytesToKilobytes(number);
                System.out.println(number + " bytes = " + numberInKilobytes + " kilobytes");
                break;
            default:
                System.out.println("Input 'b' or 'k'");
                break;
        }
        in.close();
    }

    // Метод для перевода килобайтов в байты
    public static double convertKilobytesToBytes(double kilobytes) {
        if (kilobytes >= 0) {
            return kilobytes * 1024;
        }
        return -1;
    }

    // Метод для перевода байтов в килобайты
    public static double convertBytesToKilobytes(double bytes) {
        if (bytes >= 0) {
            return bytes / 1024;
        }
        return -1;
    }
}
