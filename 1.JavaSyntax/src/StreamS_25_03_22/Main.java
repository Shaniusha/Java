package StreamS_25_03_22;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        //создаем ссылку animals-кол-цию с животными,кот-ая будет содержать ссылку на getAnimals()
        List<Animal> animals = getAnimals();
//
//        //Старый подход(императивный)-говорим программе КАК работать
//        //Фильтруем только хишников
//        List<Animal> predators = new ArrayList<>();
//        for (Animal animal : animals){//проверяем каждое животное animal в списке predators
//            //хишное оно или нет
//            //если животное хишник,тогда добавляем его в кол-цию
//            if(animal.getClassification().equals(Classification.PREDATOR)){
//                predators.add(animal);
//            }
//        }
//        //выводим на печать
//        predators.forEach(System.out::println);//кол-ция хишников


        //Новый подход -Декларативный-
        //(Декларативный)- НЕ обЪясняем своей программе как надо работать,
        //а просто говорим какой результат ЧТО хотим получить

        // Filter
        //фильтр
        //то же что делали с циклом выше
        //кол-ция с животными
        List<Animal> predators = animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .collect(Collectors.toList());
        //выводим на печать
        predators.forEach(System.out::println);//кол-ция хишников
        //то же самое что сверху
        predators.forEach(animal1 -> System.out.println(animal1));//выводим на печать каждого эл-та animal1


        // Sort
        //Сортировка
        //вЫВОД НА ПЕЧАТЬ до сортировки
        //animals.forEach(System.out::println);//в начале у нас ничего не отсортировано(все животные)
        //хотим отсортировать по возрасту
        //кол-ция с животными по возрасту
        List<Animal> sorted = animals.stream()
                .sorted(Comparator.comparing(Animal::getAge))
                .collect(Collectors.toList());
        sorted.forEach(System.out::println);//отсортировано(все животные) по возрасту от младшему к старшему


        // All match
        //все сущности нашей кол-ции удовлетворяют условию старше(возрваст > 10)-это не так
        boolean allMatch = animals.stream()
                .allMatch(animal -> animal.getAge() > 10);
        System.out.println(allMatch);//false

        // Any match
        //хотя бы один удовлетворяет условию старше(возрваст > 10)-это так
        boolean anyMatch = animals.stream()
                .anyMatch(animal -> animal.getAge() > 10);
        System.out.println(anyMatch);//true

        // None match
        //Нет такого-true, а если есть false
        boolean noneMatch = animals.stream()
                .noneMatch(animal -> animal.getName().equals("Медведь"));
        System.out.println(noneMatch);//true

        // Max
        //Возвращаем животное самое старшее
        Animal oldest = animals.stream()
                .max(Comparator.comparing(Animal::getAge))
                .get();
        System.out.println(oldest);//Animal{name='Динозавр', age=200, classification=PREDATOR}
        //или можно записать и так,это одно и то же
        animals.stream()
                .max(Comparator.comparing(Animal::getAge))
                .ifPresent((System.out::println));//Animal{name='Динозавр', age=200, classification=PREDATOR}

        // Min
        animals.stream()
                .min(Comparator.comparing(Animal::getAge))
                .ifPresent((System.out::println));//Animal{name='Рысь', age=2, classification=PREDATOR}

        // Group
        //Группируем по классиф-ции,у нас их 3,тровоядных-3,хищников-4,всеядных-1
        Map<Classification,List<Animal>> classificationListMap = animals.stream()
                .collect(Collectors.groupingBy(Animal::getClassification));
        classificationListMap.forEach(((classification, animals1) -> {
            System.out.println(classification);// выводим классиф-цию
            animals1.forEach(System.out::println);// выводим животных
            System.out.println();//все выводим с новой строки
        } ));

        //с помощью ченинга(перечисление методов через точку)найдем имя самого старого хищного животного
        Optional<String> oldestPredatorAge = animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .max(Comparator.comparing(Animal::getAge))
                .map(Animal::getName);
        oldestPredatorAge.ifPresent(System.out::println);//Динозавр

    }
    private static List<Animal> getAnimals(){//заполняем кол-цию getAnimals животными
        return List.of(// возвращать лист с животными,которых создаем ниже
        new Animal("Слон",20,Classification.HERBIVORE),
                new Animal("Лев",10,Classification.PREDATOR),
                new Animal("Гиена",11,Classification.PREDATOR),
                new Animal("Жираф",7,Classification.HERBIVORE),
                new Animal("Гибон",35,Classification.OMNIVOROUS),
                new Animal("Лошадь",36,Classification.HERBIVORE),
                new Animal("Рысь",2,Classification.PREDATOR),
                new Animal("Динозавр",200,Classification.PREDATOR)
        );
    }
}

