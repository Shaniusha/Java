package StreamLambda_2_4_22;

import java.util.ArrayList;
import java.util.List;

public class WithLambda {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();//список животных

        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        //Lambda выражение
        print(animals, a -> a.canHop());//к животному a.применяем метод canHop()//прыгает
    }
    //метод static принимает на вход список животных List<Animal> animals,
    // кот-ых создали в верху
    // и принимает интерфейс CheckTrait checker

        private static void print (List < Animal > animals, CheckTrait checker){
            for (Animal animal : animals){//пробегаем по кол-ции animals и смотрим на каждого животного
                if (checker.test(animal)) {//применяем метод test интерфейса CheckTrait
                                           // если прыгающее животное и будет -true
                                           // то зайдем в строку -  System.out.print(animal + " ")
                                           // если НЕ прыгающее животное и будет - false
                                           // то во внутрь не зайдем
                    System.out.print(animal + " ");// kangaroo rabbit  // печатаем если true (прыгает)
                }
            }
            System.out.println();
    }
}
