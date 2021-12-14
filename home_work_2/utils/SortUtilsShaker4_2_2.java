package home_work_2.utils;


import java.util.Arrays;

/*
Выполнить сортировку массива с числами:
	4.1. После каждой сортировки в консоли у вас должно получиться "[Какой массив был до сортировки] -> [Каким стал массив после сортировки]".
	Для преобразования массива в текст можно использовать класс Arrays.
	4.2. Создать класс SortsUtils. Пишем в нём следующие алгоритмы:
		4.2.2. Шейкерная сортировка
 */
public class SortUtilsShaker4_2_2 {
    public static void main(String[] args) {
        int[] arr = {11, 3, 14, 16, 7};
        System.out.println("Массив до сортировки: " + Arrays.toString(arr));

        int b;
        int leftSide = 0;
        int rightSide = arr.length - 1;

        do {
            for (int i = leftSide; i < rightSide; i++) {
                if (arr[i] > arr[i + 1]) {
                    b = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = b;
                }
            }
            rightSide--; // Уменьшаем количество проходов
            for (int i = rightSide; i > leftSide; i--) {
                if (arr[i] < arr[i - 1]) {
                    b = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = b;
                }
            }
            leftSide++; // Уменьшаем количество проходов
        } while (leftSide <= rightSide); // Условие при котором будут происходить проходки

            System.out.println("Массив после шейкерной сортировки: " + Arrays.toString(arr));
    }
}

