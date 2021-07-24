package Tasks_11_07_2021;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
    private LocalDate dateStart; // дата начала
    private LocalDate dateFinish; // дата окончания
    private String name; // наименование
    private Boolean done; // закончена работа или

    public Task(LocalDate dateStart, LocalDate dateFinish, String name) {
        this.dateStart = dateStart;
        this.dateFinish = dateFinish;
        this.name = name;
        this.done = false;
    }
    public String toString (){
       // String s = dateStart.toString();//это выводит год месяц день
        String s;
        String s1;

        if (dateStart == null)
            s = "дата не обозначена";
        else
            s = dateStart.format(DateTimeFormatter.ofPattern("dd-MMMM-yy"));

        if (dateFinish == null)
            s1 = "дата не обозначена";
        else
            s1 = dateFinish.format(DateTimeFormatter.ofPattern("dd-MMMM-yy"));

        if(done)
            return s + " - " + s1 + " - " + name + "- сделано ";
        else
            return s + " - " + s1 + " - " + name + "- не сделано ";
    }
// д з
    public boolean isCorrect() {
       // return (!name.equals(" ") && dateStart.isBefore(dateFinish));//если name не " " и dateStart перед
        // dateFinish return true иначе return false
        LocalDate today = LocalDate.now();
        if ("".equals(name))
            return false;
        if (dateStart == null || dateFinish == null)// объект - поэтому null   ИЛИ = ||
            return false;
        if (dateStart.isBefore(today) || dateFinish.isBefore(today))
            return false;
        return dateStart.isBefore(dateFinish);
    }
}
