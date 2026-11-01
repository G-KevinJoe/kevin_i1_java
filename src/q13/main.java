package q13;

public class main {
    public static void main(String[] args) {
        Department department = new Department("Computer Science");
        Faculty faculty = new Faculty("Engg. Kevin");
        department.setHead(faculty);
        System.out.println("Department name: " + department.getName());
        System.out.println("Head of department: " + department.getHead().getName());
        Car car = new Car("KEVIN Model J");
        Engine engine = new Engine("Internal Combustion");
        car.setEngine(engine);
        System.out.println("Car model: " + car.getModel());
        System.out.println("Engine type: " + car.getEngine().getType());
    }
}

class Faculty {
    private String name;
    public Faculty(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private Faculty head;

    public Department(String name) {
        this.name = name;
    }

    public void setHead(Faculty head) {
        this.head = head;
    }

    public Faculty getHead() {
        return head;
    }

    public String getName() {
        return name;
    }
}

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Car {
    private String model;
    private Engine engine;

    public Car(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }
}
