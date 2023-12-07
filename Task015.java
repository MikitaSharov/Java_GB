package Java_GB;

//Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
//        что на 0-й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
//        Напишите метод для заполнения данной структуры.

import java.util.ArrayList;
import java.util.List;

public class Task015 {
    static List<ArrayList<String>> shopBook = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<String> proza = new ArrayList<>();
        proza.add(0, "проза");
        proza.add("Буратино");

        ArrayList<String> poezia = new ArrayList<>();
        poezia.add(0, "поэзия");
        poezia.add("Онегин");
        poezia.add("Стих");

        addBooks(proza);
        addBooks(poezia);

        System.out.println(shopBook);
    }

    static void addBooks(ArrayList<String> books){
        shopBook.add(books);
    }

    static void addBookV2(List<List<String>> shopBook, String genre, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            List<String> bookshelf = shopBook.get(i);
            if (bookshelf.get(0).equals(genre)){
                bookshelf.add(nameBook);
                return;
            }
        }
        List<String> bookshelf = new ArrayList<>();
        bookshelf.add(genre);
        bookshelf.add(nameBook);
        shopBook.add(bookshelf);
    }
}
