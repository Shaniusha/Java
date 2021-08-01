package Tasks_11_07_2021;

import java.time.LocalDate;
import java.time.LocalDateTime;

public final class MyExc {//final -это класс который нельзя изменять, он ведет себя как static(не нужно создавать объект этого класса

    static class YearExec extends Exception {// это поле classa MyExc
        public YearExec() {}// конструктор classa YearExeс
    }

    static class MonthExec extends Exception {// это поле classa MyExc
        public MonthExec() {}// конструктор classa MonthExec
    }
    static class DayExec extends Exception {// это поле classa MyExc
        public DayExec() {}// конструктор classa DayExec
    }

    // это метод my_LocalDateTime , который throws(выбрасывает) исключение по имени classa YearExec,MonthExec,DayExec
    public static void my_LocalDateTime(int year, int month, int day, int hour, int minute, int second) throws YearExec, MonthExec, DayExec {
        if (year <= 2040)
            throw new YearExec();
        if (month < 6)
            throw new MonthExec();
        if ( day < 21)
            throw new DayExec();

        LocalDateTime dateTime6 = LocalDateTime.of(year, month, day, hour, minute, second);
    }

    public static void my_LocalDateTime(int year, int month, int day) throws YearExec, MonthExec, DayExec {
        if (year >= 2045)
            throw new YearExec();
        if (month > 5)
            throw new MonthExec();
        if ( day > 9)
            throw new DayExec();

       LocalDate dateTime6 = LocalDate.of(year, month, day);
    }
}
