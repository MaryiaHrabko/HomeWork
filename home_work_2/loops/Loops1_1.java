package home_work_2.loops;

//import java.util.Scanner;

/*
1. Циклы. Для преобразования строки в число можно использовать http://proglang.su/java/numbers-parseint, если хотите можете добавить проверки на корректность ввода данных. Число положительное, максимум long:
    1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю. Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
    	1.1.1. Используя только цикл
 */

public class Loops1_1 {
    public static void main(String[] args) {
        for (String number : args) {
            int a = Integer.parseInt(args[0]);

            if (a == 0) {
                System.out.println("Факторил !0 равен 1");
                return;
            }

            if (a < 0) {
                System.out.println("Пожалуйста введите число больше 0");
                return;
            }

            String num = "", separator = "";
            long result = 1;
            for (int i = 1; i <= a; i++) {
                result *= i;
                num = num + separator + i;
                separator = " * ";
            }
            System.out.println("Факторил " + a + "! равен " + num + " = " + result);
        }
    }
}


//public class Loops1_1 {
//    public static void main(String[] args) {
//          Scanner console = new Scanner(System.in);
//          System.out.println("Введите целое число");
//          int n = console.nextInt();
//
//          long number = factorial(n);
//          //String numbers = factorial.num;
//          System.out.println("Факторил " + n + "! равен " + number);
//      }
//
//      public static long factorial(int n){
//          long result = 1;
//          for (int i = 1; i <= n; i++) {
//              result *= i;
//          }
//          return result;
//    }
//}
