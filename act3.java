import java.util.Scanner;

public class act3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter centimeters: ");
        double cm = input.nextDouble();

        int meters = (int) (cm / 100);
        double remaining = cm - (meters * 100);

        System.out.println("Whole meters: " + meters);
        System.out.println("Remaining centimeters: " + remaining);

        int num = (int) 12.75;
        double wide = num;

        System.out.println("Narrowing: " + num);
        System.out.println("Widening: " + wide);

        input.close();
    }
}