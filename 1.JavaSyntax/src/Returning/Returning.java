package Returning;

public class Returning {
    public static String greet(String name,String so )
    {
        return "Hello, " + name + " how are you doing today?" + " - " + so + "!";


    }

    public static void main(String[]args) {
        String s = "Alla";
        String a= "OOOOO";

        System.out.println(greet(s,a));

    }
}
