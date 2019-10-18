package Homework.HW6.task3;

public class Rectangle extends Shape {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double square() {
        return a*b;
    }
}
