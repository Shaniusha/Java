package Goods_31_5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaSet {
    public static void main(String[] args) {
        Set<String> str = new HashSet<>();
        str.add("Вена");
        str.add("Берлин");
        str.add("Прага");
        System.out.println(str.size());
        System.out.println(str.add("Вена"));//false // не добавит уже существующий объект

        //д.з

        // Удаляем элементы из множества с помощью метода remove()
        str.remove("Берлин");
        System.out.println("Список после удаления Берлин: " + str);


        //Перебор содержимого коллекции может быть осуществлен двумя способами:
        // c помощью цикла for each и с помощью итератора.
        //Итератор позволяет осуществлять обход коллекции и при желании удалять избранные элементы.
        // Используется интерфейс Iterator.
        //Чтобы получить объект итератора, вызовите метод Iterator<E> iterator().

        // Проходимся по элементам HashSet с помощью итератора:
        System.out.println("Перебор списка:");
        Iterator<String> i = str.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        //определяем, есть ли элемент в множестве
        boolean s = str.contains("Берлин");
        System.out.println("Берлин - есть ли элемент в множестве? " + s);

        // возвращаем размер множества
        System.out.println("размер множества - " + str.size());

        //удаляем все элементы из коллекции
        str.clear();
        System.out.println("Список после удаления всех элементов : " + str.size());

        //возвращает true если множество пустое, и false если там есть хотя бы 1 элемент
        System.out.println(str.isEmpty() + " - множество пустое ");

        Set<String> str1 = new HashSet<>();// создали новую коллекцию
        str1.add("Будапешт");
        str1.add("Дрезден");
        str1.add("Бухарест");
        str1.add("Берлин");
        str1.add("Прага");
        str1.add("Вена");
        str1.add("Варна");

        // метод addAll(...) добавили элементы коллекции str1 в str
        System.out.println( str.addAll(str1) + " - добавиление элементов коллекции str1 в str");
        System.out.println(str + " - Перебор обновленного списка str");


        //Создание HashMap
        //создали словарь, в котором элементы будут храниться в формате “число-строка”.
        //Число будет выступать ключом(стоит на первом месте), а строка — значением.
        // указали какого типа у нас будут ключи (Integer), а какого — значения (String).

        HashMap<Integer, String> priceAndCity = new HashMap<>();
        priceAndCity.put(345,"Берлин");
        priceAndCity.put(125,"Будапешт");
        priceAndCity.put(231,"Дрезден");
        System.out.println(priceAndCity);

        //Попробуем добавить новый элемент с уже имеющимся в мапе ключом:

        priceAndCity.put(125,"Прага");
        priceAndCity.put(57,"Варна");
        System.out.println(priceAndCity);//Предыдущий элемент с ключом 125,был перезаписан.

        String city = priceAndCity.get(125);
        System.out.println(city);

    }
}
