package Homeworks.Lesson5;
public class Homework5_1 {

    public static void main(String[] args) {

        int mathProcessor = 10;
        int mathProcessor1 = 15;
        System.out.println(myDifference(mathProcessor,mathProcessor1));

    }

    static int myDifference(int amount1, int amount2){

      if (amount1 > amount2){
          return amount1;
      }else return amount2;
    }


    static int recalculation(int example, int example2){

        if (example < example2) {
            return example2;
        }else  return (int) example2;

    }
}

