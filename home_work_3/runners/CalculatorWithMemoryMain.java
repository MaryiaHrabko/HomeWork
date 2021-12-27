package home_work_3.runners;

/*
10.6 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляр калькулятора
	и используя методы из данного экземпляра посчитать выражения из задания 1.
	Вывести в консоль результат. В мэйне запрещается использование переменных для хранения значений участвующих
	в просчёте, а также результатов работы методов калькулятора, можно использовать только литералы
	и метод получения из памяти записанного значения.
 */

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithMathCopy();
        CalculatorWithMemory calcWithMemory = new CalculatorWithMemory(calc);

        System.out.println("Рассчет выражения 4.1 + 15 * 7 + (28/5)^2: ");
        //4.1 + 15 * 7 + (28/5)^2 = 4.1 + 105 + 5.6^2 = 4.1 + 105 + 31.36 = 140.46

        double a = calcWithMemory.umnozheniye(15,7);
        System.out.println("15*7 = " + a);

        double b = calcWithMemory.summa(4.1, a);
        System.out.println("4.1 + " + a + " = " + b);

        double c = calcWithMemory.delenie(28,5.0);
        System.out.println("28/5 = " + c);

        double d = calcWithMemory.vozvedenieVstepen(c, 2);
        System.out.println(c + "^2 = " + d);

        double result = calcWithMemory.summa(b, d);
        System.out.println("Выражение 4.1 + 15 * 7 + (28/5)^2 = " + result);
        System.out.println("Количество математических операций: " + calcWithMemory.getCountOperation());
        System.out.println(calcWithMemory.saveResult());

        double result2 = calcWithMemory.summa(result, 5);
        System.out.println(calcWithMemory.getResult());

        double result3 = calcWithMemory.umnozheniye(result2, 2);
        System.out.println(calcWithMemory.getResult());
    }
}
