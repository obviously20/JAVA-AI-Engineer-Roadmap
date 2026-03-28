package learing.API.sort;

public class Recursion {
    public static void main(String[] args) {
        //1.用递归求1~100的和
        //100+99+98+...+2+1=5050
        //100+(1-99)
        //99+(1-98)
        //...
        //2+(1-1)---->2+1=3
        //return 1
        int sum = getsum1(100);
        System.out.println(sum);


        //2。用递归求一个数的阶乘eg：5！
        //5!=5*4*3*2*1=120
        //5!=5*4!
        //4!=4*3!
        //3!=3*2!
        //2!=2*1!
        //1!=1
        //return 1
        int factorial = getfactorial(5);
        System.out.println(factorial);


    }

    private static int getfactorial(int num) {
        if(num == 1){
            return 1;
        }
        return num * getfactorial(num -1);
    }

    private static int getsum1(int num) {
        if(num == 1){
            return 1;
        }

        return num +getsum1(num-1);


    }
}
