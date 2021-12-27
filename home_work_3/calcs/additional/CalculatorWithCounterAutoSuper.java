package home_work_3.calcs.additional;

/*6. Создать класс CalculatorWithCounterAutoSuper.
        6.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
        6.2 Данный класс наследует класс CalculatorWithMathExtends.
        6.3 Данный класс переопределяет все методы полученные в результате наследования
        и в этих методах должен быть реализован механизм учёта их использования (учёт общий для всех методов класса),
        а вместо реализации математики при помощи ключевого слова super вызывает данный метод у родителя.
        Например вызвали метод plus(7, 3) который должен сложить два числа и вернуть результат сложения.
        Внутри метода plus() пишем реализацию учета, а после делаем вызов super.plus(7, 3).
        Использование super позволит вызвать реализацию из родительского класса.
        6.4 В классе должен быть метод long getCountOperation()
        который должен возвращать количество использований данного калькулятора.
        При вызове данного метода счётчик учёта не увеличивается.
 */

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long operations;
    public long getCountOperation(){
    return operations;
    }

    @Override
    public double summa(double number1, double number2) {
        operations++;
        return super.summa(number1, number2);
    }

    @Override
    public double vychitanie(double number1, double number2) {
        operations++;
        return super.vychitanie(number1, number2);
    }

    @Override
    public double umnozheniye(double number1, double number2) {
        operations++;
        return super.umnozheniye(number1, number2);
    }

    @Override
    public double delenie(double number1, double number2) {
        operations++;
        return super.delenie(number1, number2);
    }

    @Override
    public double vozvedenieVstepen(double number1, double number2) {
        operations++;
        return super.vozvedenieVstepen(number1, number2);
    }

    @Override
    public double module(double number1) {
        operations++;
        return super.module(number1);
    }

    @Override
    public double korenKvadratnyChisla(double number1) {
        operations++;
        return super.korenKvadratnyChisla(number1);
    }
}
