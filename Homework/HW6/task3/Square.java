package Homework.HW6.task3;

public class Square extends Shape {
    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    double square() {
        return a*a;
    }
}
