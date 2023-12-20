package Java_GB.Java_GB.HW.ToyLottery;

import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Random;

public class Get {
    PriorityQueue<Toy> priorityQueue;

    public Get(PriorityQueue<Toy> priorityQueue) {
        this.priorityQueue = priorityQueue;
        winnerWrite();
    }

    private void winnerWrite() {
        try (FileWriter writer = new FileWriter("result.txt", true)) {
            Random random = new Random();
            int randomValue = random.nextInt(100) + 1;
//            System.out.println(randomValue);

            if (randomValue <= 20) {
                Toy loser = priorityQueue.poll();
                Toy winner = priorityQueue.peek();
                writer.write(String.valueOf(winner.getId()));
                priorityQueue.add(loser);
            }
            else if (randomValue <= 40) {
                Toy loser = priorityQueue.poll();
                Toy secondLoser = priorityQueue.poll();
                Toy winner = priorityQueue.peek();
                writer.write(String.valueOf(winner.getId()));
                priorityQueue.add(loser);
                priorityQueue.add(secondLoser);
            }
            else {
                Toy winner = priorityQueue.peek();
                writer.write(String.valueOf(winner.getId()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
