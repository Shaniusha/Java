package Stream_API_25_3_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//import java.util.stream;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Streamm {
    public static void main(String[] args) {
        // найти в массиве количество всех чисел, которые больше 0
        //До JDK 8 мы бы могли написать
        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int count = 0;
        for (int i : numbers) {
            if (i > 0) count++;
        }
        System.out.println("количество всех чисел = " + count);//5

        //Теперь применим Stream API:
        //Теперь вместо цикла и кучи условных конструкций, которые мы бы использовали до JDK 8,
        // мы можем записать цепочку методов, которые будут выполнять те же действия.
        long count1 = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
        System.out.println("количество всех чисел = " + count1);

        //

        //Пример c потоком:
        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10)
                .limit(3).forEach(System.out::println);//IntStream-это класс(import)
        //Пример без потока:
        int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
        int count2 = 0;
        for (int x : arr) {
            if (x >= 90) continue;
            x += 10;
            count2++;
            if (count2 > 3) break;
            System.out.println(x);
        }

        //Сортировка строк по длине
        //Sorting String
        String[] testStrings = {"четыре","три","девять","один","два"};

        //Было
        //у класса Arrays вызываем метод sort,это возможно сделать не создавая обЪект,т.к класс Arrays-static
        Arrays.sort(testStrings, new Comparator<String>() {
            //от меньшей длины String большей
            @Override
            public int compare(String s1, String s2) {//сравни первое слово со вторым
                return (s1.length() - s2.length());//если +.то первое слово длинее второго,
                //если -,то второе длинее,если 0 -тоодинаковые
            }
        });
        //Стало
        Arrays.sort(testStrings,(s1,s2) -> s1.length() - s2.length());//от меньшей длины String большей

        System.out.println("сортировка по длине строк");
        Arrays.stream(testStrings).forEach(System.out::println);
        Arrays.sort(testStrings);//по алфавиту
        System.out.println("сортировка по алфавиту");
        Arrays.stream(testStrings).forEach(System.out::println);
        //System.out.println();//sout+Tab (чтобы быстро напечатать)

        //
        //Возможные способы создания Stream:
//       - Пустой стрим: Stream.empty()
//       - Стрим из List: list.stream()
//       - Стрим из Map: map.entrySet().stream()
//       - Стрим из массива: Arrays.stream(array)
//       - Стрим из указанных элементов: Stream.of("1", "2", "3")
//
//        Операторы (по сути методы класса Stream)
//        - Промежуточные (“intermediate”, ещё называют “lazy”) —
//        поступающие элементы и возвращают стрим. Промежуточных операторов в цепочке обработки элементов может
//        быть много.
//        -
//        Терминальные (“terminal”, ещё называют “eager”) — обрабатывают элементы и завершают работу стрима,
//        так что терминальный оператор в цепочке может быть только один.

        List<String> list = new ArrayList<String>();//создаём список list;
        //заполняем его тестовыми данными;
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        Stream stream = list.stream();//создаём обьект Stream;
        //метод filter (фильтр) — промежуточный оператор, x приравнивается к одному элементу коллекции для перебора
        // (как при for each) и после -> мы указываем как фильтруется наша коллекция и так как это промежуточный
        // оператор, отфильтрованная коллекция идёт дальше в метод forEach который в свою очередь является
        // терминальным (конечным) аналогом перебора for each
        // (Выражение System.out::println сокращенно от: x-> System.out.println(x)),
        // которое в свою очередь проходит по всем элементам переданной ему коллекции и выводит её)
        stream.filter(x-> x.toString().length() == 3).forEach(System.out::println);







    }

}
