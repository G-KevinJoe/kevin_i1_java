// SHOW AN EXAMPLE OF EXCEPTION PROPAGATION?
package q7;

public class main {
    public static void main(String[] args) {
        try {
            firstMethod();
        } catch (Exception exception) {
            System.out.println("Exception handled in main: " + exception.getMessage());
        }
    }

    static void firstMethod() throws Exception {
        secondMethod();
    }

    static void secondMethod() throws Exception {
        thirdMethod();
    }

    static void thirdMethod() throws Exception {
        throw new Exception("Problem in the third method");
    }
}
