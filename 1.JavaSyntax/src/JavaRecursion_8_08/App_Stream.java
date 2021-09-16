package JavaRecursion_8_08;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class App_Stream {
    public static void main(String[] args) {
        File file = new File("C:/Temp/2.txt");//Файл задается через объект File

        //Класс FileOutputStream предназначен для записи байтов в файл. Он является
        // производным от класса OutputStream, поэтому наследует всю его функциональность.
        FileOutputStream fos = null;
        String s = "создаем поток"; // строка для записи
        // Так как здесь записываем строку, то ее надо сначала перевести в массив байтов.
        // И с помощью метода write строка записывается в файл.
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);// перевод строки в байты
        //Для автоматического закрытия файла и освобождения ресурса объект FileOutputStream
        // создается с помощью конструктции try...catch.
        try {
            fos = new FileOutputStream(file);
            fos.write(bytes);//строка записывается в файл
        } catch (FileNotFoundException e) {//файл не неайден
            //FileNotFoundException является разновидностью(порожден от) IOException(родитель),поэтому мы сначало
            // обрабатываем его,а потом уже IOException
            e.printStackTrace();
        } catch (IOException e) {//ошибка записи
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File file1 = new File("C:/Temp/1.txt");

        //Для считывания данных из файла предназначен класс FileInputStream, который является наследником
        // класса InputStream и поэтому реализует все его методы.
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file1);
            byte[] bytes1 = new byte[fis.available()]; // место хранение прочитанных данных с файла (file1)
            fis.read(bytes1);//fis-из потока,read-читаем,в переменную bytes1
            for(int i = 0; i < bytes1.length; i++){

                System.out.print((char)bytes1[i]);
            }
        } catch (FileNotFoundException e) {//файл не неайден
            e.printStackTrace();
        } catch (IOException e) {// ошибка чтения
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
//Классы FileInputStream и FileOutputStream предназначены прежде всего для записи двоичных файлов,
// то есть для записи и чтения байтов. И хотя они также могут использоваться для работы с текстовыми файлами,
// но все же для этой задачи больше подходят другие классы.


