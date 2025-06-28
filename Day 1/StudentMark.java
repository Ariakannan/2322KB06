import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many subjects? ");
        int n = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Marks for subject " + i + ": ");
            total += sc.nextInt();
        }

        double percentage = (double) total / n;
        String grade;

        if (percentage >= 90) grade = "A";
        else if (percentage >= 80) grade = "B";
        else if (percentage >= 70) grade = "C";
        else if (percentage >= 60) grade = "D";
        else if (percentage >= 50) grade = "E";
        else grade = "F";

        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
