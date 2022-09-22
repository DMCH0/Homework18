package Homeworks.lesson8;

public class HW8_1 {
    public static void main(String[] args) {

        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * (20 - 10)) + 10;
        }
//            System.out.print(array1[i] + " ");
//        }
//        System.out.println();

            if (array1.length > 0) {
                double sum = 0;
                for (int j = 0; j < array1.length; j++) {
                    sum += array1[j];
                }
                double average = sum / array1.length;
                System.out.println(average);
            }
        }
    }

