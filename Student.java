public class Student {

    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Display student details
    void display() {

    System.out.println("Name: " + name);
    System.out.println("Marks: " + marks);
    System.out.println("Grade: " + calculateGrade());
}

    String calculateGrade() {

    if(marks >= 90) {
        return "A";
    }
    else if(marks >= 75) {
        return "B";
    }
    else if(marks >= 50) {
        return "C";
    }
    else {
        return "Fail";
    }
}
}