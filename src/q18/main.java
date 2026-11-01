package q18;

public class main {
    static String schoolName = "ABC School";
    int globalVariable = 100;

    public static void main(String[] args) {
        main object = new main();
        int localVariable = 25;

        System.out.println("Global/static value: " + schoolName);
        System.out.println("Object value: " + object.globalVariable);
        System.out.println("Local value: " + localVariable);

        object.showLocalVariable();
    }

    void showLocalVariable() {
        int localVariable = 50;
        System.out.println("Inside method local value: " + localVariable);
    }
}
