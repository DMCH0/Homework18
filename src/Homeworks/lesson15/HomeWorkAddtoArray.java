package Homeworks.lesson15;
import java.util.ArrayList;

public class HomeWorkAddtoArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        extendedArr(a, 7);
        System.out.println(a);
    }
    public static ArrayList<Integer> extendedArr(int [] extendedArray, int number) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(0);
        a.remove(a.size() -1);
        return a;
    }
}


