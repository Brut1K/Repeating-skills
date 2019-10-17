package Homework.HW4;

import java.util.Scanner;

public class Homework_4 {

    public static void main(String[] args) {
        Patient[] arr =  new Patient[3];
        Patient patient1 = new Patient();
        Patient patient2 = new Patient();
        Patient patient3 = new Patient();
        patient1.info();
        patient2.info();
        patient3.info();
        arr[0] = patient1;
        arr[1] = patient2;
        arr[2] = patient3;
        search(arr);

    }

    private static void search(Patient[] arrP){
        Scanner sc = new Scanner(System.in);
        boolean checker = true;
        while(checker) {
            System.out.println("Хотите найти пациента по имени(1) или возрасту(2), закончить поиск(3)?");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Введите имя пациента");
                    String name = sc.next();
                    for (Patient p : arrP) {
                        if (p.getName().equals(name)) {
                            p.info();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Введите возраст пациента");
                    int age = sc.nextInt();
                    for (Patient p : arrP) {
                        if (p.getAge() == age) {
                            p.info();
                        }
                    }
                    break;
                case 3:
                    checker = false;
                    break;
                default:
                    System.out.println("Вы выбрали некорректную операцию");
                    break;
            }
        }
    }
}
