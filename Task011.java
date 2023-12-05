package Java_GB;

//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в
//простой текстовый файл, обработайте исключения.

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Task011 {
    public static void main(String[] args) {
        String path = "src/Java_GB/test.txt";
        repeatWord("TEST", 10, path);
        readFile(path);
    }

    private static void repeatWord(String word, int count, String path){
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < count; i++) {
            repeated.append(word);
        }
        writeToFile(repeated, path);
    }

    private static void writeToFile(StringBuilder repeated, String path){
        try (FileWriter writer = new FileWriter(path)){
            writer.write(repeated.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readFile(String path) {
        File file = new File(path);
        StringBuilder readed = new StringBuilder();
        try (Scanner scanner = new Scanner(file)){
            readed.append(scanner.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(readed.toString());
    }
}
