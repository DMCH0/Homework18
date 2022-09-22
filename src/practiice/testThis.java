package practiice;

public class testThis {
    int num = 10;
    int num2 = 20;

    public static void main(String[] args) {
        int num = 20;
        int num2 = 50;
        System.out.println(num);  // 20
//        System.out.println(this.num); //10 ссылка на текущий обьект (текущий обьект сейчас это tetsThis
        System.out.println(num2); // 50
    }
}
