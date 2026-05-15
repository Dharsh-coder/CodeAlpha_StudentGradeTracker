import java.util.ArrayList;

public class GradeTracker {

    ArrayList<Student> students = new ArrayList<>();

    // Add student
    void addStudent(String name, int marks) {
        Student s = new Student(name, marks);
        students.add(s);
    }

    // Display all students
    void displayAllStudents() {

        for(Student s : students) {
            s.display();
            System.out.println("----------------");
        }
    }

    // Calculate average marks
void calculateAverage() {

    int sum = 0;

    for(Student s : students) {
        sum += s.marks;
    }

    double average = (double) sum / students.size();

    System.out.println("Average Marks: " + average);
}

// Find highest marks
void findHighest() {

    int highest = students.get(0).marks;

    for(Student s : students) {

        if(s.marks > highest) {
            highest = s.marks;
        }
    }

    System.out.println("Highest Marks: " + highest);
}

// Find lowest marks
void findLowest() {

    int lowest = students.get(0).marks;

    for(Student s : students) {

        if(s.marks < lowest) {
            lowest = s.marks;
        }
    }

    System.out.println("Lowest Marks: " + lowest);
}
}