package example.child;
import example.parent.Private_class;

public class using_private_methods  {

    public static void main(String[] args) {

        Private_class private_class = new Private_class();
//        System.out.println(private_class.fuel);
        System.out.println(private_class.getFuel()); // Использую метод GET для приватного поля

        private_class.setFuel("Баклажановая тяга");  // Использую метод SET для установки нового заначени для fuel
        System.out.println(private_class.getFuel());

//        private_class.fuel = "То что мне нужно";
//        System.out.println(private_class.fuel);


    }

}
