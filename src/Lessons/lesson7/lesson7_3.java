package Lessons.lesson7;

public class lesson7_3 {
    public static void main(String[] args) {

        arrayMax();
    }

    public static void arrayMax() {
        int max = 0;
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
