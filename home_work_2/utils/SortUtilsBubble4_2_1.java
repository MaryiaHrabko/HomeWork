package home_work_2.utils;

import java.util.Arrays;

/*
Выполнить сортировку массива с числами:
	4.1. После каждой сортировки в консоли у вас должно получиться "[Какой массив был до сортировки] -> [Каким стал массив после сортировки]".
	Для преобразования массива в текст можно использовать класс Arrays.
	4.2. Создать класс SortsUtils. Пишем в нём следующие алгоритмы:
		4.2.1. Пузырьковая сортировка
 */

public class SortUtilsBubble4_2_1 {
    public static void main(String[] args) {
        int[] array = {11, 3, 14, 16, 7};
        System.out.println("Массив до сортировки: " + Arrays.toString(array));
        bubbleSort(array);
    }

        public static void bubbleSort (int[] array){
        boolean isSorted = false;
        int b;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    b = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = b;
                }
            }
        }
        System.out.println("Массив после пузырьковой сортировки: " + Arrays.toString(array));
    }
}
