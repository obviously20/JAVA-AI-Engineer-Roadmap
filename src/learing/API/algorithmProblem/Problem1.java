package learing.API.algorithmProblem;

public class Problem1 {
    public static void main(String[] args) {
        /*不死神兔
        有一个很有名的数学逻辑题叫做不死神兔问题，有一对兔子，从出生后第三个月起每个月都生一对兔子小兔子长到第三个月后每个月又生一对兔子，
        假如兔子都不死，问第十二个月的兔子对数为多少?*/

        //画图表示除前6个月的兔子对数变化趋势 1 1 2 3 5 8
        //故本质上该问题是斐波那契数列问题的变种

//        //1.正常解法
//        int[] arr = new int[12];
//        arr[0] = 1;
//        arr[1] = 1;
//        for (int i = 2; i < arr.length; i++) {
//            arr[i] = arr[i-1] + arr[i-2];
//        }
//        System.out.println("第十二个月的兔子对数为：");
//        System.out.println(arr[11]);

        //2.递归解法
        System.out.println("第十二个月的兔子对数为：");
        System.out.println(fibonacci(12));



    }

    public static int fibonacci(int month) {
        //排查异常情况
        if(month<=0 || month>12){
            return -1;
        }

        //递归出口
        if(month==1 || month==2){
            return 1;
        }

        //正常情况
        return  fibonacci(month-1) + fibonacci(month-2);
    }
}
