public class act17 {
    public static void main(String[] args) {
        String[] favorites = {"Shawarma", "Coke", "Manga", "Music", "Coding"};

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("Total length: " + favorites.length);
    }
}