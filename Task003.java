package Java_GB;

//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

public class Task003 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxCount;

        for (int item: array) {
            if (item == 1) count++;
            else {
                maxCount = count;
                count = 0;
            }
        }
        maxCount = count;
        System.out.println(maxCount);
    }
}
