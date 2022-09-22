package Homeworks.lesson6;
public class Homework6_2 {
    public static void main(String[] args) {

        String firstLesson = "Это 1-й урок!";
        String secondLesson = "Это 2-й урок!";
        String thirdLesson = "Это 3-й урок!";

        for (int i = 0; i < 1 ; i++) {
            System.out.println(firstLesson + "\nЯ выполнил все домашние задания 1-го урока.");
            if (i < 1) {
                System.out.println(secondLesson + "\nЯ выполнил все домашние задания 2-го урока.");
            }
            System.out.println(thirdLesson + "\nЯ не выполнил домашние задания 3-го урока.");
        }
    }
}

// По идее тут нужно for + if else

//С помощью цикла и условного оператора вывести в консоль:
//Это 1-й урок!
//      Я выполнил все домашние задания 1-го урока.
//Это 2-й урок!
//      Я выполнил все домашние задания 2-го урока.
//Это 3-й урок!
//       Я не выполнил домашние задания 3-го урока.