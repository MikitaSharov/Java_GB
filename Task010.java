package Java_GB;

//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

public class Task010 {
    public static void main(String[] args) {
        String string = "А роза упала на лапу Азора";
        System.out.println(isPalindrome(string));
    }

    private static boolean isPalindrome(String string){
        string = string.toLowerCase().replace(" ", "");
        StringBuilder stringBuilder = new StringBuilder(string);
        return string.equals(stringBuilder.reverse().toString());
    }
}
