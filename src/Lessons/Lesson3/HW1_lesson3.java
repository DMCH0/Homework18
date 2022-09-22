package Lessons.Lesson3;
import java.util.Scanner;

public class HW1_lesson3 {
    public static void main(String[] args) {

        System.out.print("Введите число 1: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1){
            System.out.println("Вы ввели число: " + number);
        }else {
            System.out.println("Вы ввели число не равное 1");
        }

    }

}
