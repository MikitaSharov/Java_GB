package Java_GB;

//Напишите метод, который сжимает строку
//Пример: вход aaaabbbcdd.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task009 {
    public static void main(String[] args) {
        String string = "aaaabbbcdda";
        System.out.println(zipString(string));
    }

    private static String zipString (String string) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(i - 1)){
                count++;
            }
            else {
                result.append(string.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        result.append(string.charAt(string.length() - 1)).append(count);
        return result.toString();
    }
}
