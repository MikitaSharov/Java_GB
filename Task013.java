package Java_GB;

//Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Task013 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int min = 1;
        int max = 3;
        for (int i = 0; i < 10 ; i++) {
            list.add(ThreadLocalRandom.current().nextInt(3, 6));
        }
        list.sort(null);
        list.sort(Collections.reverseOrder());
        System.out.println(list.toString());
    }
}
