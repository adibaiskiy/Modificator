package lms;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        double area = Circle.area(circle.radius);
        double circumference = Circle.circumference(circle.radius);

        System.out.println("Area:  " + area);
        System.out.println("Circumference: " + circumference);
    }

}
