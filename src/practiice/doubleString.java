package practiice;
import java.util.Scanner;

public class doubleString {

//Дублирование строки
//Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.

    public static void main(String[] args) {

        doubleString();
    }
    public static void doubleString (){
        System.out.print("Введите вашу строку: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        for (int i = 0; i < 3; i++){
            System.out.println(line);
        }
    }
}
