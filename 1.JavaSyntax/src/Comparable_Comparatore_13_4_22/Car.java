package Comparable_Comparatore_13_4_22;

public class Car implements Comparable<Car> {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

   @Override

    public int compareTo(Car car) {//как сравнить два обЪекта: текущий в(public Car) и с тем что в скобках car
        if(year == car.getYear()){ //по году
            return  0;// это равно
        }
        if(year < car.getYear()) {
            return -1;// это если меньше   //можно поменять на 1
        }
        return  1;//это если больше //можно поменять на -1
    }

//    !!! Можно метод и по моделям,НО в Comparable можно ТОЛЬКО ОДИН метод

//    public int compareTo1(Car car) {
//        return model.compareTo(car.getModel());//по названию моделей(по алф)
//    }
}

