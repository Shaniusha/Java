package ConvertBooleanValuesTSstringsYesOrNo_26_4;

public class Convert {
    public static String boolToWord(boolean b)
    {
      if (b == true)
           return "Yes";    // return b ? "Yes" : "No";
       else
          return "No";
    }
    public static void main(String[]args){

    System.out.println( boolToWord(false  ));
    }
}
