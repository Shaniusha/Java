package FileSettings_18_8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalTime;

public class App_Settings {
    private Boolean on = true;//оповещение включено
    private LocalTime start;// время начала
    private LocalTime stop;// время окончания

    public boolean isOn() {// get-ер для boolean (isOn-он включен?)
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getStop() {
        return stop;
    }

    public void setStop(LocalTime stop) {
        this.stop = stop;
    }

    public App_Settings() {//д.з

    }
    public App_Settings(boolean on, LocalTime start, LocalTime stop) {
        this.on = on;
        this.start = start;
        this.stop = stop;
    }

    public void ON() {//этот метод включает оповещение задавая свойства on = true
        on = true;
    }

    public void OFF() {//этот метод выключает оповещение задавая свойства  on = false
        on = false;
    }

    public String save() {// метод для сохранения полей класса
        FileOutputStream fos = null;//пустой поток
        String str = on.toString();
        String st = start.toString();
        String s = stop.toString();
        String res = str + ";" + st + ";" + s;
        byte[] bytes = res.getBytes(StandardCharsets.UTF_8);// преобразуем к массиву byte

        File settings = new File("C:/Temp/Settings.txt");//создаем файл с именем Settings и типом txt
        try {
            fos = new FileOutputStream(settings);
            fos.write(bytes);// в файл записали строку,в которой все значения полей класса,через ";"
        } catch (FileNotFoundException e) {// не удалось открыть файл
            return "Не удалось открыть файл";
        } catch (IOException e) {
            return "Не удалось записать файл";
        } finally {
            try {
                fos.close();//файл закрываем
            } catch (IOException e) {
                return "Не удалось закрыть файл";
            }
        }
        return "";
    }

    public String read() {
        File file = new File("C:/Temp/Settings.txt");
        byte[] bytes1 = new byte[0];//место хранение прочитанных данных с файла (file)

        //Для считывания данных из файла предназначен класс FileInputStream, который является наследником
        // класса InputStream и поэтому реализует все его методы.
        FileInputStream fis = null;//пустой поток
        try {
            fis = new FileInputStream(file);
            bytes1 = new byte[fis.available()];//место хранение прочитанных данных с файла (file)
            fis.read(bytes1);//fis-из потока,read-читаем,в переменную bytes1
        } catch (IOException e) {//"не удалось считать файл"
            e.printStackTrace();//помогает программисту понять, где возникла реальная проблема.
            // Этот метод выводит одно и то же сообщение объекта e, а также номер строки,
            // в которой произошло исключение.
            return "Не удалось считать строку";
        }

        String str = new String(bytes1);// переводит считанную информацию в одну строку
        String[] array = str.split(";");//разбивает строку по ';'

        for (String s : array) {
            System.out.println(s);//печатает каждый разделенный элемент
        }
        try {

            on = Boolean.parseBoolean(array[0]); //преобразует первый прочитанный эл-т из строки в Boolean
            // переносит первый разделенный элемент в переменную 'on'//false
            start = LocalTime.parse(array[1]); // преобразует второй прочитанный эл-т из строки в LocalTime
            // переносит второй разделенный элемент в переменную 'start'//05:15
            stop = LocalTime.parse(array[2]); // преобразует третий прочитанный эл-т из строки в LocalTime
            // переносит третий разделенный элемент в переменную 'stop'//03:40
        }catch (Exception e){
          e.printStackTrace();
          return "Не правильное значение записано в файле";
        }
        return "";
    }
}
