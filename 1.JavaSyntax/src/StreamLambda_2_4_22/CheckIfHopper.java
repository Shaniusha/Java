package StreamLambda_2_4_22;

public class CheckIfHopper implements CheckTrait {//класс проверь если прыгает
    @Override
    public boolean test(Animal a) {// метод кот-ый реализует метод из interface CheckTrait,(на вход животное-a)
        return a.canHop();//возвращает если прыгающее животное-true(реализация interface CheckTrait)
    }

    @Override
    public String strTest(Animal a) {
        return a.canHop()?"прыгающее животное":"не умеет";
    }
}
