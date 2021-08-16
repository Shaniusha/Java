package Streams_15_08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args)  {
        File file = new File("C:/Temp/1.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);//создали исходящий поток в виде файла на диске,в file
            //будут попадать данные
            fos.write(68);//D = 68 /записывает 1 байт (число 68) в файловый поток(в файл)
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
