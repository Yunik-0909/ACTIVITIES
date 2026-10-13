public class act15{
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++) {
            if (i == 2) {
                continue;
            }

            for (int j = 1; j <= size; j++) {
                if (j > 3) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}