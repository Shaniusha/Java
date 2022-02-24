package debag_24_02_22;

public class Main {
    public static void main(String[] args){
        example();
    }
    private static void example(){//написать строку наоборот
        String source = "The quick brown fox jump over the lazy dog";//Быстрая коричневая лиса перепрыгивает
        // через ленивую собаку
        StringBuilder reversed = new StringBuilder();
        for (int i = source.length() - 1; i > 0; i--) {//должно быть i>=0 иначе нет в конце последней "T"
            reversed.append(source.charAt(i));
        }
        System.out.println(reversed);
    }
}
//точка остановы c условием: напротив строки   reversed.append(source.charAt(i));
//ставим точку останова,нажимаем на ней правую клавишу и задаем условие(пишем в окошке i==0)
//это означает что breakPoint(точка остановы) сработает,программа остановится,только если это выражение(i==0)
//будет равно true , нажимаем Done и на breakPoint появляется ?
//это означает что breakPoint с условием