package You_Only_Need_One_BBeginner_16_5;

import java.util.ArrayList;// импортируем коллекцию иначе в коде ее не видим
import java.util.Arrays;//  очень важно это сделать
import java.util.List;//

public class You_Only {
    public static boolean check(Object[] a, Object x) {
        // Your code here
        List<Object> obg = new ArrayList<>(Arrays.asList(a));
        // возвращает массив в виде списка
        //Полученный ArrayList с помощью метода Arrays.asList()
        //формирует список на основе массива. Массив при этом используется для внутреннего
        // представления списка. Таким образом сохраняется связь между списком и исходным массивом:
        // любое изменение в массиве приведет к изменению в списке ArrayList
        if (obg.contains(x))// если список содержит  эл-т (х)
            return true;
        else
        return false;
        // return Arrays.asList(a).contains(x); решение в одну строку   `
    }
    public static void main(String[] args) {
        Object[] a = new Object[] {66, 101};
        Object x = 66;
        System.out.println(check(a,x)); //true

        Object[] b = new Object[] {80, 117, 115, 104, 45, 85, 112, 115};
        Object y = 45;
        System.out.println(check(b,y)); //true

        Object[] c = new Object[] {'t', 'e', 's', 't'};
        Object z = 'e';
        System.out.println(check(c,z)); //true

        Object[] d = new Object[] {"what", "a", "great", "kata"};
        Object w = "kat";
        System.out.println(check(d,w)); //false
    }
}


