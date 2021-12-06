package home_work_1;

import java.sql.SQLOutput;

public class BitOperators1 {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;

        int c = a & b;
        System.out.println(c);
        //00101010 число 42
        //00001111 число 15
        //00001010 число 10

        int d = a | b;
        System.out.println(d);
        //00101010 число 42
        //00001111 число 15
        //00101111 число 47

        int e = a ^ b;
        System.out.println(e);
        //00101010 число 42
        //00001111 число 15
        //00100101 число 37

        int f = ~ a;
        System.out.println(f);
        //00101010 число 42
        //11010101 число 213 ?? Я нашла инфу почему так: компилятор показывает 2-е дополнение этого числа,
        //то есть отрицательное представление двоичного числа. Дополнение 2 любого числа эквивалентно - (n + 1),
        //где n - число, чье дополнение 2 должно быть вычислено.
        //приводим 11010101 к 16-бит: 11111111_11010101. Отбрасываем левую 1. Получаем 1111111 11010101.
        //Отнимаем 1. Получаем 1111111 11010100. Инвертируем все биты. Получаем 0000000 00101011. Число -43. Ура!

        int g = ~b;
        System.out.println(g);
        //00001111 число 15
        //11110000. Приводим к 16-бит: 11111111_11110000 -> 1111111_11110000 -> 1111111_11101111 -> 0000000_00010000. Число - 16.

        int h = a << b;
        System.out.println(h);
        //00101010 число 42
        //00101010000000000000000 число 1376256

        int x = a << 2;
        System.out.println(x);
        //00101010 число 42
        //10101000 число 168

        int i = a >> b;
        System.out.println(i);
        //00101010 число 42
        //00000000 число 0

        int y = a >> 2;
        System.out.println(y);
        //00101010 число 42
        //00001010 число 10

        int j = a >>> b;
        System.out.println(j);
        //00101010 число 42
        //0000000_00000000 число 0

        int z = a >>> 2;
        System.out.println(z);
        //00101010 число 42
        //00001010 число 10

        int m = 42;
        int n = 42;
        int o = 42;

        int p = m &= 15;
        System.out.println("p = " + p);
        //42 & 15 = p
        //00101010 число 42
        //00001111 число 15
        //00001010 число 10

        int r = n |= 15;
        System.out.println("r = " + r);
        //42 | 15 = r
        //00101010 число 42
        //00001111 число 15
        //00101111 число 47

        int s = o ^= 15;
        System.out.println("s = " + s);
        //42 ^ 15 = s
        //00101010 число 42
        //00001111 число 15
        //00100101 число 37

    }
}
