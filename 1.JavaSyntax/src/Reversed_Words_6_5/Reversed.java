package Reversed_Words_6_5;

import java.util.Arrays;

public class Reversed {
    public static String reverseWords(String str) {
 //      String[] s = str.split(" ");
//       String[] st = new String[s.length];
//        int j = 0;
//        for (int i = s.length - 1; i >= 0; i--) {
//            st[j] = s[i];//st[0]-eating;st[1]-like;st[2]-I
//            j++;
//      }
//       return Arrays.toString(st);

        String[] string = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = string.length - 1; i >= 0; i--) {
            sb.append(string[i] + " ");
            //Метод append() — обновляет значение объекта, который вызвал метод.
            //Этот метод в Java принимает boolean, char, int,long, Strings и т.д.
        }
        return sb.toString().trim();
        //Метод trim() — возвращает копию строки с пропущенными начальными и конечными
        // пробелами, другими словами метод позволяет в Java удалить пробелы в начале и конце строки.
    //-------------     -------------------------------------------------------------------------------------------------
        // другое решение
        // List Words = Arrays.asList(str.split(" "));
        //  Collections.reverse(Words);
        //  return String.join(" ", Words);
    }
    public static void main(String[]args){
        String string = "I like eating";
     System.out.println(reverseWords(string));
    }
}


