package Homework.HW7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Homework_7 {

    public static void main(String[] args) {

        Student[] arr =  new Student[3];
        Scanner sc = new Scanner(System.in);
        String name;
        Date date;
        boolean checker = true;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        for(int i = 0; i<arr.length;i++){
            System.out.println("Enter student's name");
            name = sc.next();
            checker = true;
            while(checker) {
                System.out.println("Enter student's birthday in format 2001-01-28");
                try {
                    date = sdf.parse(sc.next());
                    checker = false;
                    arr[i] = new Student(name,date);
                } catch (ParseException e) {
                    System.out.println("You enter birthday in wrong format");
                }
            }
        }
        averageAge(arr);
    }

    public static void averageAge(Student[] arr){
        Date date =  new Date();
        long sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum+= date.getTime()-arr[i].bDay.getTime();
        }
        sum /=3;
        date = new Date(sum);
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String s = sdf.format(date);
        s = s.substring(0,4);
        int k = Integer.valueOf(s) - 1970;
        s = sdf.format(date).substring(5);
        System.out.println(k+" years " +s.substring(0,2)+" month "+s.substring(3,5)+ " days "+s.substring(6,8)+ " hours "
                +s.substring(9,11)+ " minutes " +s.substring(12,14) + " seconds");

    }
}
