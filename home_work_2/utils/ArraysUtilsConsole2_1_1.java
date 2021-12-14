package home_work_2.utils;

import java.util.Arrays;
import java.util.Scanner;

/*
2.1. Создать класс ArraysUtils:
		2.1.1. Написать метод public static int[] arrayFromConsole() рядом с main.
		Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
			2.1.1.1. Пример int[] container = arrayFromConsole(). Результат: В методе arrayFromConsole будет запрошена информация у пользователя,
			пользователь вводит размер (3) и его элементы по порядку {4, 17, 32}.
			Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.
 */

public class ArraysUtilsConsole2_1_1 {
    public static void main(String[] args) {
        ArraysUtilsConsole2_1_1 obj = new ArraysUtilsConsole2_1_1();
        int[] container = obj.arrayFromConsole();
        System.out.println("Создан массив: " + Arrays.toString(container));
    }

    public static int[] arrayFromConsole() {
        Scanner console = new Scanner(System.in);
        System.out.println("Сколько чисел Вы хотите видеть?");
        int count = console.nextInt();
        int[] data = new int[count];

        for (int i = 0; i < data.length; i++) {
            System.out.println("Введите число");
            data[i] = console.nextInt();
        }
        return data;
    }
}