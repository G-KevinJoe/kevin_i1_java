//SHOW AN EXAMPLE OF LOCAL INNER CLASS?

package q19;

public class main {
    public static void main(String[] args) {
        class Student {
            String name = "KEVIN";

            void display() {
                System.out.println("Student name: " + name);
            }
        }

        Student student = new Student();
        student.display();
    }
}
