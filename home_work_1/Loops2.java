package home_work_1;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        String name1 = "Вася";
        String name2 = "Анастасия";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String namen = in.nextLine();
        System.out.printf("Имя: %s \n", namen);
        if (name1.equalsIgnoreCase(namen)) {
            System.out.println("Привет!" );
            System.out.println("Я тебя так долго ждал.");
        }

        else if (name2.equalsIgnoreCase(namen)) {
            System.out.println("Я тебя так долго ждал.");
        }

        else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}