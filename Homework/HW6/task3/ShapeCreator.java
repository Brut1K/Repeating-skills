package Homework.HW6.task3;

import java.util.Scanner;

public class ShapeCreator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean checker = true;
        Shape shape = new Shape() {
            @Override
            double square() {
                return 0;
            }
        };

        while(checker) {
            System.out.println("Выберите фигуру, которую вы хотите создать: 1(Круг), 2(Квадрат)," +
                    " 3(Прямоугольник), 4(Треугольник), 5(завершить работу)");
            switch(sc.nextInt()){
                case 1:
                    System.out.println("Введите радиус круга");
                    shape = new Circle(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Введите сторону квадрата");
                    shape = new Square(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Введите стороны прямоугольника");
                    shape = new Rectangle(sc.nextInt(), sc.nextInt());
                    break;
                case 4:
                    System.out.println("Введите стороны треугольника");
                    shape = new Triangle(sc.nextInt(), sc.nextInt(),sc.nextInt());
                    break;
                case 5:
                    System.out.println("Завершение работы");
                    checker = false;
                    break;

            }
            if(checker) {
                System.out.println(shape.square());
            }
        }



    }
}
