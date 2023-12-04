package Java_GB;

//        Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
//        Если общего префикса нет, вернуть пустую строку ""

public class Task005 {
    public static void main(String[] args) {
        String[] strings = new String[] {"apple", "appetizer", "application", "app"};
        System.out.println(longestCommonPrefix(strings));

    }

    // проверяем все ли строки в нашем массиве с общим началом
    public static String longestCommonPrefix(String[] array) {
        String prefix = array[0];
        String longestString = array[0];
        for (int i = 1; i < array.length ; i++) {
            // indexOf возвращаеи индекс первого вхождения слова в строку в массиве строк, если слово не входит в строку то -1
            // в нашем случае слово должно быть префиксом т.е. в начале строки != 0 и как только это произойдет мы выйдем из while
            while (array[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); // а пока уменьшаем наш префикс
                if (prefix.isEmpty()) {
                    return "нет общего префикса"; // если так не случилось и префикс стал пустым возвращаем пустую строку
                }
            }
            if (array[i].length() > longestString.length()) {
                longestString = array[i];
            }
        }
        return longestString;
    }
}


