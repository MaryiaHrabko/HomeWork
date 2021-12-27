package home_work_3.calcs.additional;

/*
7. Создать класс CalculatorWithCounterAutoComposite и CalculatorWithCounterAutoAgregation.
	7.1 Все методы объявленные в данных классах НЕ статические (не имеют модификатор static).
	7.2 Внутри класса CalculatorWithCounterAutoComposite мы должны создать поле
	хранящее объект класса калькулятор и инициализировать данное поле созданным (использовать new)
	внутри данного класса объектом калькулятора.

	7.4 Данные классы напрямую не умеет считать математику,
	они умеет делегировать расчёт математики другим калькуляторам которые сохранены в полях.
	7.5 В классах должны присутствовать математические методы:
		7.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		7.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
	7.6 В классах созданных в этом задании должен быть метод long getCountOperation()
	который должен возвращать количество использований данного калькулятора.
	При вызове данного метода счётчик учёта не увеличивается.
 */

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    private CalculatorWithOperator calc;
    public CalculatorWithCounterAutoComposite(){
        this.calc = new CalculatorWithOperator();
    }

    private long operations;
    public long getCountOperation(){
        return operations;
    }

    public double summa(double number1, double number2) {
        operations++;
        return calc.summa(number1, number2);
    }

    public double vychitanie(double number1, double number2) {
        operations++;
        return calc.vychitanie(number1, number2);
    }

    public double umnozheniye(double number1, double number2) {
        operations++;
        return calc.umnozheniye(number1, number2);
    }

    public double delenie(double number1, double number2) {
        operations++;
        return calc.delenie(number1, number2);
    }

    public double vozvedenieVstepen(double number1, double number2) {
        operations++;
        return calc.vozvedenieVstepen(number1, number2);
    }

    public double module(double number1){
        operations++;
        return calc.module(number1);
    }

    public double korenKvadratnyChisla(double number1){
        operations++;
        return calc.korenKvadratnyChisla(number1);
    }
}
