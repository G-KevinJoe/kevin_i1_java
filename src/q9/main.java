package q9;

public class main {
    public static void main(String[] args) {
        Student firstStudent = new Student(101, "Anita");
        Student secondStudent = new Student(102, "Kevin");

        System.out.println("Students are equal: " + firstStudent.equals(secondStudent));
        System.out.println("First student hash code: " + firstStudent.hashCode());
        System.out.println("Second student hash code: " + secondStudent.hashCode());
    }
}

class Student {
    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }

        if (!(otherObject instanceof Student)) {
            return false;
        }

        Student otherStudent = (Student) otherObject;
        return studentId == otherStudent.studentId;
    }

    @Override
    public int hashCode() {
        return studentId;
    }
}
