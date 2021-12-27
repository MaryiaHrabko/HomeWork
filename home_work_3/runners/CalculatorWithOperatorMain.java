package home_work_3.runners;

/*
2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляр калькулятора
	и используя методы из данного экземпляра посчитать выражения из задания 1.
	Вывести в консоль результат.
 */

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
//        ServiceCalculatorWithOperator service = new ServiceCalculatorWithOperator();
//        service.run();

        CalculatorWithOperator calc = new CalculatorWithOperator();

        System.out.println("Рассчет выражения 4.1 + 15 * 7 + (28/5)^2: ");
        //4.1 + 15 * 7 + (28/5)^2 = 4.1 + 105 + 5.6^2 = 4.1 + 105 + 31.36 = 140.46

        double a = calc.umnozheniye(15,7);
        System.out.println("15*7 = " + a);
        double b = calc.summa(4.1, a);
        System.out.println("4.1 + " + a + " = " + b);
        double c = calc.delenie(28,5.0);
        System.out.println("28/5 = " + c);
        double d = calc.vozvedenieVstepen(c, 2);
        System.out.println(c + "^2 = " + d);
        double result = calc.summa(b, d);
        System.out.println("Выражение 4.1 + 15 * 7 + (28/5)^2 = " + result);
    }
}
