package lms;

import java.net.FileNameMap;

//Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
//жана circumference деген статик методдору болсун.
//areaны табуу учун: PI * (radius * radius)
//circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат
public class Circle {
    static final double PI = 3.14;
     double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public static double area(double radius){
        return PI * (radius * radius);
    }
    public static double circumference(double radius){
        return PI * 2 * radius;
    }
}
