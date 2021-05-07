package lessonShifr_25_4;

public class lesson {
    public static String dshifr(String str, int n) {
        String result = "";
        String a = "abcdefghijklmnopqrstuvwxyz /123abcdefghijklmnopqrstuvwxyz /123";
        for (int i = 0; i < str.length(); i++) {

            String res = str.substring(i, i + 1);
            res = res.toLowerCase();
            int nn = a.indexOf(res);
            nn = nn - n;
            String j = a.substring(nn, nn + 1);
            result = result + j;

        }
        return result;
    }
    public static String shifr(String str, int n) {
        String result = "";
        String a = "abcdefghijklmnopqrstuvwxyz /123abcdefghijklmnopqrstuvwxyz /123";
        for (int i = 0; i < str.length(); i++) {

            String res = str.substring(i, i + 1);
            res = res.toLowerCase();
            int nn = a.indexOf(res);
            nn = nn + n;
            String j = a.substring(nn, nn + 1);
            result = result + j;
        }
        return result;
    }
    public static void main(String[] args) {

        String s = "Create a method take that accepts a list/array and a number nz";
        String d = shifr(s,3);
        System.out.println(d);
        String d1 = dshifr(d,3);
        System.out.println(d1);
        for (int i = 0; i < 35; i++){
            System.out.print(i);
            d1 = dshifr(d,i);
            System.out.println(d1);
        }
    }
}

