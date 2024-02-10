import java.util.Scanner;

public class Grade {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks1, marks2, marks3, marks4;
        int totalMarks,Avg;

        System.out.println("Enter marks for subject 1:");
        marks1 = sc.nextInt();

        System.out.println("Enter marks for subject 2:");
        marks2 = sc.nextInt();

        System.out.println("Enter marks for subject 3:");
        marks3 = sc.nextInt();

        System.out.println("Enter marks for subject 4:");
        marks4 = sc.nextInt();

        totalMarks = marks1 + marks2 + marks3 + marks4;
        Avg = totalMarks/4;

        System.out.println("Total Marks: " + totalMarks);

        if (Avg >= 90) {
            System.out.println("Grade: A");
        } else if (Avg >= 80 && Avg < 90) {
            System.out.println("Grade: B");
        } else if (Avg >= 70 && Avg < 80) {
            System.out.println("Grade: C");
        } else if (Avg >= 60 && Avg < 70) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}