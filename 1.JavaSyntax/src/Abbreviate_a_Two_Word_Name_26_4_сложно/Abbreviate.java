package Abbreviate_a_Two_Word_Name_26_4_сложно;

import java.util.Locale;

public class Abbreviate {
    public static String abbrevName(String name) {
        String[] words = name.split(" ");
        // name.split(" ")- разделяет строку на подстроки, используя разделитель, в данной строке слова
        // разделены друг от друга пробелами. Пробел — идеальный кандидат на роль разделителя в данном случае.

        return Character.toUpperCase(words[0].charAt(0)) + "." + Character.toUpperCase(words[1].charAt(0));
        //toUpperCase - делает  буквы в строке заглавными
        //words[0] -массив с 0-ым индексом ячейки - это имя
        //chartAt (int index) - возвращает символ, стоящий на определенном индексе.(индексы начинаются с 0),
                                                                     // это буква 0-го индекса,т.е  S; P; e.
        //words[1] -массив с 1-ым индексом ячейки - это фамилия

    }
    public static void main (String[]args){
        String s = "Sam Harris";                  // 0| e | c |  chartAt
                                                  // 1| v | o |
        System.out.println(abbrevName(s));        // 2| a | l |
                                                  // 3| n | e |
        String p = "Patrick Fen";                 //    0   1
        System.out.println(abbrevName(p));        //    words

        String e = "evan cole";
        System.out.println(abbrevName(e));
  }
}


