package home_work_2.arrays;

import home_work_2.utils.ArraysUtilsRandom2_1_2;

import java.util.Arrays;

public class ZadachiRand {
    public static void main(String[] args) {
        int[] arr = ArraysUtilsRandom2_1_2.arrayRandom(5, 100);
        System.out.println("Массив из рандомных чисел: " + Arrays.toString(arr));
        summaChet(arr);
        maxChetIndex(arr);
        lessThanAveragre(arr);
        twoLowest(arr);
        szatie(arr);
        summa(arr);
    }

    public static void summaChet(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result += arr[i];
            }
        }
        System.out.println("Сумма четных положительных чисел массива = " + result);
    }

    public static void maxChetIndex(int[] arr) {
        int maxNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (maxNumber >= arr[i]){
                    maxNumber += 0;
                }else {
                    maxNumber = arr[i];
                }
            }
        }
        System.out.println("Максимальное число в массиве с четным индексом: " + maxNumber);
    }

    public static void lessThanAveragre(int[] arr) {
        double average = 0;
        double sum = 0;
        String num = "", separator = "";
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (average > arr[i]) {
                num = num + separator + arr[i];
                separator = ", ";
            }
        }
        System.out.println("Элементы массива, которые меньше среднего арифметического " + "(среднеее арифметичеcкое = " + average + ")" + ": [" + num + "]");
    }

    public static void twoLowest(int[] arr) {
        int m1 = arr[0];
        int m2 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int x = arr [i];
            if (x < m1) {
                m2 = m1;
                m1 = x;
            }
        }
        System.out.println ("Два наименьших числа массива: [" + m1 + ", " + m2 + "]");
    }

    public static void szatie(int[] arr) {
//        int i = 0;
        int a = 0;
        int b = 15;

        for (int i = 0, j = 0; i < arr.length; ) {
            if (j < arr.length) {
                if (!(arr[j] >= a && arr[j] <= b)) {
                    i++;
                }
                arr[i] = ++j < arr.length ? arr[j] : 0;
            } else {
                arr[i++] = 0;
            }
        }
        System.out.println("Сжатый массив: " + Arrays.toString(arr));
    }
//        int lastIdx = arr.length - 1;
//        while (i <= lastIdx) {
//            if (arr[i] >= a && arr[i] <= b) {
//                for (int j = i; j < lastIdx; j++)
//                    arr[j] = arr[j + 1];
//                arr[lastIdx--] = 0;
//            } else
//                i++;

            public static void summa ( int[] arr){
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                }
                System.out.println("Сумма чисел массива = " + sum);
            }
}
