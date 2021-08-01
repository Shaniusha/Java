package Tasks_11_07_2021;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class App {

    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2021,7,5);
        LocalDate d2 = LocalDate.of(2021,8,1);
        String str = "Data изучение";

        Task task = new Task(d1,d2,str);
        System.out.println(task.isCorrect());

        // д з
        d1 = LocalDate.of(2021,8,9);
        d2 = LocalDate.of(2021,5,1);
        str = "CS50 изучение";
        Task task1 = new Task(d1,d2,str);

        d1 = LocalDate.of(2021,8,9);
        d2 = LocalDate.of(2021,9,1);
        str = null;
        Task task2 = new Task(d1,d2,str);

        d1 = LocalDate.of(2021,8,9);
        d2 = LocalDate.of(2021,9,1);
        String str3 = "CS50 сдача проекта";
        Task task3 = new Task(d1,d2,str3);

        str = "CS50 сдача второго проекта";
        Task task4 = new Task(null,null,str);

        List<Task> list = new ArrayList<>();
        list.add(task1);
        list.add(task2);
        list.add(task3);
        list.add(task4);

        for (Task t : list){
            System.out.println(t);
            System.out.println(t.isCorrect());
        }
        LocalDateTime dayStart = LocalDateTime.of(2021, 7, 18, 18, 10);
        LocalDateTime dayFinish = LocalDateTime.of(2021,7,20,17,0);

        Job job = new Job(dayStart,dayFinish,"домашка");
        System.out.println(job.getStart());

        // д.з

        // Получаем текущее время
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Получаем текущее время : " + today);

        //Создаем новую дату с помощью LocalDate и LocalTime
        today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("DateTime : " + today);

        //Создаем LocalDateTime передавая в качестве аргументов
        //год, месяц, день, час, минуту, секунду
        LocalDateTime randDate = LocalDateTime.of(2021, Month.JULY, 19, 11, 6, 22);
        System.out.println("LocalDateTime с указанной датой : " + randDate);

        //Получаем дату через 2000 секунд после 01.01.1970     : 1970-01-01T00:33:20
        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(2000, 0, ZoneOffset.UTC);
        System.out.println("Через 2000 секунд после 01.01.1970 : " + dateFromBase);

        LocalDateTime dateFromBase1 = LocalDateTime.ofEpochSecond(20,1,ZoneOffset.UTC);
        System.out.println(dateFromBase1);//1970-01-01T00:00:20.000000001 ???

        LocalDate date = LocalDate.parse("2017-02-03");//parse с одним параметром должен получать дату именно в этом виде
        // год 4 цифры.месяц.день
        System.out.println(date);//2017-02-03
        LocalTime time = LocalTime.parse("10:30:20");
        LocalDateTime date1 = date.atTime(time);
        System.out.println(date1);//2017-02-03T10:30:20

        LocalDateTime dateTime = LocalDateTime.now();
        //стандартный формат даты
        System.out.println("стандартный формат даты LocalDateTime : " + dateTime);// 2021-07-18T19:53:33.626602
        //приименяем свой формат даты
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));//18::июл.::2021 19::53::33
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));//20210718


        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");// это formatter который создает правило
        //как преоброзовать строку в date и date в строку

        LocalDate newDate = LocalDate.parse("31-12-2020", df);
        System.out.println(newDate);//2020-12-31

        LocalDateTime date2 = LocalDateTime.now();
        date2 = date2.minusWeeks(1);
        // метод format преобразует date в строку используя заданный Formatter
        System.out.println(date2.format(df));//14-07-2021

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm");
        String res = date2.format(dtf);
        System.out.println(res);// 14/07/21 05:37

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");
        String res1 = date2.format(tf);
        System.out.println(res1);//17:46:08

               // ИСКЛЮЧЕНИЯ / exception java
        //Возможность предупреждения и разрешения исключительной ситуации в программе для ее продолжения
        // Механизм исключений также позволяет защитить написанный вами код (программный интерфейс) от
             // неправильного использования пользователем за счет валидации (проверки) входящих данных.

        //try – определяет блок кода, в котором может произойти исключение;
        //catch – определяет блок кода, в котором происходит обработка исключения;
        //finally – определяет блок кода, который является необязательным, но при его
                   //наличии выполняется в любом случае независимо от результатов выполнения блока try.
        // Специальные обрабатывающие конструкции: try{}catch, try{}catch{}finally,try{}finally{}.

        //в блок try заключаем код, в котором может произойти исключение//«ограждаем» опасные участки кода
              // в отношении исключений с помощью блока try{}
        // в данном в методе parse() класса LocalTime может выбросить исключение написание часов(33)

        try {
            String s = null;
           // s.toUpperCase(Locale.ROOT);
            LocalTime.parse("13:30:20");
            // в блок  catch заключаем код по обработке исключения Exception
            // предусматриваем «запасные» пути с помощью блока catch{}
        }catch (DateTimeParseException dte){
            System.out.println("неправильное время");
        }catch (Exception e){
            System.out.println(e.getMessage() + " другая ошибка");

            // в блоке finally{} мы пишем код, который выполняется в программе при любом исходе.
        }finally{
            System.out.println("это запускается в конце");
        }

        try {
            System.out.println(App.parseTime("25:25:25"));
        }
        catch (DateTimeParseException dte1){
            System.out.println("я обрабатываю ошибку которая в методе parseTime");
        }
                                       // д.з

        int year = 1940, month = 6, day = 21, hour = 6, minute = 0, second = 0;

        try {// этот код может выкинуть исключение(ошибку)
            MyExc.my_LocalDateTime(year, month, day, hour, minute, second);//вызываю метод my_LocalDateTime,который
                                                                           //находится в классе MyExc
        }
        catch(MyExc.YearExec e){//ловит исключение YearExe(КлассОшибки имяПеременной)
            //обработка ошибки
            System.out.println("год меньше или равен 1940");
        }
        catch(MyExc.MonthExec e){
            System.out.println("месяц меньше июня");//ловит исключение MonthExec
        }
        catch(MyExc.DayExec e){
            System.out.println("день меньше 21");//ловит исключение DayExec
        }


        int year1 = 1945, month1 = 5, day1 = 19;
        try {
            MyExc.my_LocalDateTime(year1, month1, day1);
        }
        catch(MyExc.YearExec e){//ловит исключение YearExe
            System.out.println("год больше или равен 1945");
        }
        catch(MyExc.MonthExec e){
            System.out.println("месяц больше мая");//ловит исключение MonthExec
        }
        catch(MyExc.DayExec e) {
            System.out.println("день больше 9");//ловит исключение DayExec
        }


        year = 2085; month = 10; day = 32; hour = 16; minute = 40; second = 50;
        try{
            LocalDateTime dateTime6 = LocalDateTime.of(year, month, day, hour, minute, second);
        }

        catch(DateTimeException dataT){
            System.out.println(" в классе LocalDateTime в методе of - exception");
        }
        try{
            LocalDate date3 = LocalDate.of(year1, month1, day1);
        }
        catch (DateTimeException data){
            System.out.println(" в классе DateTime в методе of - exception");

        }
    }

    private static LocalTime parseTime (String s)throws DateTimeParseException{//предупреждаем с помощью throws,
        // что метод может выбросить исключение  DateTimeParseException
        // НО обрабатывает эту ошибку метод который вызывает этот метод(метод main) у него для этого try и catch
        // в строке 142-147
       return LocalTime.parse(s);//возвращает дату и время созданную из String s
    }
}
