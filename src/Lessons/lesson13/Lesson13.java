package Lessons.lesson13;

public class Lesson13 {
    public static void main(String[] args) {

        int a = 5;
        switch (a){
            case 1:
                a++;
            case 5:
                a++;
            default:
                a++;
        }

        System.out.println(++a);
        System.out.println(--a);
    }


}