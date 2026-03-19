package learing.API.myBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class learning {
    public static void main(String[] args) {
        //BigDecimal:为了处理小数的精度问题（float/double）
        //构造方法
//        //直接填小数(double)---->可以看到计算结果是不准确的，因为double类型是二进制的，不能精确表示十进制的小数，所以不推荐使用
//        BigDecimal bd1 = new BigDecimal(0.1);
//        BigDecimal bd2 = new BigDecimal(0.9);
//        BigDecimal bd3 = bd1.add(bd2);
//        System.out.println(bd3);

//        //TODO 在里面输入字符串 ------->在计算需要精确表示小数时，且小数的表示范围超出double类型的范围时，推荐使用BigDecimal构造方法
//        BigDecimal bd1 = new BigDecimal("0.1");
//        BigDecimal bd2 = new BigDecimal("0.9");
//        BigDecimal bd3 = bd1.add(bd2);
//        System.out.println(bd3);//1.0
//
//        //TODO 还有一种是使用静态方法----->在计算需要精确表示小数时，且小数的表示范围在double类型的范围内时，推荐使用valueOf方法
//        BigDecimal bd4 = BigDecimal.valueOf(0.99);
//        BigDecimal bd5 = BigDecimal.valueOf(0.001);
//        BigDecimal bd6 = bd4.add(bd5);
//        System.out.println(bd6);//0.991

        /*
        public BigDecimal add(BigDecimal value)				// 加法运算
        public BigDecimal subtract(BigDecimal value)		// 减法运算
        public BigDecimal multiply(BigDecimal value)		// 乘法运算
        public BigDecimal divide(BigDecimal value)			// 触发运算
        */

        //add
        BigDecimal bd1 = new BigDecimal("10.0");
        BigDecimal bd2 = new BigDecimal("20.0");
        //同样，BigDecimal的对象一旦创建，就不能被修改，在计算时，需要创建一个新的对象来存储计算结果
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);//30.0

        //subtract
        BigDecimal bd4 = bd3.subtract(bd2);
        System.out.println(bd4);//10.0

        //multiply
        BigDecimal bd5 = bd3.multiply(bd4);
        System.out.println(bd5);//300.0

        //另外：在使用BigDecimal.valueOf方法时，只要你传入的是0-10之间的数字，（包含0和10）
        // 就可以直接使用valueOf方法，而不需要使用构造方法，它会返回一个已经创建好的BigDecimal对象-->更加节省内存，更高效
        BigDecimal bd6 = BigDecimal.valueOf(10);
        BigDecimal bd7 = BigDecimal.valueOf(10);
        System.out.println(bd6==bd7);//true，==比较的是地址值


        //divide
        BigDecimal bd8 = BigDecimal.valueOf(10.0);
        BigDecimal bd9 = BigDecimal.valueOf(2.0);
        //普通的（也就是说除得尽的数）用divide方法，会返回一个精确的小数
        BigDecimal bd10 = bd8.divide(bd9);
        System.out.println(bd10);//5.0

        //TODO 如果除不尽，用: 除数.divide(被除数,要保留的小数位数,模式(eg:四舍五入的方式RoundingMode.HALF_UP))
        // -->跟多的模式去查看API帮助文档->BigDecimal类->RoundingMode类
        BigDecimal bd11 = BigDecimal.valueOf(10.0);
        BigDecimal bd12 = BigDecimal.valueOf(3.0);
        BigDecimal bd13 = bd11.divide(bd12,2, RoundingMode.HALF_UP);
        System.out.println(bd13);//3.3333333333333333333333333333333



        //## 底层存储方式：
        //把数据看成字符串，遍历得到里面的每一个字符，把这些字符在ASCII码表上的值，都存储到数组中。








    }
}
