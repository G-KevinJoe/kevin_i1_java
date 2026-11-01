// SHOW AN EXAMPLE OF FOLLOWING INHERITANCE?
// a. SINGLE
// b. MULTILEVEL
// c. HIERARCHICAL

package q17;

public class main {
    public static void main(String[] args) {
        System.out.println("--- Single Inheritance ---");
        Dog dog = new Dog();
        dog.sound();

        System.out.println("--- Multilevel Inheritance ---");
        BabyDog babyDog = new BabyDog();
        babyDog.sound();
        babyDog.play();

        System.out.println("--- Hierarchical Inheritance ---");
        Cat cat = new Cat();
        cat.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays with a ball");
    }
}

class BabyDog extends Puppy {
    void play() {
        System.out.println("Baby dog is learning to play");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
