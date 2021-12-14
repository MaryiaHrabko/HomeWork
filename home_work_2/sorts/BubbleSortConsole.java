package home_work_2.sorts;

import home_work_2.utils.ArraysUtilsConsole2_1_1;

import java.util.Arrays;

/*
4.5. После рандома написать код который будет создавать массив через ранее созданный arrayFromConsole. Отсортировать.
 */

import static home_work_2.utils.SortUtilsBubble4_2_1.bubbleSort;

public class BubbleSortConsole {
    public static void main(String[] args) {
        int[] array = ArraysUtilsConsole2_1_1.arrayFromConsole();
        System.out.println("Массив до сортировки: " + Arrays.toString(array));
        bubbleSort(array);
    }
}
