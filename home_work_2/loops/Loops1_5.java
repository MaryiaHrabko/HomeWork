package home_work_2.loops;

/*
 1.5. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке
 */

import java.util.Scanner;

public class Loops1_5 {
    public static void main(String[] args) {

        for (int m = 1; m <= 10; m++) {
            for (int n = 2; n <= 5; n++) {
                System.out.print(n + " x " + m + " = " + (m*n) + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int m = 1; m <= 10; m++) {
            for(int n = 6; n <= 9; n++) {
                System.out.print(n + " x " + m + " = " + (m*n) + "\t");
            }
            System.out.println();
        }
    }
}
