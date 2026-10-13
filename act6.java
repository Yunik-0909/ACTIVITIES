import java.util.Scanner;

public class act6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double average;
        int absences;

        System.out.print("Enter average grade: ");
        average = input.nextDouble();

        System.out.print("Enter number of absences: ");
        absences = input.nextInt();

        if ((average >= 75 && absences <= 3) || average >= 90) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        input.close();
    }
}