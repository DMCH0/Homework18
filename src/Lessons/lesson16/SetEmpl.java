package Lessons.lesson16;

import java.util.HashSet;

public class SetEmpl {
    public static void main(String[] args) {
        HashSet<Integer> myHash = new HashSet<>();

        myHash.add(1);
        myHash.add(2);
        myHash.add(3);

        System.out.println("Before remove");
        for (Integer i : myHash){
            System.out.print(i +" ");
        }
        myHash.remove(1);
        System.out.println();
        System.out.println("After remove");
        for (Integer i : myHash){

            System.out.print(i + " ");
        }

    }
}
