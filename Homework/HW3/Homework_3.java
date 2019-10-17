package Homework.HW3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_3 {

    public static void main(String[] args) {
// #1
        int[] arr = inputArr(); //вводим все значения массива с клавиатуры
        pOut(arr); // выводим все значения массива в консоль
        int[] arr2 = selectionSort(arr); //сортировка выбором
        pOut(arr2);
        int[] arr3 = bubbleSort(arr);  // сортировка пузырьком
        pOut(arr3);
        int[] arr4 = insertionSort(arr);   // сортировка вставками
        pOut(arr4);

// #2
        System.out.println(lists(244));
        System.out.println(lists(240));
        System.out.println(lists(24));

    }




    public static int[] inputArr(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void pOut(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print("\""+arr[i]+"\"");
            if(i!=arr.length-1){
                System.out.print(" | ");
            } else {
                System.out.println("\n");
            }
        }
    }

    public static int[] selectionSort(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                  temp = arr[i];
                  arr[i]= arr[j];
                  arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr){
        int temp;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                while(arr[j]<arr[j-1]&&j>0){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                    j =j-1;
                }
            }
        }
        return  arr;
    }


    public static int lists(int news){
        if(news%10==0) {
            return news / 10;
        } else {
            return news/10+1;
        }
    }
}
