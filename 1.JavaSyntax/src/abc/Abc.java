package abc;

public class Abc {
    public static void main(String[] args) {
        int[]alfa = new int [26]; //здесь нули
        for(int i = 0; i < 26; i++){
            alfa [i] = 0; //каждому эл-ту присваиваем ноль  /26 нули

        }
        String s = "Create a method take that accepts a list/array and a number nz";

        for (int i = 0; i < s.length(); i++) {
            // цикл начинается с буквы "С" и до "z"

            String c = s.substring(i, i + 1); // метод Извлекает символы из строки,
            // начиная с указанной начальной позиции и до указанного количества символов.

            System.out.println(c);  // распечатать символы по одному(буквы)

            c = c.toLowerCase(); //   метод (без учета регистра)  Л = л  В = в

            if(c.equals("a"))
                alfa[0]++;
            else if (c.equals("b"))
                alfa[1]++;
            else if (c.equals("c"))
                alfa[2]++;
            else if (c.equals("d"))
                alfa[3]++;
            else if (c.equals("e"))  //находит "е"
                alfa[4]++; //кладет в 4 ячейку  и возвращается снова в for 14 str
            else if (c.equals("f"))
                alfa[5]++;
            else if (c.equals("g"))
                alfa[6]++;
            else if (c.equals("h"))
                alfa[7]++;
            else if (c.equals("i"))
                alfa[8]++;
            else if (c.equals("j"))
                alfa[9]++;
            else if (c.equals("k"))
                alfa[10]++;
            else if (c.equals("l"))
                alfa[11]++;
            else if (c.equals("m"))
                alfa[12]++;
            else if (c.equals("n"))
                alfa[13]++;
            else if (c.equals("o"))
                alfa[14]++;
            else if (c.equals("p"))
                alfa[15]++;
            else if (c.equals("q"))
                alfa[16]++;
            else if (c.equals("r"))
                alfa[17]++;
            else if (c.equals("s"))
                alfa[18]++;
            else if (c.equals("t"))
                alfa[19]++;
            else if (c.equals("u"))
                alfa[20]++;
            else if (c.equals("v"))
                alfa[21]++;
            else if (c.equals("w"))
                alfa[22]++;
            else if (c.equals("x"))
                alfa[23]++;
            else if (c.equals("y"))
                alfa[24]++;
            else if (c.equals("z"))
                alfa[25]++;



        }
        for(int i = 0; i < 26; i++){
            System.out.println(alfa[i]);// сколько букв "а" в строке
            // сколько букв "в" в строке ...
        }
    }
}


