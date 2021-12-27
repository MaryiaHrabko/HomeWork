package home_work_3.calcs.simple;

/*
2. Создать класс CalculatorWithOperator.
	2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	2.2 В классе должны присутствовать математические методы:
		2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение)
		каждый из этих методов должен принимать два параметра (определитесь с их типами)
		и должны возвращать результат (определиться с возвращаемым типом результата) при помощи ключевого слово return.
		2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень из числа).
	2.3 В методах можно использовать любые арифметические операторы.
	2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня).
	Если у Вас плохо с математикой, то для реализации метода "Квадратный корень из числа" можно воспользоваться библиотекой Math.
 */

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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

    public double vozvedenieVstepen(double number1, double number2){
        double result = 1;
//        if (number1 < 0){
//            System.out.println("Число отрицательное" );
//        }
        for (int i = 1; i <= number2; i++){
            result *= number1;
        }
        return Math.round(result*100)/100D;
    }

    public double module(double number1){
       return (number1 < 0) ? (number1 * (-1)) : number1;
    }

    public double korenKvadratnyChisla(double number1){
//        for (int i = 0; i * i <= number1; i++) {
//            if (i * i == number1)
//                return i;
//        }
//        return number1;
    return Math.sqrt(number1);
    }
}