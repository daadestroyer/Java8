package StaticMethods_03;

/*
1. The interface static methods are similar to static methods of class

2. overriding of interface staic method is not allowed

3. child classes can use interface static method just by using interface reference name only
*/
interface Interf {
    static void m1() {
        System.out.println("Interface Static method");
    }

    default void m2() {
        System.out.println("Interface Default Method");
    }
}

public class App01_StaticMethodsDemo implements Interf {
    public static void main(String[] args) {
        Interf.m1(); // we can call interface static method by interface name only
    }
}
