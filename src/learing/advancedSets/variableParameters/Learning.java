package learing.advancedSets.variableParameters;

public class Learning {
    public static void main(String[] args) {
        // 可变参数:本质上是一个数组,但是可以在方法中使用数组的语法
        // 可以在参数的个数不确定时,使用可变参数
        // 可以参数的个数为0个或多个
        //**好处：**
        //在传递数据的时候，省的我们自己创建数组并添加元素了，JDK底层帮我们自动创建数组并添加元素了


        //可变参数的注意事项:
        //1. 如果有其他参数和可变参数,则可变参数必须放在参数列表的最后面
//        public static void add(int a,int b,int...args){
        //2. 可变参数只能有一个,其他参数可以有多个,但是不能有可变参数
//        public static void add(int...args1,int...args2){-->会报错,因为args1和args2都是可变参数


        int result = add(1,2,3,4,5);
        System.out.println(result);

    }

    public static int add(int...args){
        int sum = 0;
        for (int i :args){
            sum += i;
        }
        return sum;
    }


}
