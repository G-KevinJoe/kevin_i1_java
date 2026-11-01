// STORE SOME INFORMATION IN PROPERTIES CLASS AND ACCESS IT. DATABASE
// USERNAME/ PASSWORD

package q2;

import java.util.Properties;

public class main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("db.username", "demoUser");
        properties.setProperty("db.password", "demoPassword");

        String username = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");

        System.out.println("Database Username: " + username);
        System.out.println("Database Password: " + password);
    }
}
