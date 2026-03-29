package learing.API.algorithmProblem;

public class Problem2 {
    public static void main(String[] args) {
        /*有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个!
        以后每天猴子都吃当前剩下来的一半，然后再多吃一个，
        第10天的时候(还没吃)，发现只剩下一个桃子了，请问，最初总共多少个桃子?*/

        //F(10) == 1
        //F(9) =(F(10)+1)*2   4
        //F(8) =(F(9)+1)*2   10
        //F(7) =(F(8)+1)*2   22
        //...
        //F(1) =(F(2)+1)*2

        //递归解法
        System.out.println("最初总共多少个桃子为：");
        System.out.println(fibonacci(1));
    }
    public static int fibonacci(int day) {
        //递归出口
        if(day == 10){
            return 1;
        }
        //eg:F(9) =(F(9+1)+1)*2   4
        return (fibonacci(day+1)+1)*2;
    }
}
