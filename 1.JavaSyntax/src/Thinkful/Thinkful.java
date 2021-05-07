package Thinkful;

public class Thinkful {
    public static String updateLight(String current) {

        if (current == "green")
            return"yellow";
        else if (current == "yellow")
            return "red";
        else if (current == "red")
            return"green";
        else
            return "null";
    }


    public static void main(String[]args){
        String string = "yellow";
        String result = updateLight(string);
        System.out.println(result);

    }
}
