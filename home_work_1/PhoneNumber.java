package home_work_1;

import java.util.Scanner;

public class PhoneNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 10-значный номер телефона: ");
        String nomer = in.nextLine();
        System.out.printf("Ваш номер: %s \n", nomer);
        int[] myNumber = new int[10];
        //int[] myNumber =  {1,2,3,4,5,6,7,8,9,0};
        for (int i = 0; i < 10; i++) {
            myNumber[i] = Integer.parseInt(nomer);
        }
        System.out.println(createPhoneNumber(myNumber));
    }

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }
}