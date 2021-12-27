package home_work_3.calcs.api;

/*
8. Создать интерфейс ICalculator. Данный интерфейс создайте в пакете calcs.api.
	8.1 В данном интерфейсе должны быть объявлены методы:
		8.1.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		8.1.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
	8.2 На данный момент данный интерфейс вы должны прописать во всех классах калькуляторов созданных нами
	в пакетах calcs.simple.
 */

public interface ICalculator {
    double summa(double num1, double num2);
    double vychitanie(double num1, double num2);
    double umnozheniye(double num1, double num2);
    double delenie(double num1, double num2);
    double vozvedenieVstepen(double num1, double num2);
    double module(double num1);
    double korenKvadratnyChisla(double num1);
}
