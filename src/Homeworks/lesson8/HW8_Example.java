package Homeworks.lesson8;
import java.util.Arrays;
import java.util.Random;


public class HW8_Example {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) + 10;
        }
        System.out.println(Arrays.toString(arr));

        if (arr.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            double average = sum / arr.length;
            System.out.println(average);
        }
    }
}


