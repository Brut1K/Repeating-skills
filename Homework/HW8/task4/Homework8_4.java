package Homework.HW8.task4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Homework8_4 {

    public static void main(String[] args) {

        try  {
            FileReader fileReader = new FileReader("src\\homework\\HW8\\task4\\students.txt");
            char[] buf = new char[256];
            StringBuilder s = new StringBuilder();
            int c = 0;
            while((c=fileReader.read(buf))>0){
                if(c<256){
                    buf = Arrays.copyOf(buf,c);
                }
                s.append(buf);
            }
            String s2 = s.toString();
            s2 = s2.replace("Name:","#");
            s2 = s2.replace("Birthday","@");
            Student[] arr =  new Student[3];
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            for(int i =0;i<arr.length;i++){
                arr[i] = new Student(s2.substring(s2.indexOf("#")+2,s2.indexOf("@")-2),sdf.parse(s2.substring(s2.indexOf("@")+3,
                        s2.indexOf("\n"))));
                arr[i].getinfo();
                s2 = s2.substring(s2.indexOf("\n")+1);
            }


        } catch (FileNotFoundException e){
            Student[] st =  new Student[3];
            StudentBuilder sb = new StudentBuilder();
            for(int i = 0; i<3;i++){
                st[i] = sb.getStudent();
            }


            try {
                FileWriter fileWriter = new FileWriter("src\\homework\\HW8\\task4\\students.txt",false);
                for(int i = 0; i<st.length;i++){
                    fileWriter.write("Name: " + st[i].getName() + ". Birthday: " + st[i].getbDay()+"\n");
                }
                fileWriter.flush();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } catch (IOException e){
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("You enter birthday in a wrong format");
        }






    }
}
