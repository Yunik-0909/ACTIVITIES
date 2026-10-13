import java.util.Arrays;

public class act19 {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 90, 88, 76, 95, 82};
        int target = 90;

        int foundIndex = -1;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Target " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Target " + target + " not found.");
        }

        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("Original array: " + Arrays.toString(scores));
        System.out.println("Sorted copy: " + Arrays.toString(sortedScores));
    }
}