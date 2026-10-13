import java.util.Scanner;

public class act12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Username: ");
        String username = scanner.nextLine();
        
        if (username.equals("user")) {
            System.out.print("PIN: ");
            String pin = scanner.nextLine();
            
            if (pin.equals("1234")) {
                System.out.print("Balance: ");
                double balance = scanner.nextDouble();
                
                System.out.print("Withdrawal amount: ");
                double amount = scanner.nextDouble();
                
                String tier = "";
                double limit = 0.0;
                
                if (balance < 5000) {
                    tier = "Bronze";
                    limit = 5000;
                } else if (balance < 20000) {
                    tier = "Silver";
                    limit = 15000;
                } else if (balance < 50000) {
                    tier = "Gold";
                    limit = 30000;
                } else {
                    tier = "Platinum";
                    limit = 50000;
                }
                
                if (amount <= balance) {
                    if (amount <= limit) {
                        double fee = 0.0;
                        switch (tier) {
                            case "Bronze":
                                fee = amount * 0.03;
                                break;
                            case "Silver":
                                fee = amount * 0.02;
                                break;
                            case "Gold":
                                fee = amount * 0.01;
                                break;
                            case "Platinum":
                                fee = 0.0;
                                break;
                        }
                        
                        double total = amount + fee;
                        if (total <= balance) {
                            System.out.println("APPROVE");
                        } else {
                            System.out.println("DENY: Insufficient balance for amount plus fee");
                        }
                    } else {
                        System.out.println("DENY: Exceeds tier daily limit");
                    }
                } else {
                    System.out.println("DENY: Insufficient balance");
                }
            } else {
                System.out.println("DENY: Incorrect PIN");
            }
        } else {
            System.out.println("DENY: Incorrect username");
        }
        
        scanner.close();
    }
}
