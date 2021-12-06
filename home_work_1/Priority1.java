package home_work_1;

public class Priority1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
        int d = a + b / c;
        //делим 2/8=0,25. Прибавляем 5. Получаем 5,25. Int отбрасывает 0,25. Результат 5.

        //жалко терять 0.25, добавила еще одну переменную вещественного типа
        double e = a + 1.0 * b / c;
        //делим 2/8=0,25. Прибавляем 5. Получаем 5,25.

        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}
