package learing.API.myBigInteger;

import java.math.BigInteger;
import java.util.Random;

public class learning {
    public static void main(String[] args) {
//        public BigInteger(int num, Random rnd) 		//获取随机大整数，范围：[0 ~ 2的num次方-1]
//        public BigInteger(String val) 				//获取指定的大整数
//        public BigInteger(String val, int radix) 	//获取指定进制的大整数

        // 下面这个不是构造，而是一个静态方法获取BigInteger对象
//        public static BigInteger valueOf(long val) 	//静态方法获取BigInteger的对象，内部有优化

//        BigInteger bigInteger = new BigInteger(4, new Random());//0-2^4-1-->0-15
//        System.out.println(bigInteger);

//        //细节:字符串中必须是整数，否则会报错
//        BigInteger bigInteger = new BigInteger("99999999999999999999");
//        System.out.println(bigInteger);

//        //细节:
//        //1.字符串中的数字必须是整数
//        //2.字符串中的数字必须要跟进制吻合。
//        //比如二进制中，那么只能写0和1，写其他的就报错。
//        BigInteger bigInteger = new BigInteger("100",2);
//        //获取二进制的大整数100-->4
//        System.out.println(bigInteger);
//        BigInteger bigInteger2 = new BigInteger("100",10);
//        //获取十进制的大整数100-->100
//        System.out.println(bigInteger2);

//        //静态方法
//        //细节:
//        //1.能表示范围比较小，只能在long的取值范围之内，如果超出long的范围就不行了。
//        //2.在内部对常用的数字: -16 ~ 16 进行了优化。
//        //  提前把-16~16 先创建好BigInteger的对象，如果多次获取不会重新创建新的。
//        BigInteger bigInteger3 = BigInteger.valueOf(Long.MAX_VALUE);//9223372036854775807
//        // -->超过Long最大值的话，会报错-->需要使用BigInteger(String val)方法
//        //获取最大长整数
//        System.out.println(bigInteger3);

//        //BigInteger只要进行计算，就会产生一个新的BigInteger对象，且不会改变原对象的值。
//        BigInteger b1 = new BigInteger("1");
//        BigInteger b2 = new BigInteger("2");
//        BigInteger b3 = b1.add(b2);
//        System.out.println(b3);
//        System.out.println(b1);
//        System.out.println(b2);

        /*TODO 构造方法小结：
         * 如果BigInteger表示的数字没有超出long的范围，可以用静态方法获取。
         * 如果BigInteger表示的超出long的范围，可以用构造方法获取。
         * 对象一旦创建，BigInteger内部记录的值不能发生改变。
         * 只要进行计算都会产生一个新的BigInteger对象*/


        /*常见的方法有：
        public BigInteger add(BigInteger val)					//加法
        public BigInteger subtract(BigInteger val)				//减法
        public BigInteger multiply(BigInteger val)				//乘法
        public BigInteger divide(BigInteger val)				//除法
        public BigInteger[] divideAndRemainder(BigInteger val)	 //除法，获取商和余数
        public  boolean equals(Object x) 					    //比较是否相同
        public  BigInteger pow(int exponent) 					//次幂、次方
        public  BigInteger max/min(BigInteger val) 				//返回较大值/较小值
        public  int intValue(BigInteger val) 					//转为int类型整数，超出范围数据有误*/

        //加法add
        BigInteger b1 = new BigInteger("10");
        BigInteger b2 = new BigInteger("2");
        BigInteger b3 = b1.add(b2);
        System.out.println(b3);//12

        //sub
        BigInteger b4 =b1.subtract(b2);
        System.out.println(b4);//8

        //mul
        BigInteger b5 = b1.multiply(b2);
        System.out.println(b5);//20

        //div:除法，获取商
        BigInteger b6 = b1.divide(b2);
        System.out.println(b6);//5

        //divideAndRemainder:除法，获取商和余数
        BigInteger[] b7 = b1.divideAndRemainder(b2);
        System.out.println(b7[0]);//5
        System.out.println(b7[1]);//0

        //equals:比较是否相同-->重写equals方法，比较的是对象的值，而不是引用。
        System.out.println(b1.equals(b2));//false

        //pow:次幂、次方
        BigInteger b8 = b1.pow(2);
        System.out.println(b8);//100

        //max/min:返回较大值/较小值
        BigInteger b9 = b1.max(b2);//10
        System.out.println(b1.min(b2));//2
        //且在 -16 ~ 16 之间，会直接返回int类型整数，且不会创建新的对象-->优化了类型整数
        System.out.println(b1.equals(b9));//true
        System.out.println(b2.equals(b9));//false

        //intValue:转为int类型整数，超出范围数据有误
        System.out.println(b1.intValue());//10
        System.out.println(b2.intValue());//2
        System.out.println(b1.doubleValue());//10.0
        System.out.println(b2.doubleValue());//2.0


    }
}
