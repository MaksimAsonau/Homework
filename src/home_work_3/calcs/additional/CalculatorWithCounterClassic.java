package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long count;                 // Поле для хранения количества операций

    public void incrementCountOperation() { // Метод для увеличения счётчика операций
        count++;
    }

    public long getCountOperation() {                // Метод для получения количества операций
        return count;
    }
}
