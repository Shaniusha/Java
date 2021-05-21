package Fake_Binary_19_5;

public class Fake_Binary {
    public static String fakeBin(String numberString) { //1-ый способ
        char[] chars = numberString.toCharArray(); //  char - тип символов
        for (int i = 0; i < numberString.length(); i++) {

            if ((chars[i] - '0') < 5) { // '0'-символ 0, а не число!!!!!
                chars[i] = '0'; //Тип char является псевдоцелочисленным типом,
                // поэтому значения этого типа можно задавать в виде числа
            } else {
                chars[i] = '1';
            }
        }
            return String.valueOf(chars);
        }
    public static String fakeBin1(String numberString) { //2-ой способ
        String res = "";
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) < '5') { // String прещбразуем в char
                res += '0'; // res = res + '0';
            } else {
                res += '1';
            }
        }
        return res;
    }
    public static String fakeBin2(String numberString) { //3-ий способ

        String rt = numberString.replace("0","0");
        rt = rt.replace("1","0");        //replace() - заменить символ в строке
        rt = rt.replace("2","0");
        rt = rt.replace("3","0");
        rt = rt.replace("4","0");
        rt = rt.replace("5","1");
        rt = rt.replace("6","1");
        rt = rt.replace("7","1");
        rt = rt.replace("8","1");
        rt = rt.replace("9","1");

        return rt;
    }
    public static void main(String[] args) {
        String str = "47385";
        String str1 = "16273849";

        System.out.println(fakeBin(str));
        System.out.println(fakeBin(str1));
        System.out.println(fakeBin1(str));
        System.out.println(fakeBin1(str1));
        System.out.println(fakeBin2(str));
        System.out.println(fakeBin2(str1));
    }
}









