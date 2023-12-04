package Java_GB;

//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1

public class Task008 {
    public static void main(String[] args) {
        System.out.println(charRepeat(8, 'a', 's'));
    }

    private static String charRepeat(int N, char c1, char c2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0){
                result.append(c1);
            }
            else result.append(c2);
        }
        return result.toString();
    }
}
