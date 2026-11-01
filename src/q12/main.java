package q12;

public class main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displayInfo();
    }
}

class Animal {
    String name = "Animal";

    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    String name = "Dog";

    void displayInfo() {
        System.out.println("Parent name: " + super.name);
        System.out.println("Child name: " + name);
        super.eat();
    }
}
