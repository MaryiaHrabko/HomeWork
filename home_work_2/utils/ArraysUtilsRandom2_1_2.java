package home_work_2.utils;

import java.util.Arrays;
import java.util.Random;

/*
2.1. Создать класс ArraysUtils:
		2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main. Данный метод принимает два аргумента.
		Первый (size) указывает размер массива который мы хотим получить. Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
			2.1.2.1. Пример: int[] container = arrayRandom(5, 100).
			Результат: В методе arrayRandom будет создан массив размером 5 с числами от 0 до 99 (использовать класс Random) и сохранён в переменную container.
 */

public class ArraysUtilsRandom2_1_2 {
    public static void main(String[] args) {
        ArraysUtilsRandom2_1_2 obj = new ArraysUtilsRandom2_1_2();
        int[] container = obj.arrayRandom(5,100);
        System.out.println("Создан массив: " + Arrays.toString(container));
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int [] data = new int[size];
        Random rand = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(maxValueExclusion);
        }
        return data;
    }
}
