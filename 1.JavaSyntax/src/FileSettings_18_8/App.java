package FileSettings_18_8;

import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        App_Settings a = new App_Settings(true, LocalTime.of(5,15),LocalTime.of(3,40));
        a.OFF();
        a.save();
        App_Settings b = new App_Settings(); // пустой объект типа App_Settings для вызова пустого конструктора
        String res = b.read();
        if ("".equals(res)) {
            System.out.println(b.isOn());
            System.out.println(b.getStart());
            System.out.println(b.getStop());
            // ^ печатает каждый из элементов ^
        } else {
            System.out.println(res);
        }
    }
}
