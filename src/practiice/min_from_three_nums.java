package practiice;

public class min_from_three_nums {


//    Минимум трёх чисел
//Написать функцию, которая вычисляет минимум из трёх чисел.

    public static void main(String[] args) {

        System.out.println(minFromThree(100,10,1));
    }

    public static int minFromThree (int a,int b, int c){

        if (a <= b && a <= c){
            return a;
        }else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
}
