package example.operators;

public class Test100 {
    public static void main(String[] args) {

        int a = 10;
        if (++a ==10 && ++a == 12){
            ++a;
        }
        System.out.println(a);
    }
}
