import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GradeTracker gt = new GradeTracker();

        System.out.println("===== Student Grade Tracker =====");

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        sc.nextLine();

        for(int i = 1; i <= n; i++) {

            System.out.println("\nEnter details for Student " + i);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            sc.nextLine();

            gt.addStudent(name, marks);
        }

        System.out.println("\n===== Student Report =====");

        gt.displayAllStudents();

        gt.calculateAverage();
        gt.findHighest();
        gt.findLowest();

        sc.close();
    }
}