package Homework.HW5;

public class Bankomat {
    private int num20;
    private int num50;
    private int num100;

    public Bankomat(int num20, int num50, int num100) {
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

    public void getInMoney(int value){
        num100 += value/100;
        num50 += (value-value/100)/50;
        num20 += (value-value/100-value/50)/20;
    }
// частное костыльное решение
//    public void getOutMoney(int value){
//        int temp20=0;
//        int temp50=0;
//        int temp100=0;
//        if(value%20==0){
//            temp100 = value/100;
//            temp20 = (value%100)/20;
//        } else {
//            temp50=1;
//            temp100=(value-50)/100;
//            temp20=((value-50)%100)/20;
//        }
//        int[] arr = {temp20, temp50, temp100};
//        for (int i:arr) {
//            System.out.println(i);
//        }
//    }


    // решение в общем виде с рекурсией
    public int[] getOutMoney(int value,int[] nominals,int[] quantity){
        int sum = 0;
        for(int i = 0; i < quantity.length ; i++ ){
            sum+=quantity[i];
        }
        if(sum==0){
           for(int i = 0; i < nominals.length; i++){
               quantity[i] = value/nominals[i];
               value = value-nominals[i]*quantity[i];
           }
           if(value==0){
               for(int z:quantity){
                   System.out.println(z);
               }
               return quantity;
           } else {
               getOutMoney(value,nominals,quantity);
            }
        } else {
            for(int i = nominals.length-2; i>=0;i--){
                if(quantity[i]>0){
                    quantity[i] = quantity[i]-1;
                    quantity[i+1] = quantity[i+1]+1;
                    value = value+nominals[i]-nominals[i+1];
                    for(int k = 0; k < nominals.length; k++){
                        if(value/nominals[k]>0){
                            int temp = value;
                            value = value+nominals[k]*quantity[k];
                            quantity[k] = quantity[k]+ temp/nominals[k];
                            value = value-nominals[k]*quantity[k];
                        }
                    }
                    if(value==0){
                        for(int z:quantity){
                            System.out.println(z);
                        }
                        return quantity;
                    } else {
                        getOutMoney(value,nominals,quantity);
                    }
                }
            }
        }
        return null;
    }


}
