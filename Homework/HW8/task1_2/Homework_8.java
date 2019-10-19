package Homework.HW8.task1_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework_8 {

    public static void main(String[] args) {

        boolean checker = true;

        while (checker) {
            System.out.println("Choose your operation: \n1. +  \n2. -  \n3. *  \n4. \\  \n5. exit programm");
                   try{
            switch (numberReader()) {
                case 1:
                    System.out.println("Enter two numbers than you want add");
                    System.out.println("result = "+(numberReader()+numberReader()));
                    break;
                case 2:
                    System.out.println("Enter two numbers than you want substring");
                    System.out.println("result = "+(numberReader()-numberReader()));
                    break;
                case 3:
                    System.out.println("Enter two numbers than you want multiply");
                    System.out.println("result = "+numberReader()*numberReader());
                    break;
                case 4:
                    System.out.println("Enter two numbers than you want division");
                    System.out.println("result = "+numberReader()/numberReader());
                    break;
                case 5:
                    checker = false;
                    break;

            }

        } catch (InputMismatchException e){
                       System.out.println("You enter uncorrect symbol, please try again");
  //                     numberReader();
        } catch (ArithmeticException e){
                       System.out.println("It's operation incorrect");
        } catch (ThirdteenException e){
                       System.out.println(e.getRussianMessage());
                   }



            }
        }

        public static int numberReader(){
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            if(k==13){
                throw new ThirdteenException();
            }
            return k;
        }
}
