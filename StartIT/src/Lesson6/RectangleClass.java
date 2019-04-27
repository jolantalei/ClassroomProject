package Lesson6;

public class RectangleClass extends Shape {
    public double width;
    public double height;

    public double getPerimeter() {//metods name jābūt vienādiem visās klasēs lai varētu izmantot abstract function (vienā klasēs izmanto citas)
        return (width + height) * 2;
    }

    public double getArea() {
        return width * height;
    }
}
