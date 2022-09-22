//package Homeworks.lesson11;
//
//import java.util.Scanner;
//
//public class NetExample {
//    int value = getInt();
//    char mathOperation = getOperation();
//    int result = calc(value, mathOperation);
//        System.out.println("Результат вычислений " + result);
//}
//
//    public static int getInt() {
//        Scanner scannerA = new Scanner(System.in);
//        System.out.print("Введите первое число: ");
//        int num1 = scannerA.nextInt();
//        System.out.print("Введите второе число: ");
//        Scanner scannerB = new Scanner(System.in);
//        int num2 = scannerB.nextInt();
//        return (num1 + num2);
//    }
//    public static char getOperation(){
//        System.out.println("Введите операцию:");
//        char operation;
//        if(scanner.hasNext()){
//            operation = scanner.next().charAt(0);
//        } else {
//            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
//            scanner.next();
//            operation = getOperation();
//        }
//        return operation;
//    }
//    public static int calc(int num1, int num2, char getOperetion){
//        int result;
//        switch (operation){
//            case '+':
//                result = num1+num2;
//                break;
//            case '-':
//                result = num1-num2;
//                break;
//            case '*':
//                result = num1*num2;
//                break;
//            case '/':
//                result = num1/num2;
//                break;
//            default:
//                System.out.println("Операция не распознана. Повторите ввод.");
//                result = calc(num1, num2, getOperation());
//        }
//        return result;
//    }
//}
//}
