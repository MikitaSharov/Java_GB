package Java_GB.Java_GB.HW.ToyLottery;

import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Random;

public class Get {
    PriorityQueue<int[]> priorityQueue;

    public Get(PriorityQueue<int[]> priorityQueue) {
        try (FileWriter writer = new FileWriter("result.txt", true)) {
            this.priorityQueue = priorityQueue;
            Random random = new Random();
            int randomValue = random.nextInt(100) + 1;
            System.out.println(randomValue);
            if (randomValue <= 20) {
                int[] toy1 = priorityQueue.poll();
                int[] winner = priorityQueue.peek();
                writer.write(String.valueOf(winner[0]));
                priorityQueue.add(toy1);
            }
            else if (randomValue <= 40) {
                int[] toy1 = priorityQueue.poll();
                int[] toy2 = priorityQueue.poll();
                int[] winner = priorityQueue.peek();
                writer.write(String.valueOf(winner[0]));
                priorityQueue.add(toy1);
                priorityQueue.add(toy2);
            }
            else {
                int[] winner = priorityQueue.peek();
                writer.write(String.valueOf(winner[0]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
