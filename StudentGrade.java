import java.util.Scanner;

public class StudentGrade {
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);

    System.out.print("Enter student's marks (0-100): ");
    int marks = scanner.nextInt();

    char grade;
    if (marks >= 90 && marks <= 100) {
        grade = 'A';
    } else if (marks >= 80 && marks < 90) {
        grade = 'B';
    } else if (marks >= 70 && marks < 80) {
        grade = 'C';
    } else if (marks >= 60 && marks < 70) {
        grade = 'D';
    } else if (marks >= 0 && marks < 60) {
        System.out.println("Fail");
        scanner.close();
        return;

    } else {
        System.out.println("Invalid input.");
        scanner.close();
        return;
    }

    System.out.println("The student's grade is: " + grade);

    scanner.close();
}

}