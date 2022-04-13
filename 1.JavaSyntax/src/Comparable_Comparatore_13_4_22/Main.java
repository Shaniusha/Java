package Comparable_Comparatore_13_4_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        List<Car> list = new ArrayList<Car>();
        list.add(new Car("vn", 1990));
        list.add(new Car("re", 2020));
        list.add(new Car("volvo", 1850));
        list.add(new Car("mers", 2002));
        list.add(new Car("lada", 2015));

        Collections.sort(list);

        for(Car car: list){
            System.out.println(car.getModel() + " | " + car.getYear());
        }
    }
}
