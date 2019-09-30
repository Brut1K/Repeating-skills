public class MathGenerator {

    double d;

    public MathGenerator() {
        d = 0.0d;
    }

    // возвращает рандомное целое число от 1 до lim
    public int rand(int lim){
        return 1+(int)(Math.random()*lim);
    }

    public int[] generator(int lim){
                 d = Math.random();
                 if(d<=0.25){
                      return summary(lim);
                 } else if(d<=0.5){
                        return decreation(lim);
                 } else if(d<=0.75){
                        return multi(lim);
                 } else {
                        return division(lim);
                 }
    }

    public int[] summary(int lim){
        int a = rand(lim);
        int b = rand(lim);
        int res = a+b;
        int res2 = 0;
        int res3 = 0;
        int res4 = 0;
        while(res2==res3||res2==res4||res3==res4||res==res2||res==res3||res==res4) {
            res2 = (int)Math.round( rand(lim)* 1.7);
            res3 = (int)Math.round( rand(lim)* 1.7);
            res4 = (int)Math.round( rand(lim)* 1.7);
        }
        int[] result = {a,b,res,res2,res3,res4};
        return result;
    }

    public int[] decreation(int lim){
        int a = 0;
        int b = 0;
        while(a<=b){
            a = rand(lim);
            b = rand(lim);
        }
        int res = a-b;
        int res2=0;
        int res3=0;
        int res4=0;
        while(res2==res3||res2==res4||res3==res4||res==res2||res==res3||res==res4){
            res2 = rand(lim)/2;
            res3 = rand(lim)/2;
            res4 = rand(lim)/2;
        }
        int[] result = {a,b,res,res2,res3,res4};
        return result;
    }

    public int[] multi(int lim){
        int a = rand(lim);
        int b = rand(lim);
        int res = a*b;
        int res2 = a*rand(lim);
        int res3 = b*rand(lim);
        int res4 = rand(lim)*rand(lim);
        while (res2==res3||res2==res4||res3==res4||res==res2||res==res3||res==res4){
            res2 = a*rand(lim);
            res3 = b*rand(lim);
            res4 = rand(lim)*rand(lim);
        }
        int[] result = {a,b,res,res2,res3,res4};
        return result;
    }

    public int[] division(int lim){
        int res = rand(lim);
        int b = rand(lim);
        int a = res*b;
        int res2 = rand(lim);
        int res3 = rand(lim);
        int res4 = rand(lim);
        while (res2==res3||res2==res4||res3==res4||res==res2||res==res3||res==res4){
            res2 = rand(lim);
            res3 = rand(lim);
            res4 = rand(lim);
        }
        int[] result = {a,b,res,res2,res3,res4};
        return result;
    }
}
