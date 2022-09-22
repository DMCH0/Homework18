package Homeworks.lesson6;

    public class Homework6_1 {
        public static void main(String[] args) {

            for (int i = 0; i < 5 ; i++) {
                for (int j = 0; j < 5; j++) {
                    if (j < 5 - (1 + i)) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*" + " ");
                    }
                }
                System.out.println();
            }
        }
    }
//    Вывод пирамиды из звездочек ( Вывод как указанно ниже)
//   как решить.  Первый цикл for отвечает за символы. второй  вложенный for за пробелы.
//    *
//   * *
//  * * *
// * * * *
//* * * * *