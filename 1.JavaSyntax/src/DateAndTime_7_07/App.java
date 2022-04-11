package DateAndTime_7_07;

import javax.xml.crypto.Data;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();// получение текущей даты
        System.out.println("date now:  " + date);// 2021-07-07 на сегодня
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM - dd - yy");
        System.out.println("date format:  "+ dtf.format(date));
        System.out.println("День месяца: " + date.getDayOfMonth());
        System.out.println("Месяц: " + date.getMonthValue());
        System.out.println("Год: " + date.getYear());

        LocalDate date1 = LocalDate.of(2021,12,31);

        //выбираем 1-е число текущего года и месяца
        LocalDate date2 = LocalDate.of(date.getYear(),date.getMonth(),1);//1.04.22
        System.out.println("1-е число текущего года и месяца:  "+ date2);
        int maxDay = date2.lengthOfMonth();
        System.out.println("сколько дней в текущем месяце:  " + maxDay);//сколько дней в текущем месяце
        //выбираем последний день месяца
        LocalDate last = LocalDate.of(date.getYear(),date.getMonth(),maxDay);
        System.out.println(last + ":  выбираем последний день месяца");
        //выбираем последний день месяца - 2-ой способ
        last = date2.plusMonths(1).minusDays(1);//1.04.22 = 1.05.22 = 30.04.22
        String s = "выбираем последний день месяца:  " + last;
        System.out.println(s);


        DayOfWeek dayOfWeek = date1.getDayOfWeek();
        int day = dayOfWeek.getValue();//номер дня недели начиная с нуля, начало недели с воскресенья
        System.out.println("День недели: " + dayOfWeek);
        System.out.println("номер дня недели начиная с нуля: " + day + " :и это: " + dayOfWeek);

        date = date.plusDays(32);// 2021-08-08 // прибавляем 32 дня к 2021-07-07
        System.out.println("прибавляем 32 дня к date now: " + date);
        LocalDate date_2 = date.minusMonths(2);// минус 2 месяца
        System.out.println( "(date_2)-минус 2 месяца: " + date_2);
        String s1 = "date_2 после этой даты ?: " + date + " : ";
        String s2 = "date_2 перед этой датой ?: " + date + " : ";

        System.out.println(s1 + date_2.isAfter(date));//false//
        System.out.println(s2 + date_2.isBefore(date));//true//

        if (date.isAfter(date_2))
            System.out.println(date + "  эта дата больше чем  " + date_2);
        else
            System.out.println(date + " эта дата меньше date_2");

        //д з

        LocalDate date_3 = date.plusYears(4);//+ 4 года
        if (date.isAfter(date_3))
            System.out.println(date + " эта дата больше " + date_3);
        else
            System.out.println(date + " эта дата меньше " + date_3);

        Month monthAsEnum = date.getMonth(); // как перечисление
        System.out.println("Название месяца: " + monthAsEnum); //date = date.plusDays(32);// 2021-08-08

        System.out.println("эта дата такая как date_2? : " + date_2.equals(date));
        System.out.println( "эта дата находится в високосном году? : " + date_2.isLeapYear());


        LocalDate newYear2001 = LocalDate.of(2001, 1, 1);

        LocalDate newYear2003 = newYear2001.with(ChronoField.YEAR, 2003);
        LocalDate newYear2004 = newYear2001.withYear(2004);
        LocalDate december2001 = newYear2001.withMonth(12);
        LocalDate february2001 = newYear2001.withDayOfYear(32);
        LocalDate xmas2001 = newYear2001.withMonth(12).withDayOfMonth(25);

        System.out.println("начальный год : " + newYear2001);
        System.out.println("измененный год : " + newYear2003);
        System.out.println("измененный год : " + newYear2004);
        System.out.println("измененный месяц : " + december2001);
        System.out.println("измененный месяц : " + february2001);
        System.out.println("измененный месяц и дата : " + xmas2001);

        LocalDate newYear2006 = newYear2001.plus(5, ChronoUnit.YEARS);
        System.out.println("newYear2006: " + newYear2006);


        LocalDate newYear2000 = newYear2001.minusYears(1);
        LocalDate nov2000 = newYear2001.minusMonths(2);
        LocalDate dec30Year2000 = newYear2001.minusDays(2);
        LocalDate lastWeekDec2001 = newYear2001.minusWeeks(1);
        LocalDate newYear1999 = newYear2001.minus(2, ChronoUnit.YEARS);

        System.out.println("newYear2000: " + newYear2000);
        System.out.println("nov2000: " + nov2000);
        System.out.println("dec30Year2000: " + dec30Year2000);
        System.out.println("lastWeekDec2001: " + lastWeekDec2001);
        System.out.println("newYear1999: " + newYear1999);

        if (date.isAfter(newYear2000))
            System.out.println("эта дата больше newYear2000");
        else
            System.out.println("эта дата меньше newYear2000");

        if (newYear1999.isAfter(date))
            System.out.println("эта дата больше date");
        else
            System.out.println("эта дата меньше date");

    }
}
