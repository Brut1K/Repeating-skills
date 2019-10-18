package Homework.HW6.task1;

public abstract class BankomatUniversal implements Bankomat {
    @Override
    public int[] getOutMoney(int value, int[] nominals, int[] quantity) {
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
