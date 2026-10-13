import java.util.Scanner;

public class act16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] inventory = {
            {10, 5, -1},
            {2, 15, 8},
            {-1, 20, 12}
        };
        int choice;

        do {
            System.out.println("\n1. Total Inventory");
            System.out.println("2. Find Low Shelf");
            System.out.println("3. Restock Shelf");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int total = 0;
                    for (int i = 0; i < inventory.length; i++) {
                        for (int j = 0; j < inventory[i].length; j++) {
                            if (inventory[i][j] == -1) {
                                continue;
                            }
                            total += inventory[i][j];
                        }
                    }
                    System.out.println("Total Inventory (excluding damaged shelves): " + total);
                    break;

                case 2:
                    boolean found = false;
                    for (int i = 0; i < inventory.length; i++) {
                        for (int j = 0; j < inventory[i].length; j++) {
                            if (inventory[i][j] != -1 && inventory[i][j] < 5) {
                                System.out.println("Critically low shelf found at: [" + i + "][" + j + "] with count " + inventory[i][j]);
                                found = true;
                                break;
                            }
                        }
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No critically low shelves found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter row: ");
                    int r = scanner.nextInt();
                    System.out.print("Enter col: ");
                    int c = scanner.nextInt();
                    
                    if (r < 0 || r >= inventory.length || c < 0 || c >= inventory[r].length || inventory[r][c] == -1) {
                        System.out.println("Invalid or damaged shelf.");
                        break;
                    }

                    while (true) {
                        System.out.print("Enter amount to add (positive): ");
                        int add = scanner.nextInt();
                        if (add > 0) {
                            inventory[r][c] += add;
                            System.out.println("New count: " + inventory[r][c]);
                            return;
                        }
                        System.out.println("Invalid amount. Try again.");
                    }

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }
}