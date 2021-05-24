package Beginne_Series_24_5;

public class Beginner_Series_4 {
    public  static int cockroachSpeed(double x){
        // Good Luck!
        double s = x * 100000 / 3600;  //1.09 * 100000 / 3600 = 30.2777778
        int sp = (int) s; // приведение типо из double к int

        int speed = (int) Math.round(sp); // метод округления до целого числа

        return speed;
    }
    public static void main(String[] args){
        double n = 0.08;
        double m = 1.09;
        double p = 2.04;
        System.out.println(cockroachSpeed(n));
        System.out.println(cockroachSpeed(m));
        System.out.println(cockroachSpeed(p));
    }
}
//  1 км = 1000 м                     1 час = 60 мин                   (x * 100000 / 3600) -функция которая
//  1 м = 100 см                      1 мин = 60 сек                   измеряет скорость в км в час и
//  1 км = 1000 * 100 = 100000 см     1 час = 60 * 60 = 3600 сек       возвращает ее в см в секунду
