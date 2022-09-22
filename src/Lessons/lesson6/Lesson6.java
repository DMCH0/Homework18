//package Lessons.lesson6;
//import java.util.Scanner;
//public class Lesson6 {
//
//    public static void main(String[] args) {
//
//        String text = "Hello i am MAks";
//
//        if (text.equalsIgnoreCase("Hello i am Maks")){
//            System.out.println("Ok");
//        }else {
//            System.out.println("Fail");
//        }
//
//        String test2 = "Hello i am Alex";
//        System.out.println((test2.indexOf("l")));
//        System.out.println(test2.lastIndexOf("l"));
//
//        int num = 1256341;
//        String temp = String.valueOf(num);
//        System.out.println(temp);
//
//
//        double num3 = 5.49;
//                System.out.println(Math.round(num3));
//                System.out.println(Math.floor(num3));
//                System.out.println(Math.ceil(num3));
//
//
//
//         String[] arr ={"Привет ", "Меня", "Зовут", "Макс"};
////                       Макс зовут меня привет
//        reverseArr(arr);
//        }
//
//        public static void reverseArr(String[] arr) {
//        int lengthArr = arr.length;
//
//        String temp;
//        for (int  i= 0; i < lengthArr / 2; i++){
//            temp = arr[lengthArr - i - 1];  // arr[3] = Maks
//            arr[lengthArr - i - 1] = arr[i];  // arr[0] = Привет
//            arr[i] = temp; //   {"Макс ", "Меня", "Зовут", "Привет"};
//
//            for (String str: arr){
//                System.out.print(str + " ");
//            }
//
//        }
//
//
//          public static void countWords() {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Введите строку в консоль");
//
//            String input = scanner.nextLine();
//
//            int count = 0;
//            if (input.length() != 0) {
//                count++;
//
//                for (int = 0; i < input.length(); i++) {
//                    if (input.charAt(i) == ' '0) {
//                }
//            }
//            System.out.println(count);
//          }
//
//        }
//   }