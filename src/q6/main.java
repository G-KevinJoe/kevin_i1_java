// SHOW AN EXAMPLE OF OBJECT ITERATION BY USING FOLLOWING COMPONENTS
// - FOR EACH LOOP
// - ITERATOR

package q6;
import java.util.ArrayList;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Kevin");
        students.add("Ravi");
        students.add("Meena");

        System.out.println("Using for-each loop:");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("Using iterator:");
        Iterator<String> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }
    }
}
