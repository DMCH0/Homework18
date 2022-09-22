package practiice.usefullCases;

public class operBreak {
    public static void main(String[] args) {
        final int NUMBER = 20;
        System.out.println(NUMBER);

        int i = 1;
        int a = 3;
        while (i <= 5){
            System.out.println(i + " Цикл выполняется");
            if (i == a){
                break;
            }
            i++;
        }
        for (int j = 1; j <=2; j++){
            System.out.println("Это первый цикл, Я выполняюсь  " + j + " раз");
            for (int u = 1; u <= 10; u++){
                System.out.println("Это второй цикл, я выполняюсь " + u + " раз");
                if (u == 2){
                    break;
                }
            }
        }
    }
}
