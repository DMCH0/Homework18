package Lessons.Lesson5;

public class Lessson5 {

    public static void main(String[] args) {

        int[][] twoDimArray = new int[3][4];
        twoDimArray[0][0] = 5;
        twoDimArray[0][1] = 4;
        twoDimArray[0][2] = 4;
        twoDimArray[0][3] = 4;
        System.out.println(twoDimArray[0][1]);


        int[][] twoDimArray2 = {{2, 5, 7}, {7, 4, 2, 3}, {2, 3, 4, 7}};
        for (int i = 0; i < twoDimArray2.length; i++) {
            for (int j = 0; j < twoDimArray2[i].length; j++);
            }
            System.out.println();

    }
}