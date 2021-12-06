package home_work_1;

import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String namen = in.nextLine();
        System.out.printf("Имя: %s \n", namen);
        switch (namen){
            case "Вася":
                //Можно ли сделать нечувствительность к регистру в данном случае ??
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал.");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал.");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
