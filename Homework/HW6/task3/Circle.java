package Homework.HW6.task3;

public class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double square() {
        return Math.PI*r*r;
    }
}
