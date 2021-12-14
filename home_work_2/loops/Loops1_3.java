package home_work_2.loops;

/*
1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить, Второе число это степень в которую возводят первое число. Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
		1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
		1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */

import java.util.Scanner;

public class Loops1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = console.nextDouble();
        System.out.println("Введите второе число");
        int b = console.nextInt();
        if (b == 0) {
            System.out.println("Возведение любого числа в нулевую степень всегда равно 1");
            return;
        } else if (b < 0) {
            System.out.println("Степень числа не может быть отрицательной");
        } else {

            double result = 1;
            for (int i = 1; i <= b; i++) {
                result *= a;

            }
            System.out.println("Возведение числа " + a + " в степень " + b + " равна " + a + "^" + b + " = " + result);
        }
    }
}
