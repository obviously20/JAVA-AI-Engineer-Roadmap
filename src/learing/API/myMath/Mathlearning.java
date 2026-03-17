package learing.API.myMath;

public class Mathlearning {
    public static void main(String[] args) {
        //public static int abs(int a) //返回参数的绝对值
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-12.94));
        //bug:当abs()参数为int类型时，里面是最小的int值，会返回错误结果
        System.out.println(Math.abs(Integer.MIN_VALUE));
        //所以可以使用absExact()方法来避免这个问题-->如果错误会抛出异常
//        System.out.println(Math.absExact(Integer.MIN_VALUE));
        System.out.println("--------------------------------");

        //public static double ceil(double a) //返回大于或等于参数的最小整数
        //TODO 总之ceil()方法就是向上（向着数轴的正无穷大方向）取整
        System.out.println(Math.ceil(11.23));//12.0
        System.out.println(Math.ceil(11.87));//12.0
        System.out.println(Math.ceil(-12.32));//-12.0
        System.out.println(Math.ceil(-12.87));//-12.0
        System.out.println("--------------------------------");

        //public static double floor(double a) //返回小于或等于参数的最大整数
        //TODO 总之floor()方法就是向下（向着数轴的负无穷大方向）取整
        System.out.println(Math.floor(11.23));//11.0
        System.out.println(Math.floor(11.87));//11.0
        System.out.println(Math.floor(-12.32));//-13.0
        System.out.println(Math.floor(-12.87));//-13.0
        System.out.println("--------------------------------");

        //public static double round(double a) //按照四舍五入的方式返回参数的整数部分
        System.out.println(Math.round(11.23));//11
        System.out.println(Math.round(11.87));//12
        System.out.println(Math.round(-12.32));//12.32->12->加上-号->-12
        System.out.println(Math.round(-12.87));//12.87->13->加上-号->-13
        System.out.println("--------------------------------");

        //max & min
        System.out.println(Math.max(20,20.1));//20.1
        System.out.println(Math.min(20,20.1));//20.0
        System.out.println("--------------------------------");

        //public static double pow(double a, double b) //返回a的b次幂
        System.out.println(Math.pow(2, 4));//16.0
        System.out.println(Math.pow(2, 5));//32.0
        System.out.println(Math.pow(2, -2));//1/2^2=1/4=0.25
        System.out.println(Math.pow(2, -3));//1/2^3=1/8=0.125
        //不建议使用pow()方法来计算负数的次幂，因为结果可能是一个非整数-->pow方法里面最好是使用整数次幂
        //如果要计算平方，建议使用Math.sqrt()方法
        System.out.println(Math.sqrt(4));
        //要计算立方根，建议使用Math.cbrt()方法
        System.out.println(Math.cbrt(8));//2.0
        System.out.println("--------------------------------");

        //public static double random() //返回一个0.0到1.0之间的随机数
        for (int i = 0; i < 10 ; i++) {
            System.out.println(Math.random());
        }
        //前端随机数生成器写法,看得懂
        System.out.println(Math.floor(Math.random()*100)+1);//1-100之间的随机整数
        //Math.random()*100//0.0-99.99999999999999
        //Math.floor(Math.random()*100)//0-99,去尾取整
        //Math.floor(Math.random()*100)+1//1-100



    }
}
