package Homework.HW5;

public class Homework_5 {

    public static void main(String[] args) {
        Bankomat bm = new Bankomat(20,20,20);
        int[] nominals = {70,50,30,4,3};
        int[] quantity = {0,0,0,0,0};


 //      bm.getOutMoney(41);
        bm.getOutMoney(12653,nominals,quantity);
//
//        bm.getOutMoney(100);
//        bm.getOutMoney(100,nominals,quantity);
//        bm.getOutMoney(1230);
//        bm.getOutMoney(1230,nominals,quantity);
    }
}
