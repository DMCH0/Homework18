package practiice;
import java.util.Scanner;
//Как захватить мир
//Ввести с клавиатуры число и имя, вывести на экран строку:
//«имя» захватит мир через «число» лет. Му-ха-ха!
//( Последовательность вводимых данных имеет большое значение.) Пример:
//Вася захватит мир через 8 лет. Му-ха-ха!
public class ScannerCases {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя: ");
        String name = scanner.nextLine();
        System.out.print("Количество лет: ");
        int digit = scanner.nextInt();
        System.out.println(name + " Захватит мир через " + digit + " лет. Му-ха-ха! " );

        //// Я не хочу изучать Java, я хочу большую зарплату
        ////Вывести на экран десять раз надпись «Я не хочу изучать Java, я хочу большую зарплату»
        for (int i = 0; i <= 10; i++){
         System.out.println(i + " Я не хочу изучать Java, я хочу большую зарплату");
     }
    }
}

