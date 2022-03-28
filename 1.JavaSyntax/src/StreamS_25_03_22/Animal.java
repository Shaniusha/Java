package StreamS_25_03_22;

public class Animal {
    private final String name;//имя
    private final int age;//возраст
    private final Classification classification;

    //генерируем конструктор
    public Animal(String name, int age, Classification classification) {
        this.name = name;
        this.age = age;
        this.classification = classification;
    }
    //генерируем get-оры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Classification getClassification() {
        return classification;
    }
    ////генерируем toString
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classification=" + classification +
                '}';
    }
}
