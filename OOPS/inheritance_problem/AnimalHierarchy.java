class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println("Chirp");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Rex", 5), new Cat("Whiskers", 3), new Bird("Tweety", 1)};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
