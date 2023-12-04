package Java_GB;

// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

public class Task006 {
    public static void main(String[] args) {
        String string = "Добро пожаловать на курс по Java";
        String[] words = string.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        System.out.println(reversed.toString().trim());
    }
}
