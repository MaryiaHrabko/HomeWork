package home_work_3.calcs.additional;

/*
7. Создать класс CalculatorWithCounterAutoComposite и CalculatorWithCounterAutoAgregation.
	7.1 Все методы объявленные в данных классах НЕ статические (не имеют модификатор static).

	7.3 Внутри класса CalculatorWithCounterAutoAgregation нельзя создавать объекты (использовать new),
	можно пользоваться только тем что передал вам другой программист при использовании вашего класса в конструктор.
		7.3.1 В данном классе должны быть следующие варианты конструктора:
			7.3.1.1 Принимающий объект типа CalculatorWithOperator
			7.3.1.2 Принимающий объект типа CalculatorWithMathCopy
			7.3.1.3 Принимающий объект типа CalculatorWithMathExtends
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

public class CalculatorWithCounterAutoAgregation {

    private CalculatorWithOperator calc;
    private CalculatorWithMathCopy calcWithMath;
    private CalculatorWithMathExtends calcWithMathExtends;

     public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calc){
       this.calc = calc;
     }
     public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calcWithMath){
         this.calcWithMath = calcWithMath;
     }
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends calcWithMathExtends){
         this.calcWithMathExtends = calcWithMathExtends;
     }

    private long operations;
    public long getCountOperation(){
        return operations;
    }


    public double summa (double number1, double number2){
        operations++;
        if (calc != null){
            return calc.summa(number1, number2);
        } else if (calcWithMath != null){
            return calcWithMath.summa(number1, number2);
        } else {
            return calcWithMathExtends.summa(number1, number2);
        }
    }

    public double vychitanie(double number1, double number2) {
        operations++;
        if (calc != null){
            return calc.vychitanie(number1, number2);
        } else if (calcWithMath != null){
            return calcWithMath.vychitanie(number1, number2);
        } else {
            return calcWithMathExtends.vychitanie(number1, number2);
        }
    }

    public double umnozheniye(double number1, double number2){
        operations++;
        if (calc != null){
            return calc.umnozheniye(number1, number2);
        } else if (calcWithMath != null){
            return calcWithMath.umnozheniye(number1, number2);
        } else {
            return calcWithMathExtends.umnozheniye(number1, number2);
        }
    }


    public double delenie(double number1, double number2){
        operations++;
        if (calc != null){
            return calc.delenie(number1, number2);
        } else if (calcWithMath != null){
            return calcWithMath.delenie(number1, number2);
        } else {
            return calcWithMathExtends.delenie(number1, number2);
        }
    }

    public double vozvedenieVstepen(double number1, double number2){
        operations++;
        if (calc != null){
            return calc.vozvedenieVstepen(number1, number2);
        } else if (calcWithMath != null){
            return calcWithMath.vozvedenieVstepen(number1, number2);
        } else {
            return calcWithMathExtends.vozvedenieVstepen(number1, number2);
        }
    }

    public double module(double number1){
        operations++;
        if (calc != null){
            return calc.module(number1);
        } else if (calcWithMath != null){
            return calcWithMath.module(number1);
        } else {
            return calcWithMathExtends.module(number1);
        }
    }

    public double korenKvadratnyChisla(double number1){
        operations++;
        if (calc != null){
            return calc.korenKvadratnyChisla(number1);
        } else if (calcWithMath != null){
            return calcWithMath.korenKvadratnyChisla(number1);
        } else {
            return calcWithMathExtends.korenKvadratnyChisla(number1);
        }
    }
}
