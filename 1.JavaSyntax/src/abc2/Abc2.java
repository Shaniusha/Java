package abc2;

public class Abc2 {

    public static void main(String[] args) {

        String str = "Create a method take that ac"; // c = ind 27
        int[] alfa1 = new int[str.length()];
        for (int j = 0; j < str.length(); j++) {
            alfa1[j] = 0;
        }
        for (int j = 0; j < str.length(); j++) {
            String c1 = str.substring(j, j + 1);
            //System.out.println(c1);
            c1 = c1.toLowerCase();
            int index1 = str.indexOf(c1);
            alfa1[index1]++;
        }
        for (int j = 0; j < str.length(); j++) {
            System.out.println(alfa1[j]);
        }
        int index2 = str.indexOf('C');
        int index3 = str.indexOf('r');
        int index4 = str.indexOf('e');
        int index5 = str.indexOf('a');
        int index6 = str.indexOf('t');
        int index7 = str.indexOf('m');

        System.out.println("Мы ищем букву 'C' в строке "+str+". Индекс данной буквы "+index2 );
        System.out.println("Мы ищем букву 'r' в строке "+str+". Индекс данной буквы "+index3 );
        System.out.println("Мы ищем букву 'e' в строке "+str+". Индекс данной буквы "+index4 );
        System.out.println("Мы ищем букву 'a' в строке "+str+". Индекс данной буквы "+index5 );
        System.out.println("Мы ищем букву 't' в строке "+str+". Индекс данной буквы "+index6 );
        System.out.println("Мы ищем букву 'm' в строке "+str+". Индекс данной буквы "+index7 );
    }
}
