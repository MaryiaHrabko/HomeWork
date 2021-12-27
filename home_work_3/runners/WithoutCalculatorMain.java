package home_work_3.runners;

/*
1. Создать класс WithoutCalculatorMain в котором необходимо посчитать следующие выражения:
	1.1 4.1 + 15 * 7 + (28 / 5) ^ 2.
	Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.
 */

public class WithoutCalculatorMain {
    public static void main(String[] args) {
       String itog = raschet();
       System.out.println(itog);
       //4.1 + 15 * 7 + (28/5)^2 = 4.1 + 105 + 5.6^2 = 4.1 + 105 + 31.36 = 140.46
    }
    public static String raschet(){
        int a = 15*7;
        double b = 4.1 + a;
        double c = 28.0/5.0;
        double d = Math.pow(c, 2.0);
        double result = b + d;
        return String.format("%.2f",result);
    }
}

