//package Lessons.lesson7;
//
//import java.util.Scanner;
//
//public class lesson7_4 {
//
//    public static void main(String[] args) {
//
////        System.out.println("Введите в консоль: Привет меня зовут Максим");
////        Scanner scanner = new Scanner(System.in);
////        int sc = scanner.nextInt();
////        System.out.println(sc);
//
//        consoleOutput();
//       String textFromScanner = getInputString();
//
//       String[] arrAfterSplit = arrayFromStr(textFromScanner);
//       String arrAfterReverse =  reverseArray();
//       printArray();
//
//    }
//    public static  void printArray(String[] arr) {
//        for(String array : arr){
//            System.out.println(array);
//        }
//    }
//    private static  String reverseArray(String[]arrText) {
//            String[] reverseArr = arrText;
//
//            String temp = null;
//            int count = arrText.length;
//            for (int i = 0; i < count / 2; i++) {
//                temp = reverseArr[count - i -1] = reverseArr[i];
//                reverseArr[i] = temp;
//            }
//            return reverseArr;
//    }
//    private static String[] arrayFromStr(String str){
//        String[] arr = str.trim().split(" ");
//        return  arr;
//    }
//
//    public static String getInputString() {
//        Scanner scanner = new Scanner(System.in);
//        String test = scanner.nextLine();
//        return text;
//    }
//    private  static  void consoleOutput(){
//        System.out.println("Введите какой-то текст");
//    }
//
//}
