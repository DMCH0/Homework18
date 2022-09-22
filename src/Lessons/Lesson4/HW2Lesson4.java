package Lessons.Lesson4;
public class HW2Lesson4 {

    public static void main(String[] args) {

//        Умножение переменной на 2.
//        Задание Необходимо вывести
//        на экран вот такую последовательность чисел
//        с помощью цикла while:
//        1 2 4 8 16 32 64 128 256 512

        int cars = 1;
        while (cars <= 512) {
            System.out.print(cars + " ");
            cars *= 2;
        }
    }
}

