package Homework.HW7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileReadWrite {

    public static void main(String[] args) {
 //запись в текстовый файл
        try {
            FileWriter writer = new FileWriter("src\\homework\\HW7\\sample.txt",false);
            // append true or false means that writing in the end or rewrite file
            String text = "Abracadabra";
            writer.write(text);
            writer.append("\n");
            writer.append("q");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

// read byte by byte
        try {
            FileReader reader = new FileReader("src\\homework\\HW7\\sample.txt");
            int c;
            while((c=reader.read())!=-1){
                System.out.println((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//read by 256byte once
        try {
            FileReader reader2 = new FileReader("src\\homework\\HW7\\sample.txt");
            char[] buf = new char[256];
            int c;
            while((c=reader2.read(buf))>0){
                if(c<256){
                    buf = Arrays.copyOf(buf,c);
                }
                System.out.println(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
