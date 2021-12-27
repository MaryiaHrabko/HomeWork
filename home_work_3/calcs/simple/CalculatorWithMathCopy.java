package home_work_3.calcs.simple;

/*
3. Создать класс CalculatorWithMathCopy.
	3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	3.2 В классе должны присутствовать математические методы:
		3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		Скопировать базовые математические операции из CalculatorWithOperator.
		3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
		Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
 */

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    public double summa(double number1, double number2) {
        return number1 + number2;
    }

    public double vychitanie(double number1, double number2) {
        return number1 - number2;
    }

    public double umnozheniye(double number1, double number2) {
        return number1 * number2;
    }

    public double delenie(double number1, double number2) {
        return number1 / number2;
    }

    public double vozvedenieVstepen(double number1, double number2) {
        return Math.pow(number1, number2);
    }

    public double module(double number1){
        return Math.abs(number1);
    }

    public double korenKvadratnyChisla(double number1){
        return Math.sqrt(number1);
    }
}
