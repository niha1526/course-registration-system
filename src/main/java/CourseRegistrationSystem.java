import java.util.Scanner;

class Student {

    String name;
    String studentId;
    String[] subjects;
    int[] credits;
    int totalCredits;

    Student(String name, String studentId, String[] subjects, int[] credits) {

        this.name = name;
        this.studentId = studentId;
        this.subjects = subjects;
        this.credits = credits;

        totalCredits = 0;

        for (int credit : credits) {
            totalCredits += credit;
        }
    }

    void displayDetails() {

        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);

        System.out.println("\nRegistered Subjects:");

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(
                subjects[i] + " - " + credits[i] + " credits"
            );
        }

        System.out.println("\nTotal Credits: " + totalCredits);

        if (totalCredits >= 15) {
            System.out.println("Eligibility: Eligible");
        } else {
            System.out.println("Eligibility: Not Eligible");
        }
    }
}

public class CourseRegistrationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student ID: ");
        String studentId = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] subjects = new String[n];
        int[] credits = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nSubject " + (i + 1));

            System.out.print("Enter subject name: ");
            subjects[i] = sc.nextLine();

            System.out.print("Enter credits: ");
            credits[i] = sc.nextInt();
            sc.nextLine();
        }

        Student student =
            new Student(name, studentId, subjects, credits);

        student.displayDetails();

        sc.close();
    }
}
