import java.util.Arrays;

public class Homework_2 {


    public static void main(String[] args) {
// #1
    int[] randomarray = new int[10];
        System.out.println("Generate array of 10 integers...");
    for(int i=0;i<10;i++){
        randomarray[i] = (int)(Math.random()*100);
        System.out.print(randomarray[i] + " ");
    }
    int min = randomarray[0];
    int max = randomarray[0];
    int minindex = 0;
    int maxindex = 0;
    for(int i=0;i<randomarray.length;i++){
        if(min>randomarray[i]){
            min = randomarray[i];
            minindex = i;
        }
        if(max<randomarray[i]) {
            max = randomarray[i];
            maxindex = i;
        }
    }
        System.out.println("\nMin value - " + min);
        System.out.println("Max value - " + max);
        randomarray[minindex] = 0;
        randomarray[maxindex] = 99;
        System.out.println("New array with changed min and max values...");
        for(int i=0;i<10;i++){
            System.out.print(randomarray[i] + " ");
        }

// #2
    float[] arr2 = new float[10];
        System.out.println("\nTask 2. New array generating...");
        for(int i=0;i<10;i++){
            arr2[i] = (int)(Math.random()*10);
            System.out.printf("%.0f ",arr2[i]);
        }

        for(int i=0;i<arr2.length;i++){
            int count = 1;
            boolean checker = true;
            for(int k=i-1;k>=0;k--){
                if(arr2[i]==arr2[k]){
                    checker = false;
                }
            }
            while(checker) {
                for (int j = i + 1; j < arr2.length; j++) {
                    if (arr2[i] == arr2[j]) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.print("\n[" + arr2[i] + "] - повторений " + count);
                }
                checker = false;
            }
        }
// #3
        arraychanger(randomarray);

// #4
        sequence(1234);
        sequence(4123);

// #5
        sort(randomarray);






    }

    // #3
    public static void arraychanger(int[] a){
        int[] b = new int[a.length];
        System.out.print("\nArray: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
            b[b.length-i-1] = a[i];
        }
        System.out.print("\nReversed array: ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+ " ");
        }
        System.out.print("\n");
    }
    // #4
    public static boolean sequence(int a){
        char[] charr = Integer.toString(a).toCharArray();
        for(int i=1 ;i<charr.length;i++){
            if(Integer.valueOf(charr[i-1])>Integer.valueOf(charr[i])){
                System.out.println("Не образуют последовательность");
                return false;
            }
        }
        System.out.println("Образуют последовательность");
        return true;

    }

    //#5

    public static int[] sort(int[] a){
        System.out.println(Arrays.toString(a));
        int temp = 0;
        for(int j=a.length-1;j>0;j--) {
            for (int i = 1; i < j+1; i++) {
                if (a[i - 1] > a[i]) {
                    temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        return a;


    }

}
