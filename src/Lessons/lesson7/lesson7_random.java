package Lessons.lesson7;
public class lesson7_random {


    public static void main(String[] args) {

        double a = Math.random();
        System.out.println(a);

//        (Math.random() * (b - a)) + a
//        [0, 3) исключительный диапазаон
//        (Math.random() * (3 - 0)) + 0 = Math.random() * 3
        double b = Math.random() * 3;
        System.out.println(b);

//        [2, 3)  включительный диапазон
//        Math.random() * (3 - 2)) + 2 = Math.random() * 1 + 2  = Math.random() * 2
        double c = Math.random() + 2;
        System.out.println(c);
//        [0, 2] тут хз шо за тип
        int m = (int) (Math.random() * 3);
        System.out.println(m);

        String text = "Привет меня зовут Максим";
        String[] words = text.trim().split(" ");
        System.out.println(words);
        for (String word : words) {
        }
        System.out.println(words.length);
    }
}
