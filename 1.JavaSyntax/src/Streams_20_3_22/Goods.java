package Streams_20_3_22;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Goods {// товары
    // свойства класса
    private String name;//наименование товара
    private Float price = 0f;//цена,с плавающей запятой
    private Float count;//кол-во
    private String measure;//ед.измерения(кг,упаковки...)
    private Float amount = 0f;//стоимость всех товаров (price*count),вначале всегда 0
    private LocalDateTime date = LocalDateTime.now();//дата сейчас


    public Goods(String name, Float price, String measure){
        //при помощью конструктора создаем новый обЪект и задаем ему
        //важные параметры

        this.name = name;
        this.price = price;
        this.measure = measure;
        this.count = 0f;//с самого начала=0,и count меняется только при покупке или продаже
    }

    public Goods(String name, Float price, Float count, String measure, LocalDateTime date) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.measure = measure;
        this.date = date;
    }

    public Goods(String name, Float price, String measure, LocalDateTime dt) {
        this.name = name;
        this.price = price;
        this.measure = measure;
        this.date = dt;
    }

    public void sale(Float amount){//(метод)продажи
        count = count - amount;//count (от этого кол-ва которое есть)-amount(то что передается в параметре,
                               // сколько продали) = уменьшаем кол-в
        amount = count * price;//пересчитываем стоимость в соответствии с новым кол-ом
    }

    public void rename (String newName){//переименовываем товар
        this.name = newName;

    }

    public void buy(Float amount){//покупки
        count = count + amount;//count(к этому кол-ву которое есть)+amount(то что передается в параметре,
                               // сколько купили) = увеличиваем кол-во
        this.amount = count * price;//пересчитываем стоимость в соответствии с новым кол-ом
    }

    public Float getAmount() {
        return amount;
    }

    public Float getPrice() {
        return price;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Float getCount() {
        return count;
    }

    public String getName(){
        return name;
    }

    public String getMeasure() {
        return measure;
    }

    public String toString(){//описываем товар в виде строки 
        return getName() + " " + String.valueOf(getCount()) + " " + getMeasure();
        // наименование+кол-во+ед.измерения
    }
}
