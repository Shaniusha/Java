package Comparable_Entily_12_4_22;

import java.time.LocalDate;

public abstract class Goods implements Comparable<Goods>{//класс товары
    //у абстрактного класса есть свои методы НО создать обЪект в таком классе нельзя,потому что этот класс для того
   // делать из него другие классы(служить общим предком)

    //свойства класса
    private String type;//тип
    private String name;//наименование
    private Float price;//цена
    private LocalDate data;

    public Goods(String type, String name, Float price, LocalDate date) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.data = date;
    }
    public Goods(){

    }
    //метод выводит словесное описание нашего товара
    //concat-это метд соединения вместо +
    @Override//обозначает перекрыть
    public String toString() {
        return type.concat(" : ").concat(name).concat(" : ").concat(price.toString()
        .concat(" : ").concat(data.toString()));
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
}
