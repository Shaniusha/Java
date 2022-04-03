package StreamLambda_2_4_22;

public class CheckIfSwimmer implements CheckTrait {
    @Override
    public boolean test(Animal a) {//реализуем метод  interface CheckTrait
        return a.canSwim();//возвращает true если животное плавает
    }

    @Override
    public String strTest(Animal a) {
        if (a.canSwim())
            return "животное плавает";
        else
            return "животное не плавает";
    }
}


