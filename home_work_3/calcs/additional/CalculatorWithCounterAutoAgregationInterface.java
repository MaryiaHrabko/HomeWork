package home_work_3.calcs.additional;

/*
9. Создать класс CalculatorWithCounterAutoAgregationInterface.
	9.1 Внутри класса нельзя создавать объекты (использовать new),
	можно пользоваться только тем что передал вам пользователь вашего класса.
	9.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	9.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
	9.4 Данный класс напрямую не умеет считать математику,
	он умеет делегировать расчёт математики другим калькуляторам переданным в конструктор
	9.5 В классе должны присутствовать все методы объявленные в интерфейсе.
	9.6 В классе должен быть метод long getCountOperation()
	который должен возвращать количество использований данного калькулятора.
	При вызове данного метода счётчик учёта не увеличивается.
 */

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {

    private ICalculator calculator;
    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator){
        this.calculator = calculator;
    }

    private long operations;
    public long getCountOperation(){
        return operations;
    }

    public double summa (double number1, double number2){
        operations++;
        return calculator.summa(number1, number2);
    }

    public double vychtanie (double number1, double number2){
        operations++;
        return calculator.vychitanie(number1, number2);
    }

    public double umnozheniye(double number1, double number2){
        operations++;
        return calculator.umnozheniye(number1, number2);
    }

    public double delenie (double number1, double number2){
        operations++;
        return calculator.delenie(number1, number2);
    }

    public double vozvedenieVstepen(double number1, double number2){
        operations++;
        return calculator.vozvedenieVstepen(number1, number2);
    }

    public double module(double number1){
        operations++;
        return calculator.module(number1);
    }

    public double korenKvadratnyChisla(double number1){
        operations++;
        return calculator.korenKvadratnyChisla(number1);
    }
}
