package home_work_3.runners;

/*
5.5 Создать класс CalculatorWithCounterClassicMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляр калькулятора
	и используя методы из данного экземпляра посчитать выражения из задания 1,
	при каждой математической операции самостоятельно вызывать метод incrementCountOperation() для увеличения счётчика.
	Вывести в консоль результат.
 */

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calcCounter = new CalculatorWithCounterClassic();

        System.out.println("Рассчет выражения 4.1 + 15 * 7 + (28/5)^2: ");
        //4.1 + 15 * 7 + (28/5)^2 = 4.1 + 105 + 5.6^2 = 4.1 + 105 + 31.36 = 140.46

        double a = calcCounter.umnozheniye(15,7);
        calcCounter.incrementCountOperation();
        System.out.println("15*7 = " + a);

        double b = calcCounter.summa(4.1, a);
        calcCounter.incrementCountOperation();
        System.out.println("4.1 + " + a + " = " + b);

        double c = calcCounter.delenie(28,5.0);
        calcCounter.incrementCountOperation();
        System.out.println("28/5 = " + c);

        double d = calcCounter.vozvedenieVstepen(c, 2);
        calcCounter.incrementCountOperation();
        System.out.println(c + "^2 = " + d);

        double result = calcCounter.summa(b, d);
        calcCounter.incrementCountOperation();
        System.out.println("Выражение 4.1 + 15 * 7 + (28/5)^2 = " + result);
        System.out.println("Количество математических операций: " + calcCounter.getCountOperation());
    }
}
