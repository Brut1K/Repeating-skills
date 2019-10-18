package Homework.HW6.task1;

public class BankomatBSB extends BankomatUniversal implements BankCash,BankDeveloper {

    private int num20;
    private int num50;
    private int num100;

    public BankomatBSB(int num20, int num50, int num100) {
        this.num20 = num20;
        this.num50 = num50;
        this.num100 = num100;
    }

    public int getNum20() {
        return num20;
    }

    public void setNum20(int num20) {
        this.num20 = num20;
    }

    public int getNum50() {
        return num50;
    }

    public void setNum50(int num50) {
        this.num50 = num50;
    }

    public int getNum100() {
        return num100;
    }

    public void setNum100(int num100) {
        this.num100 = num100;
    }
    @Override
    public void getInMoney(int value) {
        num100 += value/100;
        num50 += (value-value/100)/50;
        num20 += (value-value/100-value/50)/20;
    }

    @Override
    public int cashInCase() {
        return 100*num100+50*num50+20*num20;
    }

    @Override
    public String developerName() {
        return "Hz GMBH";
    }

    @Override
    public int serialNubmer() {
        return 54321;
    }
}
