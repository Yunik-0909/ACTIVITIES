class Student {
    String name;
    int[] quizzes;
    double average;
    int rank;

    public Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
        int sum = 0;
        for (int i = 0; i < quizzes.length; i++) {
            sum += quizzes[i];
        }
        this.average = (double) sum / quizzes.length;
    }
}

public class act20 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        int[][] rawData = {
            {85, 90, 92, 88},
            {70, 75, 80, 85},
            {95, 92, 98, 90},
            {85, 90, 92, 88}
        };

        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], rawData[i]);
        }

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        int currentRank = 1;
        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].average < students[i - 1].average) {
                currentRank = i + 1;
            }
            students[i].rank = currentRank;
        }

        System.out.println("Rank\tName\tAverage");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].rank + "\t\t" + students[i].name + "\t" + students[i].average);
        }

        String searchTarget = "Diana";
        int foundRank = linearSearch(students, searchTarget);
        if (foundRank != -1) {
            System.out.println("\nSearch Result: " + searchTarget + " is at rank " + foundRank);
        } else {
            System.out.println("\nSearch Result: Student not found.");
        }
    }

    public static int linearSearch(Student[] students, String targetName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equals(targetName)) {
                return students[i].rank;
            }
        }
        return -1;
    }
}
