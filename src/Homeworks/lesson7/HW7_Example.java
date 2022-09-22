package Homeworks.lesson7;

public class HW7_Example {
    public static void main(String[] args) {

        helloWorld();
    }
    private static void helloWorld() {
        for (int i = 1; i <=100 ; i++) {
            if ((i%5!=0)&&(i%3!=0)){
                System.out.print(i);
            }
            else {
                if (i % 5 == 0) {
                    System.out.print(" Hello ");
                }
                if (i % 3 == 0) {
                    System.out.print(" World ");
                }
            }
        }
    }
}

