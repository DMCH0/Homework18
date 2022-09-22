package Lessons.lesson9.inkapsulation.car;
import Lessons.lesson9.inkapsulation.specification.Specific;



public class BMW extends Specific {
    public static void main(String[] args) {

        Specific specific = new Specific();
        System.out.println(specific.fuel);


        specific.fuel = "Diesel";
        System.out.println(specific.fuel);
    }
}
