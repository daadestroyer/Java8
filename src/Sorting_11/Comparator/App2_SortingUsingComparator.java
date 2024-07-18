package Sorting_11.Comparator;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Laptop   { // implements Comparator<Laptop>{
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

//    @Override
//    public int compare(Laptop o1, Laptop o2) {
//        return 0;
//    }
}

public class App2_SortingUsingComparator {
    public static void main(String[] args) {
        List<Laptop> list = Arrays.asList(new Laptop("Acer", 10000, 4), new Laptop("Apple", 20000, 16), new Laptop("Lenovo", 13000, 6));

//        Collections.sort(list, new Comparator<Laptop>() {
//            public int compare(Laptop l1, Laptop l2) {
//                return l1.ram > l2.ram ? 1 : -1;
//            }
//        });

        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(1);
        lst.add(20);
        lst.add(2);

          // way - 1 (sorting in descending order)
        Collections.sort(lst,(i1,i2)->i2.compareTo(i1));
        List<Integer> lst1 = lst.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(lst1);

        // way - 2 (sorting in ascending order)
        Collections.sort(lst);
//        System.out.println(lst);

//        for (Laptop laptop : list) {
//            System.out.println(laptop.getName());
//            System.out.println(laptop.getPrice());
//            System.out.println(laptop.getRam());
//            System.out.println();
//        }
    }
}
