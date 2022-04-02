package StreamLambda_2_4_22;

import java.util.ArrayList;
import java.util.List;

public class WithoutLambda {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();//список животных

        animals.add(new Animal("fish",false,true));
        animals.add(new Animal("kangaroo",true,false));
        animals.add(new Animal("rabbit",true,false));
        animals.add(new Animal("turtle",false,true));

//        ChecklfHopper check = new ChecklfHopper();
//        print(animals,check);
        //это то что написано сверху в комментах,только мы создаем анонимный класс
        print(animals,new CheckIfHopper());   //если запись такая,то это анонимный класс и создаем его один раз
                                              //после выполнения метода использовать этот класс использовать
                                              // не будем и сборщик мусора его заберет
//      print(animals, a -> a.canHop());      // то же самое НО с Lambda выражением
    }
    //метод static принимает на вход список животных List<Animal> animals,
    // кот-ых создали в верху
    // и принимает интерфейс CheckTrait checker в который мы передали этот класс new CheckIfHopper()
    private static void print(List<Animal> animals,CheckTrait checker){

        for (Animal animal : animals){//пробегаем по кол-ции animals и смотрим на каждого животного
            if (checker.test(animal)) {//применяем метод test интерфейса CheckTrait
                System.out.print(animal + " ");// kangaroo rabbit  // печатаем если true (прыгает)
            }
        }
        System.out.println();
    }
}
