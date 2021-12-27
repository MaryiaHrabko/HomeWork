package home_work_3.runners;

/*
6.5 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод).
        В main методе требуется создать экземпляр калькулятора
        и используя методы из данного экземпляра посчитать выражения из задания 1.
        Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calcCounterAuto = new CalculatorWithCounterAutoSuper();

        System.out.println("Рассчет выражения 4.1 + 15 * 7 + (28/5)^2: ");
        //4.1 + 15 * 7 + (28/5)^2 = 4.1 + 105 + 5.6^2 = 4.1 + 105 + 31.36 = 140.46

        double a = calcCounterAuto.umnozheniye(15,7);
        System.out.println("15*7 = " + a);

        double b = calcCounterAuto.summa(4.1, a);
        System.out.println("4.1 + " + a + " = " + b);

        double c = calcCounterAuto.delenie(28,5.0);
        System.out.println("28/5 = " + c);

        double d = calcCounterAuto.vozvedenieVstepen(c, 2);
        System.out.println(c + "^2 = " + d);

        double result = calcCounterAuto.summa(b, d);
        System.out.println("Выражение 4.1 + 15 * 7 + (28/5)^2 = " + result);
        System.out.println("Количество математических операций: " + calcCounterAuto.getCountOperation());
    }
}
