public class act7 {
    public static void main(String[] args) {

        int balance = 1000;

        balance += 200;
        System.out.println("After adding 200: " + balance);

        balance *= 2;
        System.out.println("After multiplying by 2: " + balance);

        balance += 500;
        System.out.println("After adding 500: " + balance);

        int count = 5;

        System.out.println("Postfix: " + count++);
        System.out.println("After postfix: " + count);

        System.out.println("Prefix: " + ++count);
        System.out.println("After prefix: " + count);
    }
}