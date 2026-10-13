
public class act4 {
    public static void main(String[] args) {

        byte num = 127;
        num++;
        System.out.println("Overflow: " + num);

        String a = new String("Hello");
        String b = new String("Hello");
        String c = "Hello";

        System.out.println("a == b: " + (a == b));
        System.out.println("a equals b: " + a.equals(b));
        System.out.println("a == c: " + (a == c));

        int[] x = {10, 20, 30};
        int[] y = x;

        y[0] = 99;

        System.out.println("x[0]: " + x[0]);
        System.out.println("y[0]: " + y[0]);
    }
}
