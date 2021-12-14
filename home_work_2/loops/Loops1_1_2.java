package home_work_2.loops;

import java.util.Scanner;

/*
1. Циклы. Для преобразования строки в число можно использовать http://proglang.su/java/numbers-parseint, если хотите можете добавить проверки на корректность ввода данных. Число положительное, максимум long:
        1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю. Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
            1.1.2.* Используя рекурсию
 */
public class Loops1_1_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число");
        int n = console.nextInt();

        long number = factorial(n);
        System.out.println(number);
    }

    public static long factorial(int n) {
        long result = 1;

        if (n == 0) {
            System.out.print("Факторил !0  =");
            return result;
        }
        if (n == 1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(n);
        if (n != 2) {
            System.out.print(" * ");
        }

        result = n * factorial(n-1);
        return result;
    }
}

