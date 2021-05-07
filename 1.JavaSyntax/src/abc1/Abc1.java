package abc1;

public class Abc1 {
    public static void main(String[] args) {
        String s = "Create a method take that accepts a list/array and a number nz";
        String a = "abcdefghijklmnopqrstuvwxyz /123";
        int[] alfa = new int[a.length()]; //здесь нули

        for (int i = 0; i < a.length(); i++) {
            alfa[i] = 0; //каждому эл-ту присваиваем ноль  /
        }
        for (int i = 0; i < s.length(); i++) {
            // цикл начинается с буквы "С" и до "z"

            String c = s.substring(i, i + 1); // метод Извлекает символы из строки,
            // начиная с указанной начальной позиции и до указанного количества символов.

           // System.out.println(c);  // распечатать символы по одному(буквы)

            c = c.toLowerCase(); //   метод (без учета регистра)  Л = л  В = в

            int index = a.indexOf(c); // Метод ищет в строке заданный символ ,
            // и  возвращает индекс (т.е. порядковый номер). Метод:
            //- возвращает индекс, под которым символ первый раз появляется в строке;
            //- возвращает (-1) если символ не найдены. !!!

            alfa[index]++;// к каждому индексу + 1.  T.к в массиве alfa все индексы = 0
            //  и индекс повышается на 1,то значит у всех символов индекс будет = 1

            //if(c.equals("a"))
            // alfa[0]++
        }
        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.substring(i,i+1)+" " );
            System.out.println(alfa[i]);// сколько букв "а" в строке
            // сколько букв "в" в строке ...

        }
    }
}





