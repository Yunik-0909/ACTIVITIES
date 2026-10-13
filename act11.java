import java.util.Scanner;

public class act11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "password123";
        boolean isAccountLocked = false;

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (!username.equals(correctUsername)) {
            System.out.println("Error: Incorrect username.");
        } else if (!password.equals(correctPassword)) {
            System.out.println("Error: Incorrect password.");
        } else if (isAccountLocked) {
            System.out.println("Error: Account is locked.");
        } else {
            System.out.println("Login successful!");
        }

        input.close();
    }
}