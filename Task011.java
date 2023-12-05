package Java_GB;

//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в
//простой текстовый файл, обработайте исключения.

import java.io.File;
import java.io.FileWriter;

public class Task011 {
    public static void main(String[] args) {
        repeatWord("TEST", 10);
    }

    private static void repeatWord(String word, int count){
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < count; i++) {
            repeated.append(word);
        }
        writeToFile(repeated);
    }

    private static void writeToFile(StringBuilder repeated){
        File file = new File("src/Java_GB/test.txt");
        try (FileWriter writer = new FileWriter(file)){
            writer.write(repeated.toString());
        } catch (Exception e) {
            e.fillInStackTrace();
        }

    }
}
