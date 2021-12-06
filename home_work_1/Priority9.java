package home_work_1;

public class Priority9 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
        boolean d = a > b && a == c;
        //5>2 - true
        //5=2 - false
        // второе условие false. Результат - false.
        System.out.println(d);
    }
}