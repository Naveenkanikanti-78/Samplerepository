import java.util.Scanner;

public class SQLInjectionVulnerableCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // This line is vulnerable to SQL injection
        String query = "SELECT * FROM users WHERE username='" + username + "';";

        // Execute the query (not implemented for demonstration purposes)
        // database.execute(query);

        System.out.println("Query executed successfully.");

        scanner.close();
    }
}