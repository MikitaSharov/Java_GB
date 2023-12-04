package Java_GB;

//Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
//        Пример 1: а = 3, b = 2, ответ: 9
//        Пример 2: а = 2, b = -2, ответ: 0.25
//        Пример 3: а = 3, b = 0, ответ: 1

public class Task007 {
    public static void main(String[] args) {
        System.out.println(exponent(2, -2));
    }

    public static double exponent(double a, int b) {
        if (b == 0) return 1;
        if (b < 0) {
            a = 1.0 / a;
            b = -b;
        }
        double result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
