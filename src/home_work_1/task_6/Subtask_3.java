package home_work_1.task_6;// 6.3
import java.util.Scanner;

public class Subtask_3 implements ICommunicationPrinter{

    @Override
    public String welcom(String name) {
        switch (name){
            case "Вася": {
                return "Привет!\nЯ тебя так долго ждал.";
            }
            case "Анастасия": {
                return "Я тебя так долго ждал.";
            }
            default: {
                return "Добрый день, а вы кто?";
            }
        }
    }
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input your name: ");
//        String name = in.nextLine();
//
//        switch (name){
//            case "Вася":
//                System.out.println("Привет!\nЯ тебя так долго ждал.");
//                break;
//            case "Анастасия":
//                System.out.println("Я тебя так долго ждал.");
//                break;
//            default:
//                System.out.println("Добрый день, а вы кто?");
//        }
//        in.close();
//    }
}