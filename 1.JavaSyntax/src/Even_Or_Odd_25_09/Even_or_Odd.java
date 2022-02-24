package Even_Or_Odd_25_09;

public class Even_or_Odd {
    public static String even_or_odd(int number) {
//        if (number % 2 == 0)
//            return "Even";
//        else
//            return "Odd";
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(even_or_odd(num));
        int num1 = 7;
        System.out.println(even_or_odd(num1));
    }
}
