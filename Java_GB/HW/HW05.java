package Java_GB.Java_GB.HW;

/*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
        Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
        int[] arr - числовой массив
        После каждой итерации, ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты {массив на данной итерации}.
        Пример
        arr = new int[]{9, 4, 8, 3, 1};
        sort(arr)
// При чтении лог-файла получим:
        2023-05-19 07:53 [4, 8, 3, 1, 9]
        2023-05-19 07:53 [4, 3, 1, 8, 9]
        2023-05-19 07:53 [3, 1, 4, 8, 9]
        2023-05-19 07:53 [1, 3, 4, 8, 9]
        2023-05-19 07:53 [1, 3, 4, 8, 9]*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HW05 {
    private static File log;
    private static FileWriter fileWriter;
    private static String logPath = "src/Java_GB/Java_GB/HW/log.txt";

    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 8, 3, 1};
        sort(arr);
    }

    static void sort(int[] array) {
        initLog(logPath);

        try {
            boolean swapped;
            for (int i = 0; i < array.length - 1; i++) {
                swapped = false;
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;

                        swapped = true;
                    }
                }
                if (!swapped) break;
                writeLog(array);
            }
            writeLog(array);
        }
        finally {
            closeLog();
        }
    }

    private static void initLog(String logPath) {
        try {
            log = new File(logPath);
            fileWriter = new FileWriter(log);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void closeLog() {
        try {
            if (fileWriter != null) fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeLog(int[] array) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String formattedDate = dateFormat.format(new Date());
            fileWriter.write(formattedDate + " " + Arrays.toString(array) + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
