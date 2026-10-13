public class act10 {
    public static void main(String[] args) {
        double purchaseAmount = 150.0;
        double discountRate = 0.0;
        String tier = "0%";

        if (purchaseAmount >= 500.0) {
            discountRate = 0.15;
            tier = "15%";
        } else if (purchaseAmount >= 300.0) {
            discountRate = 0.10;
            tier = "10%";
        } else if (purchaseAmount >= 100.0) {
            discountRate = 0.05;
            tier = "5%";
        } else {
            discountRate = 0.0;
            tier = "0%";
        }

        double finalPrice = purchaseAmount - (purchaseAmount * discountRate);

        System.out.println("Discount Tier: " + tier);
        System.out.println("Final Price: " + finalPrice);
    }
}