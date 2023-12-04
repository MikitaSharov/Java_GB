package Java_GB.Java_GB.HW;

/* 2023-11-20 20:29 [4, 8, 3, 1, 9]
2023-11-20 20:29 [4, 3, 1, 8, 9]
2023-11-20 20:29 [3, 1, 4, 8, 9]
2023-11-20 20:29 [1, 3, 4, 8, 9]
2023-11-20 20:29 [1, 3, 4, 8, 9] */



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
        initializeLogFile();

        try {
            boolean swapped;
            for (int i = 0; i < mas.length - 1; i++) {
                swapped = false;
                for (int j = 0; j < mas.length - i - 1; j++) {
                    if (mas[j] > mas[j + 1]) {
                        // Обмен элементов
                        int temp = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = temp;

                        swapped = true;
                    }
                }

                if (!swapped) {
                    break;
                }
                // Запись в лог-файл
                writeLog(mas);
            }
             // Запись в лог-файл
            writeLog(mas);
        } finally {
            closeLogFile();
        }
    }

    private static void initializeLogFile() {
        try {
            log = new File("log.txt");
            fileWriter = new FileWriter(log);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeLog(int[] mas) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String formattedDate = dateFormat.format(new Date());

            fileWriter.write(formattedDate + " " + Arrays.toString(mas) + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void closeLogFile() {
        try {
            if (fileWriter != null) {
                fileWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Printer {
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметрыss
            arr = new int[] { 9, 4, 8, 3, 1 };
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        new BubbleSort();
        BubbleSort.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
