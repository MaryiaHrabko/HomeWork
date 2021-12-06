package home_work_1;

import java.sql.SQLOutput;

public class BitOperators3 {
    public static void main(String[] args) {
        double x = 42.5;
        //Вещественный тип данных не подходит для побитовых операторов
        int a = (int)Math.round(x);
        int b = 15;

        int c = a & b;
        System.out.println(c);

        int d = a | b;
        System.out.println(d);

        int e = a ^ b;
        System.out.println(e);

        int f = ~ a;
        System.out.println(f);

        int g = ~b;
        System.out.println(g);

        int h = a << b;
        System.out.println(h);

        int i = a >> b;
        System.out.println(i);

        int j = a >>> b;
        System.out.println(j);
    }
}