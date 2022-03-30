package Stream_API_25_3_22;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.*;

public class Stream {
    public static void main(String[] args) {
        // найти в массиве количество всех чисел, которые больше 0
        //До JDK 8 мы бы могли написать
        int[] numbers = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
        int count = 0;
        for(int i:numbers){
            if(i > 0) count++;
        }
        System.out.println("количество всех чисел = "+ count);//5

        //Теперь применим Stream API:
        //Теперь вместо цикла и кучи условных конструкций, которые мы бы использовали до JDK 8,
        // мы можем записать цепочку методов, которые будут выполнять те же действия.
        long count1 = IntStream.of(-5,-4,-3,-2,-1,0,1,2,3,4,5).filter(w -> w > 0).count();
        System.out.println("количество всех чисел = "+ count1);

        //

        //Пример c потоком:
        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10)
                .limit(3).forEach(System.out::print);//IntStream-это класс(import)
        //Пример без потока:
        int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
        int count2 = 0;
        for (int x : arr) {
            if (x >= 90) continue;
            x += 10;
            count2++;
            if (count2 > 3) break;
            System.out.print(x);
        }

        //Сортировка строк по длине
        //Sorting String
        String[] testStrings ={"один","два","три","четыре"};
        //Было
        Arrays.sort(testStrings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.length() - s2.length());
            }
        });
        //Стало
        Arrays.sort(testStrings,(s1,s2) -> s1.length() - s2.length());
    }
}
