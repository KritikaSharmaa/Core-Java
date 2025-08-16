// Q3: Method with Logic Inside Class
// Create a class Rectangle with:
// length (int)
// width (int)
// Add methods:
// calculateArea() – returns area
// calculatePerimeter() – returns perimeter
// Create an object and print both area and perimeter.

public class Ques3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 2);
        int rec_area = r1.calculateArea();
        System.out.println("Area: " + rec_area);
        int rec_p = r1.calculatePerimeter();
        System.out.println("Parameter: " + rec_p);
    }
}

class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int calculateArea() {
        return length * width;
    }

    int calculatePerimeter() {
        return 2 * (length + width);
    }
}
