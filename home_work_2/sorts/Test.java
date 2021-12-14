package home_work_2.sorts;

import java.util.Arrays;

/*
4.3 Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):
        4.3.1. {1,2,3,4,5,6}
        4.3.2. {1,1,1,1}
        4.3.3. {9,1,5,99,9,9}
        4.3.4. {}
 */

import static home_work_2.utils.SortUtilsBubble4_2_1.bubbleSort;

public class Test {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println("Массив до сортировки: " + Arrays.toString(array));
        bubbleSort(array);

        System.out.println();

        int [] array2 = {1,1,1,1};
        System.out.println("Массив до сортировки: " + Arrays.toString(array2));
        bubbleSort(array2);

        System.out.println();

        int [] array3 = {9,1,5,99,9,9};
        System.out.println("Массив до сортировки: " + Arrays.toString(array3));
        bubbleSort(array3);

        System.out.println();

        int [] array4 = {100,1,8,3,18,9};
        System.out.println("Массив до сортировки: " + Arrays.toString(array4));
        bubbleSort(array4);
    }
}
