package abc3;

public class Abc3 {
    public static void main(String args[]) {
        String hello = "Hello";

        int index1 = hello.indexOf('H');
        int index2 = hello.indexOf('o');
        int index3 = hello.indexOf('W');
        System.out.println("Мы ищем букву 'H' в строке " + hello + ". Индекс данной буквы " + index1);
        System.out.println("Мы ищем букву 'o' в строке " + hello + ". Индекс данной буквы " + index2);
        System.out.println("Мы ищем букву 'W' в строке " + hello + ". Индекс данной буквы " + index3);

        String hello1 = "Hello";

        int index11 = hello1.indexOf('H', 2);
        int index22 = hello1.indexOf('o', 2);
        int index33 = hello1.indexOf('W', 2);
        System.out.println("Мы ищем букву 'H' в строке " + hello1 + " начиная с индекса номер 2. Индекс " + index11);
        System.out.println("Мы ищем букву 'o' в строке " + hello1 + " начиная с индекса 2. Индекс " + index22);
        System.out.println("Мы ищем букву 'W' в строке " + hello1 + " начиная с индекса 2. Индекс " + index33);
    }
    //Комментарии к коду:
    //
    //У нас есть строка "Hello". С помощью метода indexOf мы искали индекс трех символов -
    // 'H', 'o' и 'W', но теперь начиная с символа под индексом 2.
    //
    //   - Символ 'H' стоит первым в строке. Но так как первые два символа в строке игнорируются,
    //       indexOf возвращает -1 ("символ не найден").
    //    - Символ 'o' стоит в конце строки. Он находится после второго символа,
    //       а значит функция его "видит". Как и в прошлом примере, получаем 4.
    //    - Символ 'W' не встречается в строке "Hello". Как и в прошлом примере, получаем (-1).
}

