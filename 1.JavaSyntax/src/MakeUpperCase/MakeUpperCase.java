package MakeUpperCase;

public class MakeUpperCase {
    public static String MakeUpperCase(String str){

        String s1 = str.toUpperCase();
        return s1;
    }
    public static void main(String[]args){
        String str = "Write a function which converts the input string to uppercase.";
        String r = MakeUpperCase(str);
        System.out.println(r);
    }
}
