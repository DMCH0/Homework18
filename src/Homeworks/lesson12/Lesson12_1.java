package Homeworks.lesson12;
import java.util.Arrays;

public class Lesson12_1 {
    public static void main(String[] args) {

        int[] arrayEven = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < arrayEven.length; i++){
            if (i % 2 == 1){
                arrayEven[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arrayEven));
    }
}

