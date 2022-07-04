package chapter07;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cuckoo c = new Cuckoo();

        makeSound(d);
        makeSound(c);
    }

    private static void makeSound(Animal a) {
        a.sound();
    }
}
