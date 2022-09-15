package Homeworks.homework16.main;
import Homeworks.homework16.cat_dog.animal.Animal;
import java.util.ArrayList;
import java.util.List;

public class Practice_cat_dog {
    public static void main(String[] args) {
        List<Animal> animals = ArrayList<Animal>();
        animals.add(new Dog("Tuzik"));
        animals.add(new Cat("Vasya"));

        for (Animal animal : animals){
            animal.sound();
        }
    }
}
