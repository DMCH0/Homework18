package Lessons.lesson8;

public class PolimorfizmOverload {
    public static void main(String[] args) {
        int a = 100;
        double b = 1.1;
        String c = "Dima";

        add(a, a);
        add("Max", 90);
        add();
    }

    public static void add() {
        System.out.println("Hello");
    }
    public static void add(int a, int b) {
        int c = a / b;
        System.out.println(c);
    }
    public static void add(int num, int num1, int num3){
        int e = num + num1 + num3;
    }
    public static void add(String a, int b){
        System.out.println(a + " " + b);
    }
}
