package chapter09;

import java.util.ArrayList;
import java.util.List;

interface Animal{
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

class Cuckoo implements Animal{
    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }
}

public class Q5AnimalSoundTest {

    public static void main(String[] args) {
        List<Animal> lists = new ArrayList<>();
        lists.add(new Dog());
        lists.add(new Cuckoo());
        printSound(lists);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        printSound(dogs);
    }

    static <T extends Animal> void printSound(List<T> ani){
        for(T a : ani) {
            a.sound();
        }
    }
}
