package Stringrepeat;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        String result = "";
        int n = 0;
        while (n < repeat) {
            result =result + string;
            n++;
        }
        return result;
    }
    public static void main (String[]args) {
       int r = 6;
       String s = "I";
       System.out.println( repeatStr(r,s)); //


        int r1 = 3;
        String s1 = "Hello";
        System.out.println(repeatStr(r1,s1));

        int r2 = 4;
        String s2 = "a";
        System.out.println(repeatStr(r2,s2));

        int r3 = 0;
        String s3 = "kata";
        System.out.println(repeatStr(r3,s3));

        int r4 = 5;
        String s4 = "";
        System.out.println(repeatStr(r4,s4));

    }

    }



