package q11;

public class main {
    public static void main(String[] args) {
        SampleObject object = new SampleObject();
        object = null;

        // Garbage collection does not guarantee that finalize will run.
        System.gc();
        System.out.println("The garbage collector was requested to run.");
    }
}

class SampleObject {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("The finalize method was called.");
        super.finalize();
    }
}
