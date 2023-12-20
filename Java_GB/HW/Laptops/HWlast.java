package Java_GB.Java_GB.HW.Laptops;

import java.util.*;

public class HWlast {
    public static void main(String[] args) {
        Laptops laptop1 = new Laptops();
        laptop1.model = "Lenovo";
        laptop1.color = "blue";
        laptop1.os = "Windows7";
        laptop1.ram = 2;
        laptop1.ssd = 128;

        Laptops laptop2 = new Laptops();
        laptop2.model = "HP";
        laptop2.color = "gray";
        laptop2.os = "Windows10";
        laptop2.ram = 4;
        laptop2.ssd = 512;

        Laptops laptop3 = new Laptops();
        laptop3.model = "MacBook";
        laptop3.color = "white";
        laptop3.os = "MacOS";
        laptop3.ram = 6;
        laptop3.ssd = 1024;

        Laptops laptop4 = new Laptops();
        laptop4.model = "Siemens";
        laptop4.color = "white";
        laptop4.os = "Windows10";
        laptop4.ram = 4;
        laptop4.ssd = 512;

        Set<Laptops> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);


        System.out.println(laptops);
        createFilter(laptops);
    }

    private static void createFilter(Set<Laptops> laptops){
        Map<String, Object> reference = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean search = true;

        while (search) {
            System.out.println("Введите цифру, соответствующую необходимому критерию: ");
            System.out.println("1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет\n5 - Поиск");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Введите объём RAM: ");
                    int ramFilter = scanner.nextInt();
                    reference.put("ram", ramFilter);
                    break;
                case 2:
                    System.out.println("Введите объём SSD: ");
                    int ssdFilter = scanner.nextInt();
                    reference.put("ssd", ssdFilter);
                    break;
                case 3:
                    System.out.println("Введите ОС: ");
                    String osFilter = scanner.next();
                    reference.put("os", osFilter);
                    break;
                case 4:
                    System.out.println("Введите цвет: ");
                    String colorFilter = scanner.next();
                    reference.put("color", colorFilter);
                    break;
                case 5:
                    printFiltered(laptops, reference);
                    search = false;
                    break;

                default:
                    System.out.println("Что-то не то ввели!");
                    return;
            }

        }
    }

    static void printFiltered(Set<Laptops> laptops, Map<String, Object> reference){
        for (Laptops laptop: laptops) {
            boolean matchesFilter = laptop.contains(reference);

            if (matchesFilter) System.out.println(laptop);
        }
    }

}
