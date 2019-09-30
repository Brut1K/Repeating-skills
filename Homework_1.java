public class Homework_1 {


    public static void main(String[] args) {
// #1
        String s = new String("What can i do?");
        System.out.println(s.length());
        System.out.println(s.substring(0,Math.round(s.length()/2)));
        System.out.println(s.substring(Math.round(s.length()/2)));

// #2
        int anynumber= (int)Math.round((Math.random()*Math.random()*10000));
        char ch = Integer.toString(anynumber).charAt(Integer.toString(anynumber).length()-1);
        if(ch=='7'){
            System.out.println(anynumber+"\nLast number 7!!!!");
        }
        else    {
            System.out.println(anynumber);
        }

// #3
        int a = (int) Math.round(Math.random()*20);
        int b = (int) Math.round(Math.random()*20);
        int r = (int) Math.round(Math.random()*35);
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("r="+r);
        if(Math.sqrt(a*a+b*b)<=r){
            System.out.println("Closed");
        }
        else{
            System.out.println("Opened");
        }
// #4
        int money = (int) Math.round(Math.random()*Math.random()*Math.random()*100);
        System.out.println(money);
        char lastsymbol = Integer.toString(money).charAt(Integer.toString(money).length()-1);
        if((money>=10&&money<=20)||lastsymbol=='5'||lastsymbol=='6'
                ||lastsymbol=='7'||lastsymbol=='8'||lastsymbol=='9'||lastsymbol=='0'){
            System.out.println(money + " рублей");
        } else if(lastsymbol=='1'){
            System.out.println(money+ " рубль");
        } else {
            System.out.println(money+ " рубля");
        }
// #5
        String s2 = "alsjdhjasd#(*!&@9712398@#? 131312#asd/1?";
        System.out.println(s2.replace("?","HELLO").replace("#",""));
    }
}
