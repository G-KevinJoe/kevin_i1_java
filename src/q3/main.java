package q3;

public class main {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 50000);
        Employee e2 = new Employee("Alice", 60000);
        Employee e3 = new Employee("Kevin", 500000);

        int comparisonResult = e1.compareTo(e2);
        int comparisonResult2 = e1.compareTo(e3);
        
        if (comparisonResult < 0) {
            System.out.println(e1.getName() + " has a lower salary than " + e2.getName());
        } else if (comparisonResult > 0) {
            System.out.println(e1.getName() + " has a higher salary than " + e2.getName());
        } else {
            System.out.println(e1.getName() + " and " + e2.getName() + " have the same salary.");
        }

        if (comparisonResult2 < 0) {
            System.out.println(e1.getName() + " has a lower salary than " + e3.getName());
        } else if (comparisonResult2 > 0) {
            System.out.println(e1.getName() + " has a higher salary than " + e3.getName());
        } else {
            System.out.println(e1.getName() + " and " + e3.getName() + " have the same salary.");
        }
    }
}

class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        if (salary < otherEmployee.salary) {
            return -1;
        } else if (salary > otherEmployee.salary) {
            return 1;
        } else {
            return 0;
        }
    }
}
