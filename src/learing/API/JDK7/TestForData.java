package learing.API.JDK7;

import java.util.Date;
import java.util.Random;

public class TestForData {
    public static void main(String[] args) {
        /*时间计算
        需求1:打印时间原点开始一年之后的时间
        需求2:定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后*/

//        //需求1:打印时间原点开始一年之后的时间
//        //1.创建一个表示时间原点的Date对象,时间原点是1970年1月1日0时0分0秒;0L:表示从时间原点开始的0毫秒
//        Date date1 = new Date(0L);
//        //2.获取时间原点的时间毫秒值
//        long time = date1.getTime();
//        //3.计算一年之后的时间毫秒值1000ms*60s*60m*24h*365d;细节：1000L表示1000毫秒，下面全部计算下来可能超出int的范围，所以用long类型
//        time = time + 1000L * 60 * 60 * 24 * 365;
//        //4.设置时间原点的时间毫秒值为一年之后的时间毫秒值
//        date1.setTime(time);
//        System.out.println(date1);



        //需求2:定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
        //设置随机对象
        Random random = new Random();
        //1.创建两个Date对象
        //细节：Math.abs()方法可以将负数转换为正数;random.nextInt()方法可以生成一个在int范围内的随机数-->生成一个在int范围内的随机正数时间毫秒值
        Date date2 = new Date(Math.abs(random.nextInt()));
        Date date3 = new Date(Math.abs(random.nextInt()));

        //2.拿到两个Date对象的时间毫秒值
        long time2 = date2.getTime();
        long time3 = date3.getTime();


        //3.打印两个Date对象的时间毫秒值
        System.out.println(date2 + "的时间毫秒值为：" + time2);
        System.out.println(date3 + "的时间毫秒值为：" + time3);

        //4.比较两个时间毫秒值的大小
        if(time2 < time3){
            System.out.println(date2 + "在前");
        }else if(time3 < time2){
            System.out.println(date3 + "在前");
        }else {
            System.out.println("两个时间相等");
        }


    }
}
