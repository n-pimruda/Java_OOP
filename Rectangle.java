package week5;

public class Rectangle {
    private int width;
    private int height;
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int area()   {
        int area;
        area = width*height;
        return area;
    }
    public int perimeter() {
        int perimeter;
        perimeter = 2*(width+height);
        return perimeter;
    }
}
