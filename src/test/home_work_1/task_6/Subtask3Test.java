package test.home_work_1.task_6;

import home_work_1.task_6.ICommunicationPrinter;
import home_work_1.task_6.Subtask_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Subtask3Test {

    private final ICommunicationPrinter printer = new Subtask_3();

    @Test
    @DisplayName("Тест c Васей")
    public void vasyaTest() {
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал.", printer.welcom("Вася"));
    }

    @Test
    @DisplayName("Тест c Анастасией")
    public void nastyaTest() {
        Assertions.assertEquals("Я тебя так долго ждал.", printer.welcom("Анастасия"));
    }

    @Test
    @DisplayName("Тест c Инкогнито")
    public void inkognitoTest() {
        Assertions.assertEquals("Добрый день, а вы кто?", printer.welcom("Инкогнито"));
    }
    @Test
    @DisplayName("Тест c null")
    public void nullTest() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            printer.welcom(null);
        });
    }
}
