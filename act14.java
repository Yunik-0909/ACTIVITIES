import java.util.Scanner;

public class act14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            sum += input;
        }
        System.out.println(sum);
        scanner.close();
    }
}

