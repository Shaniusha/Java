package Grasshopper_Personalized_Message_5_5;

public class Grasshopper {
    static String greet(String name, String owner) {
        if(name.equals(owner))
            return "Hello boss";
        else
            return "Hello guest";
    }
    public static void main(String[] args){
        String name = "Nik";
        String owner = "Sem";              //"Sem";
        System.out.println(greet(name,owner));
    }
}
// return name.equals(owner) ? "Hello boss" : "Hello guest";//решение в одну строку