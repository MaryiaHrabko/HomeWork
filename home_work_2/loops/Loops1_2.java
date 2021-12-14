package home_work_2.loops;

//import java.util.Scanner;

import java.util.Scanner;

/*
 1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
 */
public class Loops1_2 {
    public static void main(String[] args) {
        for (String number : args) {
            int n = Integer.parseInt(args[0]);
//        Scanner console = new Scanner(System.in);

//        if(console.hasNextInt()) {
//            n = console.nextInt();
//            System.out.println("Вы ввели: " + n);
//
//        } else if (console.hasNextDouble()){
//            System.out.println("Вы ввели не целое число");
//        } else {
//            System.out.println("Введено не число");
//        }
            String num = "", separator = "";
            long result = 1;

            while (n > 0) {
                int partNumber = n % 10;
                result *= partNumber;
                num =  partNumber + separator + num;
                separator = " * ";
                n /= 10;
            }
            System.out.println("Произведение чисел равно " + num + " = " + result);
        }
    }
}
