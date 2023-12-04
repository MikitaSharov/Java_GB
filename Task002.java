package Java_GB;

// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.time.LocalTime;
import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        String hi;

        if (hour >= 5 && hour < 12) hi = "Доброе утро";
        else if (hour >= 12 && hour < 18) hi = "Добрый день";
        else if (hour >= 18 && hour < 23) hi = "Добрый вечер";
        else hi = "Доброй ночи";
        System.out.println(hi + ", " + name);
    }
}
