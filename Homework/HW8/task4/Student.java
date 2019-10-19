package Homework.HW8.task4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date bDay;

    public Student(String name, Date bDay) {
        this.name = name;
        this.bDay = bDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getbDay() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(bDay);
    }

    public void setbDay(Date bDay) {
        this.bDay = bDay;
    }

    public void getinfo(){
        System.out.println(name);
        System.out.println(bDay.toString());
    }
}
