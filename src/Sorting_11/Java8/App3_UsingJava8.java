package Sorting_11.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }
}

public class App3_UsingJava8 {
    public static void main(String[] args) {
        List<Laptop> list = Arrays.asList(new Laptop("Acer", 10000, 14), new Laptop("Dell", 20000, 16), new Laptop("Lenovo", 13000, 6));

        // sorting name in descending order
        List<Laptop> collect = list.stream().sorted((Laptop l1, Laptop l2) -> l2.getName().compareTo(l1.getName())).collect(Collectors.toList());
        System.out.println(collect);
        List<Laptop> lst = list.stream().sorted(Comparator.comparing(Laptop::getRam).thenComparing(Laptop::getName)).collect(Collectors.toList());


        for (Laptop laptop : lst) {
            System.out.println(laptop.getName());
            System.out.println(laptop.getPrice());
            System.out.println(laptop.getRam());
            System.out.println();
        }
    }
}
