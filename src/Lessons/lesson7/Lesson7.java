package Lessons.lesson7;
public class Lesson7 {

    public static void main(String[] args) {

        int month = 5;

        String monthString = null;
        switch (month) {
            case 1: monthString = "Январь";
            break;
            case 2: monthString = "Февраль";
            break;
            case 3: monthString = "Март";
            break;
            default: monthString = "Я не знаю такого месяца";
        }
        System.out.println(monthString);
    }
}
