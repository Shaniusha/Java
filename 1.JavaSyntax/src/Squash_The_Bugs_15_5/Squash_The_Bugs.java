package Squash_The_Bugs_15_5;

public class Squash_The_Bugs {
    public static int findLongest(final String str) {
        String[] spl = str.split(" ");//Метод split - разделяет строку на подстроки,( на отдельные
        //слова) используя разделитель.В нашем случае " " пробел между строк.
        int longest = 0;// размер строки в ячейке = 0
        for (int i = 0; i < spl.length; i++) {
            if (spl[i].length() > longest) {//размер строки в этой(очередной) ячейки > чем 0
                longest = spl[i].length();// присваиваем  int longest значение > 0
            }
        }// заканчивается for, проверили все размеры подстрок
        return longest;// строка 10
    }
    public static void main(String[] args) {
        String s = "The quick white fox jumped around the massive dog";
        System.out.println(findLongest(s));

        String st = "Take me to tinseltown with you";
        System.out.println(findLongest(st));

        String str = "Sausage chops";
        System.out.println(findLongest(str));
    }
}


