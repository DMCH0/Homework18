package Homeworks.homework16_v1.cat_dog.dog;
import Homeworks.homework16_v1.cat_dog.animal.Animal;

public class Dog extends Animal {

    static String name;
    public Dog(String name) {
        this.name = name;
    }
    public static String sound(){
        return  "I'am a Dog. My name is " + name + "Gav";
    }
}
