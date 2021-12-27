package home_work_3.runners;

/*
4.4 Создать класс CalculatorWithMathExtendsMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляр калькулятора
	и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
//        ServiceCalculatorWithMathExtends serviceMathExtends = new ServiceCalculatorWithMathExtends();
//        service.run();

        CalculatorWithMathExtends calcMathExtend = new CalculatorWithMathExtends();

        System.out.println("Рассчет выражения 4.1 + 15 * 7 + (28/5)^2: ");
        //4.1 + 15 * 7 + (28/5)^2 = 4.1 + 105 + 5.6^2 = 4.1 + 105 + 31.36 = 140.46

        double a = calcMathExtend.umnozheniye(15,7);
        System.out.println("15*7 = " + a);
        double b = calcMathExtend.summa(4.1, a);
        System.out.println("4.1 + " + a + " = " + b);
        double c = calcMathExtend.delenie(28,5.0);
        System.out.println("28/5 = " + c);
        double d = calcMathExtend.vozvedenieVstepen(c, 2);
        System.out.println(c + "^2 = " + d);
        double result = calcMathExtend.summa(b, d);
        System.out.println("Выражение 4.1 + 15 * 7 + (28/5)^2 = " + result);

    }
}
