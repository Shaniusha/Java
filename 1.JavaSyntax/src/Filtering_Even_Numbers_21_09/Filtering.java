package Filtering_Even_Numbers_21_09;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Filtering {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        for (int i = 0; i < listOfNumbers.size();)
        {
            if (listOfNumbers.get(i) % 2 == 0) {
                listOfNumbers.remove(i);
            } else {            // нужно было добавить
                i++;          // в коде чтобы выполнилось задание
            }
        }
       return listOfNumbers;
    }

    public static void main(String[] args) {
        List<Integer> listOfNumb = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7));
        System.out.println(filterOddNumber(listOfNumb));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3, 5, 7));
        System.out.println(filterOddNumber(expectedResult));

        List<Integer> listOfNumb1 = new LinkedList<>(Arrays.asList( 1, 2, 2, 2, 4, 3, 4 ));
        System.out.println(filterOddNumber(listOfNumb1));
        List<Integer> expectedResult1 = new LinkedList<>(Arrays.asList( 1, 3 ));
        System.out.println(filterOddNumber(expectedResult1));

    }
}
