package Java_GB.Java_GB.HW.ToyLottery;

public class Toy {
    int id;
    int chance;
    String name;

    public void put (String stringToy) {
        String[] arrayToy = stringToy.split(" ");

        if (arrayToy.length == 3) {
            this.id = Integer.parseInt(arrayToy[0].trim());
            this.chance = Integer.parseInt(arrayToy[1].trim());
            this.name = arrayToy[2].trim();
        }
        else System.out.println("вводить надо через пробел например: 1 20 кукла");
    }

    public int getId() {
        return id;
    }

    public int getChance() {
        return chance;
    }

}
