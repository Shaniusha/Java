package DateTime_8_4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeAPI {
    public static void main(String[] args) {

        // Date

        Date md1 = new Date();
        Date md2 = new Date();
        md2.setTime(165164864);
        System.out.println(md2);//Fri Jan 02 23:52:44 IST 1970
        System.out.println(md1 + ": текущая дата и время");
        System.out.println(md1.getTime() + ": возвращает кол-во мил-сек,истекших с 1.1.1970");
        System.out.println("эти даты равны?: " + md1.equals(md2));//false
        System.out.println("была ли первая дата позже второй?: " + md1.after(md2));

        Date md3 = new Date();
        long start = md3.getTime();// возвращает кол-во мил-сек,истекших с 1.1.1970

         try {
             //метод позволяет заснуть программе на X-милисек
             Thread.sleep(2000);
         } catch (Exception ex){

         }
         Date md4 = new Date();
         long finish = md4.getTime();
        System.out.println ("разница во времени: " +(double)(finish - start)/1000 + " millis");

        //  LocalDate

        LocalDate ld1 = LocalDate.now();
        System.out.println("текущая дата: " + ld1);
        LocalDate ld2 = LocalDate.of(2022, 02, 22);
        System.out.println("задаем любую дату,например эту: " + ld2);
        System.out.println("год: " + ld1.getYear());
        System.out.println("месяц: " + ld1.getMonth());
        System.out.println("день месяца: " + ld1.getDayOfMonth());
        System.out.println("плюс день: " + ld1.plusDays(1));

        // ChronoUnit

        //ld1
        //ld2
        System.out.println("сколько месяцев между: " + ld1 + " и " + ld2 + " : " + ChronoUnit.MONTHS.between(ld2,ld1));
        System.out.println("сколько лет между: " + ld1 + " и " + ld2 + " : " + ChronoUnit.YEARS.between(ld2,ld1));

        // LocalTime   // ChronoUnit

        LocalTime lt = LocalTime.parse("08:30");
        LocalTime lt1 = LocalTime.parse("09:30");
        System.out.println("сколько часов между: " + lt + " и " + lt1 + " : " + ChronoUnit.HOURS.between(lt,lt1));
        System.out.println("сколько min между: " + lt + " и " + lt1 + " : " + ChronoUnit.MINUTES.between(lt,lt1));

        //сколько времени тратиться на данный участок кода?

        Long starT = System.currentTimeMillis();//текущее время в милсек

        String s = "выводит на консоль случайное число -" +
                "\n" + " за сколько раз выполнится 1000 итераций нашего цикла: ";
        String s1 = "столько sec затратилось для выполнения 1000 итераций нашего цикла и получения случайного" +
                " числа: ";
        for (int i = 0; i < 1000; i++){
            System.out.println(s + Math.random() * 10);
        }
        double finisH = System.currentTimeMillis() - starT;
        System.out.println(s1 + finisH/1000);

    }
}
