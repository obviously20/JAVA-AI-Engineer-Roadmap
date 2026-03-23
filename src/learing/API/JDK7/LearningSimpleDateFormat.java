package learing.API.JDK7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LearningSimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        /*`todo java.text.SimpleDateFormat` 是日期/时间格式化类，我们通过这个类可以帮我们完成日期和文本之间的转换,
            也就是可以在Date对象与String对象之间进行来回转换。
            - **格式化**：按照指定的格式，把Date对象转换为String对象。
            - **解析**：按照指定的格式，把String对象转换为Date对象*/

        //DateFormat类的常用方法有：
        //- `public String format(Date date)`：将Date对象格式化为字符串。
        //- `public Date parse(String source)`：将字符串解析为Date对象。
        //public final string format(Date date) 格式化(日期对象 ->字符串)
        //public Date parse(string source) 解析(字符串 ->日期对象)

        //format演示：将Date对象格式化为字符串
        //1.创建一个现在时间对象
        Date date1 = new Date();
        //2.格式化时间对象
        //2.1 创建一个SimpleDateFormat对象(参数：日期时间格式)，参数可以是"yyyy-MM-dd HH:mm:ss"、"yyyy-MM-dd"、"HH:mm:ss"等
        //空参的话就默认使用2026/3/23 下午9:55
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        SimpleDateFormat sdf = new SimpleDateFormat();
        //2.2 调用SimpleDateFormat对象的format方法方法，将时间对象格式化为字符串
        String str = sdf.format(date1);
        System.out.println(str);
        System.out.println("-----------------");

        //parse演示：将字符串解析为Date对象
        //1.创建一个字符串对象
        String str2 = "2026-03-23 15:30:00";
        //2.创建一个SimpleDateFormat对象(参数：日期时间格式)，todo 格式必须与字符串的格式一致
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //3.调用SimpleDateFormat对象的parse方法方法，将字符串解析为Date对象
        Date date2 = sdf2.parse(str2);
        System.out.println(date2);
        System.out.println("------------------");

        /*1
            假设，你初恋的出生年月日为:2000-11-11
            请用字符串表示这个数据，并将其转换为:2000年11月11日

            创建一个Date对象表示2000年11月11日
            创建一个SimpleDateFormat对象，并定义格式为年月日把时间变成:2000年11月11日
        */

        //1.已知的字符串对象
        String str3 = "2000-11-11";
        //2.创建一个SimpleDateFormat对象(参数：日期格式)，todo 格式必须与字符串的格式一致
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        //3.用SimpleDateFormat对象的parse方法方法，将字符串解析为Date对象
        Date date3 = sdf3.parse(str3);
        //4.再新建一个SimpleDateFormat对象-->参数设为题目要求的格式
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy年MM月dd日");
        //5.调用SimpleDateFormat对象的format方法方法，将Date对象格式化为字符串
        String str4 = sdf4.format(date3);
        System.out.println(str4);
        System.out.println("------------------");


        /* 2需求:
            秒杀活动开始时间:2023年11月11日 0:0:0(毫秒值)
            秒杀活动结束时间:2023年11月11日 0:10:0(毫秒值)

            小贾下单并付款的时间为:2023年11月11日 0:01:0
            小皮下单并付款的时间为:2023年11月11日 0:11:0
            用代码说明这两位同学有没有参加上秒杀活动?
         */
        //1.已知的字符串对象
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String order1 = "2023年11月11日 0:01:0";
        String order2 = "2023年11月11日 0:11:0";
        //2.创建SimpleDateFormat对象(参数：日期时间格式)，todo 格式必须与字符串的格式一致
        SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //3.调用SimpleDateFormat对象的parse方法方法，将字符串解析为Date对象
        Date startDate = sdf5.parse(start);
        Date endDate = sdf5.parse(end);
        Date orderDate1 = sdf5.parse(order1);
        Date orderDate2 = sdf5.parse(order2);
        //4.取出时间毫秒值
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime1 = orderDate1.getTime();
        long orderTime2 = orderDate2.getTime();
        //5.判断这两位同学是否参加上秒杀活动
        join(orderTime1, startTime, endTime);
        join(orderTime2, startTime, endTime);


    }

    private static void join(long orderTime, long startTime, long endTime) {
        Date date = new Date(orderTime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str = sdf.format(date);
        if(orderTime >= startTime && orderTime <= endTime){
            System.out.println(str+"参加上秒杀活动");
        }else{
            System.out.println(str+"没有参加上秒杀活动");
        }
    }
}
