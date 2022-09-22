package practiice;

public class Cat {
//    Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной private String name равное переданному параметру String name.

    public String name = "безымянный кот";

    public void setName(String name) {
        Cat cat1 = new Cat();
        cat1.setName("Васька");
        System.out.println(cat1.name);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}