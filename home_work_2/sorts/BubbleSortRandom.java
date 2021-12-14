package home_work_2.sorts;

import home_work_2.utils.ArraysUtilsRandom2_1_2;

import java.util.Arrays;

/*
4.4. После тестов написать код который будет массив через ранее созданный arrayRandom. Отсортировать.
 */

import static home_work_2.utils.SortUtilsBubble4_2_1.bubbleSort;

public class BubbleSortRandom {
    public static void main(String[] args) {
        int [] array = ArraysUtilsRandom2_1_2.arrayRandom(5, 100);
        System.out.println("Массив до сортировки: " + Arrays.toString(array));
        bubbleSort(array);
    }
}
