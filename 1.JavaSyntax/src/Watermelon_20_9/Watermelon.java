package Watermelon_20_9;

public class Watermelon {
    public static boolean divide(int weight) {
      return  weight >= 3 && weight % 2 == 0;
    }
    public static void main(String[] args) {
        int a = 10;
        int e = 22;
        int r = 2;
        int t = 12;
        int y = 3;
        System.out.println(divide(a) +" " + "a");
        System.out.println(divide(e) +" " + "e");
        System.out.println(divide(r) +" " + "r");
        System.out.println(divide(t) +" " + "t");
        System.out.println(divide(y) +" " + "y");
    }
}

//Примеры
//div (2) == false // 2 = 1 + 1 // оба слагаемых должны быть четные
//div (3) == false // 3 = 1 + 2
//div (4) == true // 4 = 2 + 2
//div (5) == false // 5 = 2 + 3
//div (6) == true // 6 = 2 + 4
//div (22) == true // 22 = 10 + 12
