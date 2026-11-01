// PASS CLASS AS A PARAMETER BY USING INNER CLASS
package q20;

public class main {
    public static void main(String[] args) {
        College college = new College();
        College.Student student = college.new Student("Anita", 101);
        College.Student student2 = college.new Student("Kevin", 112);

        college.showStudentDetails(student);
        college.showStudentDetails(student2);
    }
}

class College {
    class Student {
        String name;
        int rollNumber;

        Student(String name, int rollNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
        }

        String getName() {
            return name;
        }

        int getRollNumber() {
            return rollNumber;
        }
    }

    void showStudentDetails(Student student) {
        System.out.println("Student name: " + student.getName());
        System.out.println("Student roll number: " + student.getRollNumber());
    }
}
