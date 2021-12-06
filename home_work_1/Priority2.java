package home_work_1;

public class Priority2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
        int d = (a + b) / c;
        //складываем 5 и 2. Получем 7. 7/8=0,875. Int отбрасывает дробную часть 0,875. Результат 0.

        double e = (a + 1.0 * b) / c;
        //складываем 5 и 2 (умноженное на 1.0, чтобы тип сделать дробным). Получем 7. 7/8=0,875.

        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}
