//WAP to create a class named Shape and create three subclasses Circle, Triangle and Square,
// Each class has two-member functions named draw () and erase ().
// Implement this concept using polymorphism.

package Lab2;

public class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
    public void erase() {
        System.out.println("Erasing a shape");
    }

    static class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }
        @Override
        public void erase() {
            System.out.println("Erasing a circle");
        }
    }

    static class Triangle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a triangle");
        }
        @Override
        public void erase() {
            System.out.println("Erasing a triangle");
        }
    }

    static class Square extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a square");
        }
        @Override
        public void erase() {
            System.out.println("Erasing a square");
        }
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        shape.draw();
        shape.erase();
        circle.draw();
        triangle.draw();
        square.draw();
        circle.erase();
        triangle.erase();
        square.erase();
    }
}