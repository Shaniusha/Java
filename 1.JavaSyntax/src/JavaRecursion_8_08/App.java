package JavaRecursion_8_08;

import java.io.File;

public class App {
    public static void main(String[] args) {
        File f = new File("C:/sqlite");//создали объект класса File с существующей уже папкой
       showfiles(f);


       if (f.isDirectory())
           System.out.println("это папка - yesss");
       else
           System.out.println("это не папка");
    }
    public static void showfiles (File file) {// метод выводит список файлов или папок
        String folder = file.getPath();//метод выводит имя папки// f это file
        String[] list = file.list();// возвращает список файлов и папок
        for (String s : list){
            String fullName = folder + "/" + s;//полное имя файла(диск,все папки,имя файла)
            File f = new File(fullName);
            if (f.isDirectory()) {
                System.out.println("это папка " + fullName);
                showfiles(f);//recursion, метод вызывает сам себя
            }
            else
                System.out.println(s);//вывели список файлов и папок в папке переданной в параметре (file)
        }
    }
    private static boolean isDirectory(String s){
        if (s.contains("."))
            return false;
        else
            return true;
    }
}
