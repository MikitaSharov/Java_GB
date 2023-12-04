package Java_GB;

//    Написать программу, которая запросит пользователя ввести <Имя> в консоли.
//    Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

import java.util.Scanner;

public class Task001 {

    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Привет, " + name);
    }
}
