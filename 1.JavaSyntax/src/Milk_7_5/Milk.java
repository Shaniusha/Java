package Milk_7_5;

public class Milk {
    public static double milk (int day) {
        double bottels = day / 1.5;
        return bottels;
    }
    public static double bootel (double milk) {
       double days = 1.5 * milk;
        return days;
    }
    public static void main(String[] args) {
      int day = 7;
      int milk = 10;
      System.out.println( milk(day) + " bottels  za " + day + " days");
      System.out.println("za " + bootel(milk)+ " days " + milk + " bottels" );
    }
}
