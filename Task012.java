package Java_GB;

/*Напишите метод, который вернет содержимое текущей папки в виде массива строк.
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task012 {
    public static void main(String[] args) {
        String path = ".";
        String pathForFile = "src/Java_GB/filesInDir.txt";
        writeInFile(getFilesFromFolder(path), pathForFile);
    }

    private static String[] getFilesFromFolder(String path){
        File dir = new File(path);

        // Получаем список файлов в текущей директории
        File[] files = dir.listFiles();
        // Проверяем, не является ли текущий объект директорией
        if (files != null) {
            String[] fileNames = new String[files.length];
            for (int i = 0; i < files.length; i++) {
                fileNames[i] = files[i].getName();
            }
            return fileNames;
        } else return new String[0];
    }

    private static void writeInFile(String[] filesNames, String path){
        try (FileWriter writer = new FileWriter(path)){
            for (String file: filesNames) {
                writer.write(file + "\n");
            }
            log("INFO", "файл записан");
        } catch (IOException e) {
            log("WARNING", "файл не записан\n" + e);
            e.printStackTrace();
        }
    }

    private static void log(String lvl, String msg){
        Logger logger = Logger.getAnonymousLogger();
        FileHandler handler = null;
        try {
            handler = new FileHandler("src/Java_GB/log.txt", true);
            handler.setFormatter(new SimpleFormatter());
            logger.addHandler(handler);
            logger.log(Level.parse(lvl), msg);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (handler != null){
                handler.close();
            }
        }

    }
}
