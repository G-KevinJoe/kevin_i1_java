package q4;

import java.util.Vector;

public class main {
    public static void main(String[] args) {
        Vector<String> products = new Vector<String>();

        products.add("Notebook");
        products.add("Pen");
        products.add("Pencil");
        System.out.println("After adding: " + products);

        products.remove("Pen");
        System.out.println("After deleting Pen: " + products);

        products.set(0, "Drawing Book");
        System.out.println("After updating first product: " + products);

        if (products.contains("Pencil")) {
            System.out.println("Pencil was found in the collection.");
        } else {
            System.out.println("Pencil was not found in the collection.");
        }
    }
}
