package Java_GB.Java_GB.HW;

//Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /) над двумя числами и возвращать результат.
//В классе должен быть метод calculate, который принимает оператор и значения аргументов и возвращает результат вычислений.
//При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".
//Аргументы, передаваемые в метод/функцию: '3' '+' '7'
//На выходе: 10

public class HW03 {
    public static void main(String[] args) {
        System.out.println(calculate('-', 3, 5));
    }

    private static int calculate(char op, int a, int b) {
        // Введите свое решение ниже
        int result = 0;
        if (op == '+'){
            result = a + b;
        } else if (op == '-'){
            result = a - b;
        } else if (op == '*'){
            result = a * b;
        } else if (op == '/' && b != 0){
            result = a / b;
        } else{
            System.out.println("Некорректный оператор: " + op);
        }
        return result;
    }
}
