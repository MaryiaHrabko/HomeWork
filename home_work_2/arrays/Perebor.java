package home_work_2.arrays;

import home_work_2.utils.ArraysUtilsConsole2_1_1;

/*
2.2 Перебор массива при помощи do....while, while, for, foreach. Элементы массива вводить используя ранее созданный arrayFromConsole.
Все задачи в одном классе, в отдельных методах. Должно получиться 3 метода (что такое метод https://metanit.com/java/tutorial/2.7.php):
		2.2.1. Вывести все элементы в консоль.
		2.2.2. Вывести каждый второй элемент массива в консоль.
		2.2.3. Вывести все элементы массива в консоль в обратном порядке.
 */

public class Perebor {
    public static void main(String[] args) {
        int[] arr = ArraysUtilsConsole2_1_1.arrayFromConsole();
        vuvod(arr);
        secondElement(arr);
        reverse(arr);
    }
    public static void vuvod(int [] arr) {
        //do ... while
        System.out.println("Массив do...while: ");
        int i = 0;
        do {
            System.out.print(arr[i] + " ");
            i++;
        } while (i < arr.length) ;

        //while
        System.out.println("\nМассив while: ");
        int in = 0;
        while (in < arr.length) {
                System.out.print(arr[in] + " ");
            in++;
        }

        //for
        System.out.println("\nМассив for: ");
        for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
        }

        //foreach
        System.out.println("\nМассив foreach: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println();
    }


    public static void secondElement(int[] arr) {
        //do ... while
        System.out.println("Массив каждого второго элемента do...while: ");
        int i = 1;
        // int i = 0; есть вопрос: когда речь идет о каждом втором элементе - это значит, что индекс числа должен быть четным?
        //или что второй элемент числа соответствует [1]? (то есть [0] - это первый элемент, а [1] - второй элемент и тд.?)
        do {
            System.out.print(arr[i] + " ");
            i += 2;
        } while (i < arr.length);

        //while
        System.out.println("\nМассив каждого второго элемента while: ");
        int in = 1;
        while (in < arr.length) {
            System.out.print(arr[in] + " ");
            in += 2;
        }

        //for
        System.out.println("\nМассив каждого второго элемента for: ");
        for (int j = 1; j < arr.length; j += 2) {
            System.out.print(arr[j] + " ");
        }

        //foreach
        System.out.println("\nМассив foreach: ");
        int ind = 1;
        for (int element : arr) {
            if (ind % 2 == 0) {
                System.out.print(element + " ");
            }
            ind++;
        }
        System.out.println();
        System.out.println();
    }

    static void reverse(int[] arr){
        //do ... while
        System.out.println("Массив в обратном порядке do...while: ");
        int i = arr.length - 1;
        do {
            System.out.print(arr[i] + " ");
            i --;
        } while (i >= 0);

        //while
        System.out.println("\nМассив в обратном порядке while: ");
        int in = arr.length - 1;
        while (in >= 0) {
            System.out.print(arr[in] + " ");
            in --;
        }

        //for
        System.out.println("\nМассив в обратном порядке for: ");
        for (int j = arr.length - 1; j >= 0; j --) {
            System.out.print(arr[j] + " ");
        }

        //foreach
        System.out.println("\nМассив foreach: ");
        int [] secarr = new int[arr.length];
        int ind = arr.length - 1;

        for (int element : arr) {
            secarr[ind] = element;
            ind--;
        }
            for (int element : secarr){
                System.out.print(element + " ");
            }

    }

}