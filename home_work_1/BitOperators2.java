package home_work_1;

public class BitOperators2 {
    public static void main(String[] args) {
        int a = -42;
        System.out.println(a + " это " + Integer.toBinaryString(a));
        int b = -15;
        System.out.println(b + " это " + Integer.toBinaryString(b));

        int c = a & b;
        System.out.println(c + " это " + Integer.toBinaryString(c));
        //11010110 число -42 (число 42 -> 00101010 -> 11010101 +1 -> 11010110)
        //11110001 число -15 (число 15 -> 00001111 -> 11110000 +1 -> 11110001)
        //11010000. Приводим к 16-бит: 11111111_11010000 -> 1111111_11010000 -> 1111111_11001111 -> 0000000_00110000. Число - 48.

        int d = a | b;
        System.out.println(d + " это " + Integer.toBinaryString(d));
        //11010110 число -42
        //11110001 число -15
        //11110111. Приводим к 16-бит: 11111111_11110111 -> 1111111_11110111 -> 1111111_11110110 -> 0000000_00001001. Число -9.

        int e = a ^ b;
        System.out.println(e + " это " + Integer.toBinaryString(e));
        //11010110 число -42
        //11110001 число -15
        //00100111 число 39

        int f = ~ a;
        System.out.println(f + " это " + Integer.toBinaryString(f));
        //11010110 число -42
        //00101001 число 41

        int g = ~b;
        System.out.println(g + " это " + Integer.toBinaryString(g));
        //11110001 число -15
        //00001110 число 14

        int h = a << b;
        System.out.println(h + " это " + Integer.toBinaryString(h));
        //11010110 число -42
        //11111111101011000000000000000000

        int x = a << 2;
        System.out.println(x + " это " + Integer.toBinaryString(x));
        //11010110 число -42
        //11111111_01011000 -> 1111111_01011000 -> 1111111_01010111 -> 0000000_10101000. Число -168.

        int i = a >> b;
        System.out.println(i + " это " + Integer.toBinaryString(i));
        //11010110 число -42
        //11111111 число -1

        int y = a >> 2;
        System.out.println(y + " это " + Integer.toBinaryString(y));
        //11010110 число -42
        //11110101. Приводим к 16-бит: 11111111_11110101 -> 1111111_11110101 -> 1111111_11110100 ->0000000_00001011. Число -11.

        int j = a >>> b;
        System.out.println(j + " это " + Integer.toBinaryString(j));
        //11010110 число -42
        //111111111111111 число 32767

        int z = a >>> 2;
        System.out.println(z + " это " + Integer.toBinaryString(z));
        //11010110 число -42
        //111111_11111111_11111111_11110101

        int m = -42;
        int n = -42;
        int o = -42;

        int p = m &= -15;
        System.out.println("p = " + p);
        //-42 & -15 = p
        //11010110 число -42 (число 42 -> 00101010 -> 11010101 +1 -> 11010110)
        //11110001 число -15 (число 15 -> 00001111 -> 11110000 +1 -> 11110001)
        //11010000. Приводим к 16-бит: 11111111_11010000 -> 1111111_11010000 -> 1111111_11001111 -> 0000000_00110000. Число - 48.

        int r = n |= -15;
        System.out.println("r = " + r);
        //-42 | -15 = r
        //11010110 число -42
        //11110001 число -15
        //11110111. Приводим к 16-бит: 11111111_11110111 -> 1111111_11110111 -> 1111111_11110110 -> 0000000_00001001. Число -9.

        int s = o ^= -15;
        System.out.println("s = " + s);
        //-42 ^ -15 = s
        //11010110 число -42
        //11110001 число -15
        //00100111 число 39
    }
}