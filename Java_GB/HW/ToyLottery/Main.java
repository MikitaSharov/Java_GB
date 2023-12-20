package Java_GB.Java_GB.HW.ToyLottery;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.put("1 20 конструктор");

        Toy toy2 = new Toy();
        toy2.put("2 20 робот");

        Toy toy3 = new Toy();
        toy3.put("3 60 кукла");

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a1, a2) -> Integer.compare(a2[1], a1[1]));

        priorityQueue.add(toy1.toArray());
        priorityQueue.add(toy2.toArray());
        priorityQueue.add(toy3.toArray());


        int qtyDraws = 10;

        for (int i = 0; i < qtyDraws; i++) {
            new Get(priorityQueue);
        }



    }
}
