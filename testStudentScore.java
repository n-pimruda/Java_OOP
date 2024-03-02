package week8;

public class testStudentScore {
    public static void main(String[] args) {
        // Create an array of StudentScore objects with size 3
        StudentScore[] students = new StudentScore[3];

        // Initialize each element of the array with StudentScore objects
        students[0] = new StudentScore("Somchai", 30.5, 50.2);
        students[1] = new StudentScore("Jade", 75.6, 81.3);
        students[2] = new StudentScore("Somsri", 78.0, 75.0);
        
        for (int i = 0; i < students.length; i++) {
            // Print information about each student
            System.out.println("** No " + (i + 1) + " **");
            System.out.println("Name: " + students[i].getName());
            System.out.println("Midterm Score: " + students[i].getMidtermScore());
            System.out.println("Final Score: " + students[i].getFinalScore());
            System.out.println("Average Score: " + students[i].averageScore());
            System.out.println("Grade: " + students[i].grading());
            System.out.println();
        }
    }
}

