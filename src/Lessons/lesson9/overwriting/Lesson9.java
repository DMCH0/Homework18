package Lessons.lesson9.overwriting;

public class Lesson9 {
    public static void main(String[] args) {

        int[] array = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int buffer;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < array.length -1 ; i++){
                if(array[i] > array[i + 1]){
                    isSorted = false;

                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }
        }

        for (int arr : array){
            System.out.print(arr + " ");
        }
    }
}
