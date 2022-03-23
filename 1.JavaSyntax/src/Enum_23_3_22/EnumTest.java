package Enum_23_3_22;

public class EnumTest {
//                        //как было ДО enum
//    private static final int DOG = 0;
//    private static final int CAT = 1;
//    private static final int FROG = 2;
//
//    public static void main(String[] args) {
//        //int animal = DOG;//это верно    1-ый вариант
//        int animal = 100;//это верно, задаем любое число т.к это int
//
//        switch (animal){
//            case DOG://если у нас dog,то выводим на экран(см. не строку ниже)
//                System.out.println("It's a dog");
//                break;// прекращаем поиск
//            case CAT:
//                System.out.println("It's a cat");
//                break;
//            case FROG:
//                System.out.println("It's a frog");
//                break;
//            default://если это не dog и не cat и не frog
//                System.out.println("It's not an animal");//это не животное
//        }
        // как создать ENUM
        // стать на пакет Enum_23_3_22
        // new-JavaClass-Enum-ДаемИмя-Enter
        // создается новый Enum на новом листе
//     }
        public static void main(String[] args) {
                Animal animal = Animal.CAT;//в перем-ой animal типа Animal лежит CAT
                                           //CAT ведет себя как статическая переменная
                                           //получаем к ней доступ через имя Enum Animal
                                           //что-то другое то что не в Enum поместить не можем,например 100(как выше)
                switch (animal){
                        case CAT:
                             System.out.println("It's a cat");
                             break;
                        case DOG://если у нас dog,то выводим на экран(см. не строку ниже)
                                System.out.println("It's a dog");
                             break;// прекращаем поиск
                        case FROG:
                             System.out.println("It's a frog");
                              break;
                        default://если это не dog и не cat и не frog
                              System.out.println("It's not an animal");//это не животное
                }

                Season season = Season.SUMMER;//в перем-ой season типа Season лежит SUMMER(лето)

                //класс Object от которого наследуются все классы в Java
                // от Object наследуется  наш класс EnumTest      Object -> EnumTest
                //при создании Enum (см.ниже) наследует некоторые методы для пречислений
                //Object -> Enum -> Season
                System.out.println(season instanceof Season);//instanceof проверяет является ли оЪект season
                                                             //оЪектом класса Season
                                                             //если да,то true         true
                System.out.println(season instanceof Enum);// true
                System.out.println(season instanceof Object);// true
                System.out.println(season.getClass());//class Enum_23_3_22.Season

                switch (season){//проходим по временам года
                        case SUMMER://если лето
                                System.out.println("Тепло");//то
                                break;
                        case WINTER:
                                System.out.println("Холодно");
                                break;
                }
        }
}

