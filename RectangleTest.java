package week5;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int width = scanner.nextInt();
    int height = scanner.nextInt();
    Rectangle Rectangle1 = new Rectangle(width, height);
    int area = Rectangle1.area();
    int perimeter = Rectangle1.perimeter();
    System.out.printf("area: %d",area);
    System.out.println();
    System.out.printf("perimeter: %d",perimeter);
    scanner.close();
    }
}
