package home_work_1;

public class Mathematics {
    public static void main(String[] args) {
        double a = Math.abs(-15.87);
        System.out.println(a);
        //абсолютное значение = 15.87

        double b = Math.sqrt(16);
        System.out.println(b);
        //квадратный корень числа 16 = 4.0

        double c = Math.cbrt(27);
        System.out.println(c);
        //кубический корень числа 27 = 3.0

        double d = Math.rint(2.5);
        System.out.println(d);
        //ближайшее к 2.5 целое число = 2.0

        double e = Math.round(2.5);
        System.out.println(e);
        //округленное до ближайшего целого числа = 3.0

        double f = Math.scalb(5, 3);
        System.out.println(f);
        //произведение числа 5 на 2 в степени 3 = 5*2*2*2 = 40.0;

        double g = Math.E;
        System.out.println(g);
        //2.718281828459045

        double h = Math.PI;
        System.out.println(h);
        //3.141592653589793

        for (int i = 0; i < 2; i++) {
            System.out.println(Math.random());
        }
        //генерация слуяайных чисел

//      int r = 5;
//      double p = Math.round(Math.PI * Math.pow(r, 2));
//      System.out.println(p);
//      PI*r^2 = 3.14*5^2 = 78.5 ~ 79.0
    }
}

