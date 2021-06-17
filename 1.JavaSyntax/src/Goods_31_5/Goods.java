package Goods_31_5;

public class Goods {
    private String name;// наименование
    private Float price = 0f;// цена
    private Float count;// кол-во товара
    private String measure;// мера (шт,кг..)
    private Float amount = 0f;// на какую сумму товар

    public Goods(String name, Float price, String measure) {
        this.name = name;
        this.price = price;
        this.measure = measure;
        this.count = 0f;
    }
    public Float calc_discount(Float disc) // метод для расчета скидки
    {
        price = price - (price * disc / 100); //5 - (5 * (20 / 100) = 5 - (5 * 0.2) = 5 - 1 = 4
        this.amount = count * price;// новая стоимость всего товара на складе //this.amount-поле класса
        return price;
    }

    public void sale(Float num) { // вычитаем кол-во этого товара,из кол-ва на складе
        count = count - num;
        this.amount = count * price;// новая стоимость всего товара на складе
        System.out.println(toStringCom("после продажи :"));
    }
    public String toString(){

        String str = ("наименование - " + getName() + " ; цена одного товара - " + getPrise() + "$"
                + " ; цена всего товара - " + getAmount() + "$"  + " ; единица измерения - " + getMeasure()
                + " ; кол-во товара на складе - " + getCount());
        return str;
    }
    public String toStringCom(String comment){
        return comment + " " + toString();
    }

    public void rename(String newName) { // переименование товарa
        String log = "перименовано " + name + " в " + newName + " :";
        this.name = newName;
        System.out.println(toStringCom(log));
    }
    public void buy(Float amount ) { // добавляем кол-во этого товара, к кол-ву на складе
        count = count + amount;
       this.amount = count * price;// новая стоимость всего товара на складе //this.amount-поле класса
        System.out.println(toStringCom("после покупки товара :"));
    }
    public String getName() { // наименование товара
        return name;
    }
    public Float getCount() { // кол -во товара на складе
        return count;
    }
    public void setCount(Float count) { // изменяет count
        this.count = count;
    }
    public Float getPrise() { // цена
        return price;
    }
    public void setPrice(Float price) {
            this.price = price;
    }
    public String getMeasure() { // мера измерения
       return measure;
    }
    public Float getAmount() { // на какую сумму товар
        return amount;
    }
    public void setAmount(Float amount) { // изменение суммы
        this.amount = amount;
    }
}




