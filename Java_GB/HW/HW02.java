package Java_GB.Java_GB.HW;

// Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
// Напишите свой код в методе printPrimeNums класса Answer.

public class HW02 {
    public static void main(String[] args) {
        printPrimeNums();
    }

    static void printPrimeNums(){
        // Напишите свое решение ниже
        boolean count = true;
        for (int i = 2; i < 1000; i++){
            for (int j = 2; j < i / 2 + 1; j++){
                if (i % j == 0){
                    count = false;
                    break;
                }
            }
            if (count){
                System.out.println(i);
            }
            count = true;
        }
    }
}
