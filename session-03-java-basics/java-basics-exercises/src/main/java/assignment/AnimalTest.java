package assignment;

import java.util.Arrays;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Buddy", 5, "Golden Retriever");
        animals[1] = new Cat("Whiskers", 3, 20);
        animals[2] = new Animal("Mystery Animal", 7);

        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
            animal.makeSound();
            System.out.println();
        }

    }
}
