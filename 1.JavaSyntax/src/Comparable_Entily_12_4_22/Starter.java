package Comparable_Entily_12_4_22;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Starter {
    // статическое поле(свойство) класса,НО!!! так же можно описать этот параметр и в main как у нас
   // static List<Goods> storage = new ArrayList<>();

    public static void main(String[] args) {
        //создаем список из товаров
        List<Goods> storage = new ArrayList<>();//переменная внутри main
        storage.add(new Food("Манго",4.5F, LocalDate.of(2022, 2, 22)));
        storage.add(new Food("Йогурт",2F,LocalDate.of(2022, 1, 22)));
        storage.add(new Food("Йогурт",1F,LocalDate.of(2022, 3, 22)));
        storage.add(new Phone("РH1000",1000F,"LG",LocalDate.of(2022, 4, 22)));

        storage.forEach(System.out::println);//так короче всего 1-ый вариант
                        //Food Манго 4.5
                        //Food Йогурт 1.0
                        //LG Phone РЗ1000 1000.0

 //       storage.stream().forEach(System.out::println);//или можно записать так 2-oй вариант

//        for(Goods g : storage){  //или можно записать так 3-ий вариант
//            System.out.println(g.toString());

        System.out.println("После сортировки");

        List<Goods> sorted = storage.stream().sorted().collect(Collectors.toList());
        for (Goods g : sorted){
            System.out.println(g.toString());
        }
    }
}
