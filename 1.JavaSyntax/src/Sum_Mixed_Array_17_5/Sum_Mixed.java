package Sum_Mixed_Array_17_5;
import java.util.Arrays;
import java.util.List;

public class Sum_Mixed {
    /*
     * Assume input will be only of Integer o String type
     */
    public  static int sum(List<?> mixed) {//список (list<?>)- может хранить эл-ты в виде строк и чисел
        int summ = 0;//в этой переменной summ буду хранить сумму всех эл-ов
        Integer num;  // ввели переменную
        for(int i = 0; i < mixed.size(); i++){
            Object element = mixed.get(i);// Object - это тип переменной,которая принимает что угодно  Integer,String
            //get(i)- Возвращает элемент, который расположен в указанной позиции списка.
            // метод получения элемента из списка

            if (element instanceof String){// element это String?
                String str = (String) element;// переменную  element(Object) приводим к типу String
                num = Integer.valueOf(str);// String str, преобразуем его в Integer и присваиваем его num.
            }
            else {
                num = (Integer) element;//  переменную  element приводим к типу Integer и присваиваем его  num
            }
            //summ = summ + num;  то же что и в строке 42 // 5+0=5+9=14+3=17+2=19+1=20+9=29+6=35+7=42
            summ += num;
        }
        return summ;
    }
    public static void main(String[] args) {
        List<?> arr = Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7);
       System.out.println(sum(arr));// str 22
        List<?> arr1 = Arrays.asList("5", "0", "9", 1, 5);
        System.out.println(sum(arr1));
    }
}

 // return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
