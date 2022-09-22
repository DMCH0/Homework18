package practiice;
import java.util.Scanner;

public class textToTerminal {
//Вывод текста на экран
//Написать функцию, которая выводит переданную строку (слово) на экран три раза,
// но в одной строке. Слова должны быть разделены пробелом и не должны сливаться в одно.
    public static void main(String[] args) {

        doubleString();

    }
    public static void doubleString (){
        System.out.print("Введите вашу строку: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        for (int i = 0; i < 3; i++){
            System.out.print(line + " ");
        }
    }
}
