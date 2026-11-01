//SHOW USES OF STRING FUNCTION
package q16;

public class main {
    public static void main(String[] args) {
        String name = "Kevin's Java Programming";

        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Character at index 5: " + name.charAt(5));
        System.out.println("Substring: " + name.substring(5, 15));
        System.out.println("Contains 'Java': " + name.contains("Java"));
        System.out.println("Replace: " + name.replace("Java", "Core"));
    }
}
