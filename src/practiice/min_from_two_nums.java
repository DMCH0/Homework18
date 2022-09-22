package practiice;

public class min_from_two_nums {
    public static void main(String[] args) {
//   Написать функцию, которая возвращает минимум из двух чисел.

        int i = 7;
        int b = 3;

        int result;
        if (i > b) {
            System.out.println(b);
        }else {
            System.out.println("Error");
        }

// Второая реализация с библиотекой Масс
        int minResult = Math.min(7,3);
        System.out.println(minResult);
    }
}
