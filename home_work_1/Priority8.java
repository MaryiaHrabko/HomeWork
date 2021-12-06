package home_work_1;

public class Priority8 {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        int c = 3;
        int d = 12;
        boolean e = a - b > c && d * d <= 119;
        // 6-2=4>3 - true
        // 12*12=144<=119 - false
        //второе условие false. Результат false.
        System.out.println(e);
    }
}