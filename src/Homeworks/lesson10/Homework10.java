package Homeworks.lesson10;

public class Homework10 {
    public static void main(String[] args) {
// Сортировка пузырьком
    int[] array = {11, 3, 14, 16, 7};

    boolean isSorted = false;
    int buffer;
        while (!isSorted){
        isSorted = true;
        for (int i = 0; i < array.length - 1 ; i++){
            if(array[i] < array[i + 1]){  // Замена знака меняет работу цикла  if(array[i] > array[i + 1]){ вывод от меньшего к большему
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

