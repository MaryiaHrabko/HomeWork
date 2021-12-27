package home_work_3.runners;

/*
9.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляр калькулятора
	и используя методы из данного экземпляра посчитать выражения из задания 1.
	Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        ICalculator calc1 = new CalculatorWithOperator();
        ICalculator calc2 = new CalculatorWithMathCopy();
        ICalculator calc3 = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoAgregationInterface calcAutoAgregationInterface = new CalculatorWithCounterAutoAgregationInterface(calc2);

        System.out.println("Рассчет выражения 4.1 + 15 * 7 + (28/5)^2: ");
        //4.1 + 15 * 7 + (28/5)^2 = 4.1 + 105 + 5.6^2 = 4.1 + 105 + 31.36 = 140.46

        double a = calcAutoAgregationInterface.umnozheniye(15,7);
        System.out.println("15*7 = " + a);

        double b = calcAutoAgregationInterface.summa(4.1, a);
        System.out.println("4.1 + " + a + " = " + b);

        double c = calcAutoAgregationInterface.delenie(28,5.0);
        System.out.println("28/5 = " + c);

        double d = calcAutoAgregationInterface.vozvedenieVstepen(c, 2);
        System.out.println(c + "^2 = " + d);

        double result = calcAutoAgregationInterface.summa(b, d);
        System.out.println("Выражение 4.1 + 15 * 7 + (28/5)^2 = " + result);
        System.out.println("Количество математических операций: " + calcAutoAgregationInterface.getCountOperation());
    }
}
