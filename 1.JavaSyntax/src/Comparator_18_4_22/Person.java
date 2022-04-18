package Comparator_18_4_22;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//так сравниваются,сортируются классы для разных коллекций
//если нет доступа к интерфейсу Person но нужно отсортировать. Применяем  класс Comparator
class Person {
   private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
//переопределяем интерфейс ComparePerson наследуя все от class Comparator
class ComparePerson implements Comparator<Person> {
    @Override
     public int compare(Person o1,Person o2) {
        return o1.getAge() - o2.getAge();//используем алгоритм для sout
    }
}
 class Main{
 public static void main(String[] args) {

     Set set = new TreeSet(new ComparePerson());//то что в() ComparePerson com = new ComparePerson();
     set.add(new Person(4));
     set.add(new Person(6));
     set.add(new Person(5));
     set.add(new Person(2));
     for(Object o : set){
         System.out.println(o);
     }
 }
}
