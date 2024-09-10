package home_work_1.task_6;

import java.util.Objects;
import java.util.Scanner;

public class Subtask_2 implements ICommunicationPrinter{
    @Override
    public String welcom(String name) {
        if (Objects.equals(name, "Вася")) {
            return "Привет!\nЯ тебя так долго ждал.";
        }
        else if (Objects.equals(name, "Анастасия")) {
            return "Я тебя так долго ждал.";
        }
        else {
            return "Добрый день, а вы кто?";
        }
    }
//        public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input your name: ");
//        String name = in.nextLine();
//
//        if (name.equals("Вася")) {
//            System.out.println("Привет!\nЯ тебя так долго ждал.");
//
//        } else if (name.equals("Анастасия")) {
//            System.out.println("Я тебя так долго ждал.");
//        } else {
//            System.out.println("Добрый день, а вы кто?");
//        }
//
//        in.close();
//    }
}