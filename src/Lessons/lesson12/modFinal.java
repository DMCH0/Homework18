package Lessons.lesson12;

public class modFinal {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        String c = "5";
        int x = ++b + a++;
        b +=x;
        System.out.println(b + "" + c);
    }
}
