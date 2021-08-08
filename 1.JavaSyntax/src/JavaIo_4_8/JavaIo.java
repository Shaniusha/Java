package JavaIo_4_8;

import java.io.File;
import java.io.IOException;

public class JavaIo {
    public static void main(String[] args) {
        File file = new File("c:/SQLite/chinook.db");//указываем полное имя файла с папкой
        if (file.exists())// проверяет, существует ли по указанному в конструкторе пути файл или каталог.
            // И если файл или каталог существует, то возвращает true, иначе возвращает false
            System.out.println("фаил существует");//true
        else
            System.out.println("фаил не существует");

        File file1 = new File("c:/sqlite/chinook1.db");
        if (file1.exists())
            System.out.println("фаил существует");
        else
            System.out.println("фаил не существует");//false

        System.out.println(file.getName() + " - возвращает краткое имя файла");
        System.out.println(file.getAbsolutePath() + " - возвращает имя файла");
        System.out.println(file.getParent() + " - возвращает имя родительской папки");
        System.out.println(file.length() + " - возвращает размер файла в байтах");
        System.out.println(file.isFile() + " - возвращает значение true,если по указанному пути находится файл " +
                "а не папка");
        System.out.println(file.isHidden() + " - возвращает значение true, если каталог или файл являются скрытыми");
        System.out.println(file.lastModified() + " - возвращает время последнего изменения файла или каталога." +
                " Значение представляет количество миллисекунд, прошедших с начала эпохи Unix");

        if(file.canRead())
            System.out.println("Файл можно прочитать");
        else
            System.out.println("Файл не читается");

        if(file.canWrite())
            System.out.println("Файл можно записать");
        else
            System.out.println("Файл не может быть записан");


        File folder = new File("c:/SQLite");// указываем имя папки
        String[] list = folder.list();// метод возвращает массив файлов,которые находятся в этой папке
        for (String s : list)
            System.out.println(s + " - возвращает массив файлов,которые находятся в папке SQLite");


        File newFile = new File("C://SomeDir//MyFile");
        try
        {
            boolean created = newFile.createNewFile();// создает новый файл по пути,
            // который передан в конструктор. В случае удачного создания возвращает true, иначе false
            if(created)
                System.out.println("Файл создан");
        }
        catch(IOException ex) {

            System.out.println( "Исключение - " + ex.getMessage());//Возвращает строку подробных сообщений

            ex.printStackTrace(System.out);//чтобы могли видеть,где в коде произошло исключение
        }
    }
}
