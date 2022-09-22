package Homeworks.lesson11;
import java.util.Scanner;

public class Homework_11 {

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int calcResult = calc(num1, num2, operation);
        System.out.println("Результат: " + calcResult);
    }
    static Scanner scanner = new Scanner(System.in);

    public static int getInt(){
        System.out.print("Введите целое число: ");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            scanner.next();
            num = getInt();
        }
        return num;
    }
    public static char getOperation(){
        System.out.print("Введите операцию (+, -, * или /): ");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int calcResult;
        switch (operation){
            case '+':
                calcResult = num1 + num2;
                break;
            case '-':
                calcResult = num1 - num2;
                break;
            case '*':
                calcResult = num1 * num2;
                break;
            case '/':
                calcResult = num1 / num2;
                break;
            default:
                calcResult = calc(num1, num2, getOperation());
        }
        return calcResult;
    }

}

