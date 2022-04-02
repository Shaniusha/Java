package Streams_20_3_22;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    private static List<Goods> initGoods() {
        List<Goods> stocks = new ArrayList<>();//создаем список (товаров)
        Goods stock = new Goods("Чай", 10.5f, "пачка");//создаем новый обЪект (товар)

        stocks.add(stock);//новый обЪект добавляем в список товаров
        stock = new Goods("Хлеб зерновой", 5f, "буханка");
        stocks.add(stock);
        stock = new Goods("Хлеб", 5f, "буханка");
        stocks.add(stock);
        stock = new Goods("Сыр голландский", 120f, "кг");
        stocks.add(stock);
        stock = new Goods("Яйца", 12f, "упаковка");
        stocks.add(stock);
        stock = new Goods("Колбаса Докторская", 95f, "кг");
        stocks.add(stock);
        stock = new Goods("Чипсы картофельные", 9f, "пачка");
        stocks.add(stock);
        stock = new Goods("Колбаса Салями", 160f, "кг");
        stocks.add(stock);
        stock = new Goods("Хлеб белый", 3f, "буханка");
        stocks.add(stock);
        stock = new Goods("Сыр Цфатит", 100f, "кг");
        stocks.add(stock);
        stock = new Goods("Сыр Бри", 220f, "кг");
        stocks.add(stock);
        stock = new Goods("Чай черный", 20.5f, "пачка");
        stocks.add(stock);

        LocalDateTime dt
                = LocalDateTime.of(2022, 3, 23, 12, 20, 12, 0);
        stock = new Goods("Яйца", 12f, "упаковка",dt);
        stocks.add(stock);
        return stocks;
    }
    public static void main(String[] args) {
        List<Goods> newGoods = new ArrayList<>();//создаем список (новыйТовар)

        List<Goods> stocks = initGoods();//применяем метод initGoods(),который возвращает
        // новый список товаров(обЪектов)   имя,цена,ед.изм


//        for (Goods s : stocks) {                        //просматриваем каждый товар(s) в списке(stocks)
//            if (s.getMeasure().equals("кг"))            //если(товар(s) содержит ед.измер(getMeasure()) "кг"
//                newGoods.add(s);                        //добавляем его в newGoods
//        }
        //вместо for можно записать так

        //Stream API позволяет сократить количество строк кода.
        //Создание экземпляра Stream, который опирается на нужную нам коллекцию
        Stream<Goods> goodsStream = stocks.stream();//список превращаем в поток обЪектов(товары)
        Stream<Goods> newStream = goodsStream.filter(stock -> stock.getMeasure().equals("кг"));//применяем фильтр
        // к потоку по заданному условию в скобках
        //stock-это перем-ая в которую по очереди будет записываться каждый эл-т потока(каждый товар:имя,цена,ед.изм)
        //после -> условие фильтра /если(товар(stock)содержит ед.измер(getMeasure()) "кг"/
        //если эта функция возвращает true то запись будет включена в фильтр,а false нет

        List<Goods> newList = newStream.collect(Collectors.toList());//превращаем поток в список,
        // а можно еще в коллек-цию,множество и массив
        //все что написано сверху,только в одну строку

        //  по ед.измер(getMeasure()) "кг"
        newList = stocks.stream().filter(stock -> stock.getMeasure().equals("кг")).collect(Collectors.toList());
        System.out.println("  filter по ед.измер (measure(кг)) :");
        newList.stream().forEach(System.out::println);
        //по цене = 5f
        newList = stocks.stream().filter(stock -> stock.getPrice().equals(5f)).collect(Collectors.toList());
        System.out.println("  filter по цене (price = 5f) :");
        newList.stream().forEach(System.out::println);

        //сортировка обЪектов по полю Name
        //получим список по алфавиту
        newList = stocks.stream().sorted(Comparator.comparing(Goods::getName)).collect(Collectors.toList());
        System.out.println("  сортировка обЪектов по полю Name :");
        newList.stream().forEach(System.out::println);

        // создаю обЪект для вычисленя порядкового номера
        AtomicInteger idx = new AtomicInteger(1);//начинаем с 1

        System.out.println("  сортировка обЪектов по полю Name с порядковым номером ");
        //порядковый номер + "Название товара" + товар
        newList.stream().forEach
                (st -> System.out.println(idx.getAndIncrement() + ") Название товара: " + st.getName()));

        idx.set(1);//обнулить порядковый номер
        //сортировка обЪектов по полю по цене
        newList = stocks.stream().sorted(Comparator.comparing(Goods::getPrice)).collect(Collectors.toList());
        System.out.println("  сортировка обЪектов по полю по цене");
        newList.stream().forEach
                (st -> System.out.println(idx.getAndIncrement() + ") Название товара: " + st.getName()+
                        " : цена: "+ st.getPrice()));


        List<String> str = Arrays.asList("лимон", "яблоко", "груша", "слива", "хурма");
        List<String> newStr = str.stream().filter(st -> st.length() == 5).collect(Collectors.toList());
        newStr = str.stream().sorted().collect(Collectors.toList());//сортировка по алфавиту
        newStr.stream().forEach(System.out::println );//вывод на экран отсортированные фрукты


        Optional<String> first = newStr.stream().findFirst();//найти первый эл-т в списке
        first.isPresent();//true если найдено
        String result = first.isPresent() ? first.get() : "не найдено";
        System.out.println(result + " это первый эл-т в списке");
        System.out.println(first.orElse("не найдено"));//если есть,вернет то что нашел,а если не то "не найдено"
    }
}

