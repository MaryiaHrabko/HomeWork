package home_work_1;

public class BinaryString {

    public static void main(String[] args) {
    int a = 42;
    System.out.println(a + " это " + Integer.toBinaryString(a));
//    int b = 15;
//    System.out.println(b + " это " + Integer.toBinaryString(b));
//    int c = -42;
//    System.out.println(c + " это " + Integer.toBinaryString(c));
//    int d = -15;
//    System.out.println(d + " это " + Integer.toBinaryString(d));

    }
    public static String toBinaryString (byte number) {
         return String.format("%8s", Integer.toBinaryString(1)).replace(" ", "0");
    }
}