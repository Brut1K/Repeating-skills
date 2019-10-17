package Homework.HW4;

import java.util.Scanner;

public class Patient {
    private String name;
    private int age;
    private boolean alive;
    public Scanner sc;

    public Patient() {
        sc = new Scanner(System.in);
        System.out.println("Enter patient's name...");
        this.name = sc.next();
        System.out.println("Enter patient's age...");
        this.age = sc.nextInt();
        System.out.println("It is alive?...");
        if(sc.nextInt()==1) {
            this.alive = true;
        } else {
            this.alive =false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void info(){
        System.out.println("Patient name: " + name + ". Patient age: "+ age + ". Patient alive: "+ alive);
    }
}
