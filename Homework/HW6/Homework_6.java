package Homework.HW6;

import java.util.Arrays;

public class Homework_6 {

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for(int i = 0; i<arr1.length;i++){
            arr1[i] = (int)(Math.random()*10);
        }
        int[] arr2 = new int[20];
        for(int i = 0; i<arr2.length;i++){
            arr2[i] = (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.arraycopy(arr1,0,arr2,5,10);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

}
