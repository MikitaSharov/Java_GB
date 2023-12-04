package Java_GB.Java_GB.HW;

public class Laptops {
    String model;
    int ram;
    int ssd;
    String os;
    String color;

    @Override
    public String toString() {
        return '{' +
                "model=" + model +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", os=" + os +
                ", color=" + color +
                '}';
    }
}
