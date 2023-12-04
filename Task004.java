package Java_GB;

//        Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;

public class Task004 {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 2, 2, 3, 4};
        int val = 3;
        int[] result = new int[nums.length];
        int i = result.length - 1;
        int j = 0;
        for (int item: nums) {
            if (item == val) {
                result[i--] = val;
            } else {
                result[j++] = item;
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
