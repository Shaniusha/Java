package StreamLambda_2_4_22;

public class Animal {
    private String species;//вид животного
    private boolean canHop;//умеющий прыгать
    private boolean canSwim;//умеющий плавать

    public Animal(String speciesName,boolean hopper,boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }
    //т.к поля приватные к ним можно обращаться через метод
    public boolean canHop() {//метод
        return canHop;//получить значение умеющий прыгать
    }
    public boolean canSwim() {
        return canSwim;//получить значение умеющий плавать
    }
    public String toString() {//напечатать
        return species;
    }
}
