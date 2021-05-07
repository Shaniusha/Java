package Remove_First_An_Last_Character_27_4;

public class Remove {
    public static String remove(String str) {

        return  str.substring(1,str.length()-1);
    }
    public static void main(String[] args) {
    String s = "eloquent";
    System.out.println(remove(s));
    String d = "country";
    System.out.println(remove(d));
    }
}


