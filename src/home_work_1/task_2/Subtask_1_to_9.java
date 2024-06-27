package home_work_1.task_2;

public class Subtask_1_to_9 {

    public static void main(String[] args) {

        int a = 2;
        int b = 8;

        //2.1
        int result21 = 5 + 2 / 8;               //  5 + 2 / 8 = 0 (тк int тип)

        //2.2
        int result22 = (5 + 2) / 8;             //  7 / 8 = 0 (тк int тип)

        //2.3
        int result23 = (5 + a++) / 8;           //  (5 + 2) / 8 = 0 (тк int тип)

        //2.4
        a = 2;                                  //  (5 + 2) / 7 = 1
        int result24 = (5 + a++) / --b;

        //2.5
        a = 2; b = 8;
        int result25 = (5 * 2 >> a++) / --b;    //  5 * 2 = 10, в двоичном виде   0000_1010
                                                //  сдвиг вправо на 2 бита, получаем 0000_0010  2
                                                //  2 / 7 = 0 (тк int тип)

        //2.6
        a = 2; b = 8;
        int result26 = (5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --b;
        /*
        5 + 7 = 12
        12 > 20 получаем false, поэтому выбираем вторую часть (22 * 2 >> a++)
        22 * 2 = 44     0010_1100
        сдвиг на 2 бита вправо, получаем  0000_1011  11
        11 / 7 = 1 (int тип)
         */

        //2.7
        /*
        int result27 = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a++) / --b;
        Ошибка компиляции, тк тернарный оператор работает только для сомвестимых типов, а у нас:
        68 >= 68 тип boolean,
        22 * 2 >> a++ тип int.
         */

        //2.8
        boolean result28 = 6 - 2 > 3 && 12 * 12 <= 119; // 4 > 3            true
                                                        // 144 <= 119       false
                                                        // true && false =  false
        //2.9
        boolean result29 = true && false; // true && false =  false


        System.out.println("2.1: " + result21);
        System.out.println("2.2: " + result22);
        System.out.println("2.3: " + result23);
        System.out.println("2.4: " + result24);
        System.out.println("2.5: " + result25);
        System.out.println("2.6: " + result26);
        System.out.println("2.8: ERROR" );
        System.out.println("2.8: " + result28);
        System.out.println("2.9: " + result29);
    }
}