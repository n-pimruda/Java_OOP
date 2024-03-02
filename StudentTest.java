package week6;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student("Pimruda", "Chumsuk", 80, 90, 85);
 
        System.out.println("name: " + student.getName());
        System.out.println("lastname: " + student.getSurname());
        System.out.println("AverageScore: " + student.getAverage());
 
        student.setName("Pimruda");
        student.setSurname("Chumsuk");
        student.setScore1(90);
        student.setScore2(95);
        student.setScore3(100);
 
        System.out.println("\n name: " + student.getName());
        System.out.println("lastname: " + student.getSurname());
        System.out.println("AverageScore: " + student.getAverage());
 
    }
}
