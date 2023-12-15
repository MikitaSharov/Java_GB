package Java_GB.Java_GB.HW;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5, 1, 6, 2, 3, 4};
        System.out.println(Arrays.toString(mergeSort(array)));
    }

    private static int[] mergeSort(int[] array) {
        // базовый случай: если длинна массива равна 1 значит массив отсортирован
        if (array.length <= 1) {
            return array;
        }
        // середина массва
        int mid = array.length / 2;
        // создаем левый и правый подммассивы
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        // Рекурсивно сортируем левый и правый подмассивы
        left = mergeSort(left);
        right = mergeSort(right);

        // Объединяем отсортированные левый и правый подмассивы
        return merge(left, right);
    }

    // Метод для объединения двух отсортированных массивов
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        // Сравниваем элементы левого и правого массивов и объединяем их
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Обрабатываем оставшиеся элементы левого массива
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Обрабатываем оставшиеся элементы правого массива
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}
