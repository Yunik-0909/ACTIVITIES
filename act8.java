public class act8 {
    public static void main(String[] args) {
        
        int a = 5;
        boolean result1 = a++ * 2 < 10;
        System.out.println("Expression 1 Actual: " + result1);

        boolean result2 = 10 > 5 || 5 > 3 && 2 < 4;
        System.out.println("Expression 2 Actual: " + result2);

        int x = 5;
        boolean result3 = !(--x > 3);
        System.out.println("Expression 3 Actual: " + result3);
        
    }
}