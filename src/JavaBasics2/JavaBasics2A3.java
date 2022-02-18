package JavaBasics2;

public class JavaBasics2A3 {

    interface Shape {
        double calculateArea();
        void display();
    }

    public class Rectangle implements Shape {
        int width;
        int height;

        public Rectangle (int w, int h) {
            width = w;
            height = h;
        }

        public double calculateArea() {
            return width * height;
        }
        public void display() {
            System.out.println("Displaying rectangle of width " + width + " and height " + height);
        }
    }

    public class Triangle implements Shape {
        int width;
        int height;

        public Triangle (int w, int h) {
            width = w;
            height = h;
        }

        public double calculateArea() {
            return (width * height) / 2.0;
        }
        public void display() {
            System.out.println("Displaying triangle of width " + width + " and height " + height);
        }
    }

    public class Circle implements  Shape {
        int radius;
        public Circle (int r) {
            radius = r;
        }
        public double calculateArea() {
            double pi = 3.141592654;
            return Math.pow(pi*radius, 2);
        }
        public void display(){
            System.out.println("Displaying circle with radius " + radius);
        }

    }
}
