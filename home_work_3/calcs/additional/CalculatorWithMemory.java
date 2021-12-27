package home_work_3.calcs.additional;

/*
10*. Создать CalculatorWithMemory.
	10.1 Данный калькулятор предназначен для того чтобы расширить возможности калькулятора
	и обеспечить его дополнительной функцией памяти. В принципе работает как калькулятор из реальной жизни.
	10.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	10.3 Данный класс напрямую не умеет считать математику.
	10.4 В классе должны присутствовать математические методы:
		10.4.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		10.4.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
	10.5 Функция памяти работает через методы:
		10.5.1 Записать в память результат выполнения последнего вызванного метода.
		У данного метода не должно быть параметров. Данный метод вызывается непосредтвенно пользователем, а не автоматический.
		10.5.2 Получить из памяти записанное значение. При получении записи из памяти память стирается,
		при записи нового значения память перезаписывается.
		Данный метод вызывается непосредтвенно пользователем, а не автоматический.
 */

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {

    private ICalculator calc;
    public CalculatorWithMemory (ICalculator calc){
        this.calc = calc;
    }

    private long operations;
    public long getCountOperation(){
        return operations;
    }

    private double result;
    private double temp;

    public double saveResult(){
        return result;
    }
    public double getResult(){
        temp = result ;
        temp = 0;
        return result;
    }

    public double summa(double number1, double number2) {
        operations++;
        return result = calc.summa(number1, number2);
    }

    public double vychitanie(double number1, double number2) {
        operations++;
        return result = calc.vychitanie(number1, number2);
    }

    public double umnozheniye(double number1, double number2) {
        operations++;
        return result = calc.umnozheniye(number1, number2);
    }

    public double delenie(double number1, double number2) {
        operations++;
        return result = calc.delenie(number1, number2);
    }

    public double vozvedenieVstepen(double number1, double number2) {
        operations++;
        return result = calc.vozvedenieVstepen(number1, number2);
    }

    public double module(double number1){
        operations++;
        return result = calc.module(number1);
    }

    public double korenKvadratnyChisla(double number1){
        operations++;
        return result = calc.korenKvadratnyChisla(number1);
    }
}
