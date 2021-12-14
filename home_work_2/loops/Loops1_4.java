package home_work_2.loops;

/*
 1.4.* Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением до переполнения и после переполнения. Умножать на:
    	1.4.1. 3
    	1.4.2. 188
    	1.4.3. -19
    	1.4.4. Да и вообще на любое целочисленное
 */

public class Loops1_4 {
    public static void main(String[] args) {
        long a = 1;
        int b = 3;
        long result = a * b;
        do  {
            if (result >= Long.MAX_VALUE) {
                System.out.println("9_223_372_036_854_775_807");
            } else {
                System.out.println("Результат " + result * b);
                break;
            }
        } while (result <= Long.MAX_VALUE);
    }
}
