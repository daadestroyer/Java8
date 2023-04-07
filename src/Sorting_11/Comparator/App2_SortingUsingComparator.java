package Sorting_11.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Laptop {
    String name;
    int price;
    int ram;

    public Laptop(String name, int price, int ram) {
        this.name = name;
        this.price = price;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}

public class App2_SortingUsingComparator {
    public static void main(String[] args) {
        List<Laptop> list = Arrays.asList(new Laptop("Acer", 10000, 4), new Laptop("Apple", 20000, 16), new Laptop("Lenovo", 13000, 6));

        Collections.sort(list, new Comparator<Laptop>() {
            public int compare(Laptop l1, Laptop l2) {
                return l1.ram > l2.ram ? 1 : -1;
            }
        });

        for (Laptop laptop : list) {
            System.out.println(laptop.getName());
            System.out.println(laptop.getPrice());
            System.out.println(laptop.getRam());
            System.out.println();
        }
    }
}
