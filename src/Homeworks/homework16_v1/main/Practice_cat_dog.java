package Homeworks.homework16_v1.main;
import Homeworks.homework16_v1.cat_dog.animal.Animal;
import Homeworks.homework16_v1.cat_dog.cat.Cat;
import Homeworks.homework16_v1.cat_dog.dog.Dog;
import java.util.ArrayList;
import java.util.List;

public class Practice_cat_dog {

        public static void main(String[] args) {

            List<Animal> animals = new ArrayList<Animal>();
             animals.add(new Dog("Tuzik"));
             animals.add(new Cat("Vasya"));

            for (Animal animal : animals) {
            animal.sound();

            }
        }
}
