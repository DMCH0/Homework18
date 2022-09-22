package Lessons.lesson8;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(); // создание обьекта Cat или создание экземпляра класса
        cat.sayHello();
        catActions();


    }
    public static void catActions() {
        Cat cat = new Cat();
        cat.jump();
        cat.run();
    }

}
