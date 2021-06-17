package Goods_31_5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class JavaApp {
    public static void main(String[] args) {
        Goods stock1 = new Goods("Чай", 10.5f, "пачка");
        stock1.buy(100f);// 100 пачек чая
        stock1.toString();//сейчас на складе 100 чая

        stock1.buy(50f);// покупка (заданного) кол-ва товара
        String s = stock1.toStringCom("после покупки 50 пачек");

        stock1.sale(10f);//  продажа (заданного) кол-ва товара
        s = stock1.toStringCom("после продажи 10 пачек");

        Goods bread = new Goods("Хлеб зерновой", 5f, "буханка");
        bread.buy(245F);
        bread.toString();
        bread.sale(4f);
        bread.calc_discount(bread.calc_discount(20f));// скидка 20 % (хлеб.новая цена(хлеб.скидка 20 %))
        bread.rename("Хлеб зерновой черный"); // переименование
        bread.getName();

        Goods milk = new Goods("Молоко", 3f, "пакет");

        List<Goods> goods = new ArrayList<>();// создаю новый список goods
        goods.add(milk); //добавляю в список объект milk
        goods.add(stock1);
        goods.add(bread);
        goods.add(new Goods("Кофе", 95f, "кг"));

        for (int i = 0; i < goods.size(); i++) { // просмотр списка при помощи get
            Goods stock = goods.get(i);// по номеру эл-та (i)  c помошью get  получаем эл-т списка
            System.out.println(stock);
        }
        //  просмотр списка при помощи итератора
            print(goods);

        boolean a = goods.contains(milk);//contains проверят есть ли объект в списке
        System.out.println(a + " - проверили есть ли milk в списке ");
        Goods water = new Goods("Вода", 3f, "литр");
        System.out.println(goods.contains(water) + " - проверили есть ли water в списке");//false   boolean a  = goods.contains(water) ,нет воды
        goods.add(water);// добавели воду
        System.out.println(goods.contains(water) + " - проверили есть ли water в списке");//true
        int n = goods.indexOf(bread);// метод indexOf возвращает номер эл-та списка
        System.out.println("bread - индекс номер - " + n);

        //  д.з

        goods.add(stock1);// добавляю в список еще один  уже сущуствующий обект //чай
        boolean b = goods.contains(stock1);//contains проверят есть ли объект в списке
        if (b) {  // == true  b - логическая переменная
            System.out.println("Такой товар уже есть");
            System.out.println(goods.remove(stock1));// true если нашел такой чай и удалил его
        }

        goods.add(3, new Goods("Cыр", 10.5f, "кг"));//добавить объект в список под 3 индексом
        print(goods);

        int size = goods.size();//возвращает размер списка - к-во эл- ов списка
        System.out.println(size);

        Goods goods1 = goods.get(3);//Возвращает элемент, который расположен в указанной позиции списка.
        System.out.println(goods1);

        int t = goods.indexOf(milk);//Метод возвращает индекс  элемента в списке.
        System.out.println("milk - индекс номер - " + t);

        Goods h = goods.remove(1);//Удаление элемента в указанной позиции индекса. // хлеб
        // После удаления сдвигает все элементы влево для заполнения освободившегося пространства.
        //Если index<0 или >= количество элементов списка, будет выброшено исключение IndexOutOfBoundsException.
        // В результате метод возвращает элемент, который был удален.
        System.out.println(h);

        goods.lastIndexOf(milk);//поиск с конца
        System.out.println(goods.lastIndexOf(milk));

        Goods goods2 = new Goods("Йогурт", 3.7f, "упаковка");
        goods.set(4, goods2);
        print(goods);

    }

    private static void print(List<Goods> list) {
        for (Goods l : list) {
            System.out.println(l);
        }
    }
}


