package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {

//        ICalculator calc = new CalculatorWithCounterAutoDecorator(
//                new CalculatorWithMemoryDecorator(
//                        new CalculatorWithMathExtends()
//                )
//        );
        ICalculator calc = new CalculatorWithCounterClassic();

        // Вычисляем значение выражения:  4.1 + 15 * 7 + (28 / 5) ^ 2
        double result1 = calc.divide(28, 5.0);
        double result2 = calc.pow(result1, 2);
        double result3 = calc.multiply(15, 7);
        double result4 = calc.add(4.1, result3);
        double finalResult = calc.add(result2, result4);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + finalResult);

        //  Проверяем, является ли объект calc экземпляром CalculatorWithCounterAutoDecorator.
        //  Делаем это, потому что методы getCount() и getCalc() определены только в этом классе.
        if (calc instanceof CalculatorWithCounterAutoDecorator) {
            CalculatorWithCounterAutoDecorator calcDecorator = (CalculatorWithCounterAutoDecorator) calc;
            System.out.println("Количество использований калькулятора: " + calcDecorator.getCount());

            // Проверяем, является ли объект calcMemory, полученный через метод getCalc(), экземпляром CalculatorWithMemoryDecorator.
            // Делаем это для вызова методов save() и load(), которые определены в CalculatorWithMemoryDecorator.
            ICalculator calcMemory = calcDecorator.getCalc();
            if (calcMemory instanceof CalculatorWithMemoryDecorator) {
                CalculatorWithMemoryDecorator memoryDecorator = (CalculatorWithMemoryDecorator) calcMemory;
                memoryDecorator.save();
                System.out.println("Сохранённое значение: " + memoryDecorator.load());
            }
        }
        // Использование instanceof позволяет безопасно приводить объекты, для последующего доступа к
        // дополнительным методам. В нашеи случае, методы getCount(), save(), и load() доступны только через
        // декораторы, и проверка типа позволяет нам использовать эти методы. И наоборот, добавив 17 строку,
        // мы (безопасно) теряем доступ к этим методам.
    }
}
