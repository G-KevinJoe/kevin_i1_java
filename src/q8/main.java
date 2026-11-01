package q8;

public class main {
    public static void main(String[] args) {
        Student originalStudent = new Student(101, "Kevin");

        try {
            Student copiedStudent = (Student) originalStudent.clone();
            System.out.println("Original student: " + originalStudent);
            System.out.println("Cloned student: " + copiedStudent);
        } catch (CloneNotSupportedException exception) {
            System.out.println("The student object could not be cloned.");
        }
    }
}

class Student implements Cloneable {
    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return studentId + " - " + name;
    }
}
