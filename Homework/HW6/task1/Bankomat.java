package Homework.HW6.task1;

public interface Bankomat {

    void getInMoney(int value);
    int[] getOutMoney(int value,int[] nominals,int[] quantity);
}
