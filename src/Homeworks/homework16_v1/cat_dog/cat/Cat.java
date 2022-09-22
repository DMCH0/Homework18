package Homeworks.homework16_v1.cat_dog.cat;
import Homeworks.homework16_v1.cat_dog.animal.Animal;

public class Cat extends Animal {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }
    @Override
    public String sound(){
        return  "I'am a Cat. My name is " + name + ". Mew";
    }
}
