package learing.API.algorithmProblem;

public class Problem3 {
    public static void main(String[] args) {
        /*爬楼梯
        可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶。
        如果这个楼梯有20个台阶，小明一共有多少种爬法呢?
        运算结果:
        1层台阶:1种爬法
        2层台阶:2种爬法
        7层台阶:21种爬法*/

        //思路：假设我有一个方法F(n)可以计算出n层台阶的爬法数量
        //那我现在已经到了第19层台阶，我要上第20层台阶 ，有1种爬法
        //那我现在在第18层台阶，我要上第20层台阶 ，只有1种爬法，
        // 因为一次爬一个台阶的那个方式到第19层台阶，再爬一个台阶到第20层台阶，而这个方法又与F(19)相同，不能重复计算
        //所以只能是一次爬两个台阶 --1种爬法
        //故F(20) = F(19) + F(18)

        //递归解法
        System.out.println("小明一共有多少种爬法为：");
        System.out.println(fibonacci1(20));
    }

    private static int fibonacci1(int i) {
        //递归出口
        if(i == 1){
            return 1;
        }else if(i == 2){
            return 2;
        }
        //正常情况
        return fibonacci1(i-1)+fibonacci1(i-2);
    }
}
