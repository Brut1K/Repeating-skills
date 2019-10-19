package Homework.HW8.task4;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentBuilder {

    public StudentBuilder() {
    }

    public Student getStudent(){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        boolean checker = true;
        String name = "";
        Date bDay = new Date();
        while(checker){
            System.out.println("Enter student's name");
            name = sc.next();
            System.out.println("Enter student's birthday in format 2001-12-31");
            try {
                bDay = sdf.parse(sc.next());
                checker = false;
            } catch (ParseException e) {
                System.out.println("You enter birthday in a wrong format");
            }
        }
        return new Student(name,bDay);
    }
}
