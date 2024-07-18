package Streams_09.streamsquestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int eid;
    String ename;
    float esal;

    public Employee(int eid, String ename, float esal) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public float getEsal() {
        return esal;
    }

    public void setEsal(float esal) {
        this.esal = esal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", esal=" + esal +
                '}';
    }
}

public class App03_SortListOfObjects {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(104, "shubham", 100000),
                new Employee(101, "pankaj", 200000),
                new Employee(102, "rekha", 300000));

        // sort employees in ascending order based on id
        // way - 1
        // List<Employee> list1 = list.stream().sorted((Employee e1, Employee e2) -> e1.getEid() - e2.getEid()).collect(Collectors.toList());
        // list1.forEach(System.out::println);

        // way - 2
        // List<Employee> list2 = list.stream().sorted(Comparator.comparing(Employee::getEid)).collect(Collectors.toList());
        // list2.forEach(System.out::println);

        // sort employees in descending order based on id
        // way - 1
        // List<Employee> collect = list.stream().sorted((Employee e1, Employee e2) -> e2.getEid() - e1.getEid()).collect(Collectors.toList());
        // collect.forEach(System.out::println);

        // way - 2
        // List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getEid).reversed()).collect(Collectors.toList());
        // collect.forEach(System.out::println);

        // sort employees in ascending order based on name
        // way - 1
        // List<Employee> collect = list.stream().sorted((e1, e2) -> e1.getEname().compareTo(e2.getEname())).collect(Collectors.toList());
        // collect.forEach(System.out::println);

        // way - 2
        // List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getEname)).collect(Collectors.toList());
        // collect.forEach(System.out::println);

        // sort employees in descending order based on name
        // way - 1
        // List<Employee> collect = list.stream().sorted((e1, e2) -> e2.getEname().compareTo(e1.getEname())).collect(Collectors.toList());
        // collect.forEach(System.out::println);

        // way - 2
        // List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getEname).reversed()).collect(Collectors.toList());
        // collect.forEach(System.out::println);


    }
}
