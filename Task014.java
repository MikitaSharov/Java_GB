package Java_GB;

//Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task014 {
    public static void main(String[] args) {
        List list = new ArrayList<String>();
        list.add("1");
        list.add(1);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

    static void removeV2(List list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object item = iterator.next();
            if (item instanceof Integer){
                iterator.remove();
            }
        }
    }
}
