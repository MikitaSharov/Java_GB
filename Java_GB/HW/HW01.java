package Java_GB.Java_GB.HW;

//Вычислить n-ое треугольного число(сумма чисел от 1 до n).
//Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
//Пример n = 4 -> 10 n = 5 -> 15

public class HW01 {
    public static void main(String[] args) {
        System.out.println(countNTriangle(4));
    }

    private static int countNTriangle(int n){
        int res = 0;
        while (n > 0){
            res += n;
            n--;
        }
        return res;
    }
}
