package home_work_3.runners;

/*
	7.7 Создать класс CalculatorWithCounterDelegateMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляры калькуляторов созданных из классов из этого задания
	и используя методы из экземпляра посчитать выражения из задания 1.
	Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;


public class CalculatorWithCounterAutoDelegateMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoAgregation calcAutoAgregation = new CalculatorWithCounterAutoAgregation(calc2);
        CalculatorWithCounterAutoComposite calcAutoComposite = new CalculatorWithCounterAutoComposite();

        System.out.println("Рассчет выражения 4.1 + 15 * 7 + (28/5)^2: ");
        //4.1 + 15 * 7 + (28/5)^2 = 4.1 + 105 + 5.6^2 = 4.1 + 105 + 31.36 = 140.46

        double a = calcAutoAgregation.umnozheniye(15,7);
        System.out.println("15*7 = " + a);

        double b = calcAutoAgregation.summa(4.1, a);
        System.out.println("4.1 + " + a + " = " + b);

        double c = calcAutoAgregation.delenie(28,5.0);
        System.out.println("28/5 = " + c);

        double d = calcAutoAgregation.vozvedenieVstepen(c, 2);
        System.out.println(c + "^2 = " + d);

        double result = calcAutoAgregation.summa(b, d);
        System.out.println("Выражение 4.1 + 15 * 7 + (28/5)^2 = " + result);
        System.out.println("Количество математических операций: " + calcAutoAgregation.getCountOperation());
        System.out.println("------------------");


        double a1 = calcAutoComposite.umnozheniye(15,7);
        System.out.println("15*7 = " + a1);

        double b1 = calcAutoComposite.summa(4.1, a1);
        System.out.println("4.1 + " + a1 + " = " + b1);

        double c1 = calcAutoComposite.delenie(28,5.0);
        System.out.println("28/5 = " + c1);

        double d1 = calcAutoComposite.vozvedenieVstepen(c1, 2);
        System.out.println(c1 + "^2 = " + d1);

        double result1 = calcAutoComposite.summa(b1, d1);
        System.out.println("Выражение 4.1 + 15 * 7 + (28/5)^2 = " + result1);
        System.out.println("Количество математических операций: " + calcAutoComposite.getCountOperation());
    }
}
