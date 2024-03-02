import java.util.Scanner;
public class GradeBookTest{
	// main method begins program execution
	public static void main( String args[] ) { 
    Scanner scanner = new Scanner(System.in);
		String x ;
		
		GradeBook gradeBook1 = new GradeBook("OOP");      
		x = scanner.nextLine();
		gradeBook1.setInstructorName(x);
    gradeBook1.displayMessage();
	}
}
