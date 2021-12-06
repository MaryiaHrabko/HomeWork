package home_work_1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SleepIn {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        //System.out.println(date);
        System.out.printf("%d.%d.%d \n", dayOfMonth, month, year);
        System.out.println(dayOfWeek);

        boolean weekday = isWeekend(dayOfWeek);
        boolean vacation = true;
        if (sleepIn(weekday, vacation)) {
            System.out.println("Фух, можно спать дальше");
        } else {
            System.out.println("Пора на работу!");
        }
    }
    public static boolean isWeekend(DayOfWeek dayOfWeek){
        if (dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY)){
            return true;
        }
        return false;
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}

//     Calendar cl = Calendar.getInstance();
//     int day = cl.get(Calendar.DAY_OF_WEEK);
//     System.out.println(day);
//     if (day == Calendar.SUNDAY || day == Calendar.SATURDAY) {