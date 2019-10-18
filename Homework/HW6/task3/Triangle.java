package Homework.HW6.task3;

public class Triangle extends Shape {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double square() {
        int pp = (a+b+c)/2;
        return Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));
    }
}
