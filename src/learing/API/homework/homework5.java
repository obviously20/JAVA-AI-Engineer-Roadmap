package learing.API.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class homework5 {
    public static void main(String[] args) throws ParseException {
        /*需求：
        判断任意的一个年份是闰年还是平年要求:用JDK7和JDK8两种方式判断提示:二月有29天是闰年一年有366天是闰年*/

        //jdk7方式:
        //思路1：先得出该年的2月有多少天：
        // 2/1 00：00：00
        // 3/1 00：00：00
        //再算出2月有多少天
        //如果2月有多少天是29天，就是闰年
        //如果2月有多少天是28天，就是平年

        String yearStr1 = "2000-02-01 00:00:00";
        String yearStr2 = "2000-03-01 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = sdf.parse(yearStr1);
        Date date2 = sdf.parse(yearStr2);
        long time = date2.getTime() - date1.getTime();
        long dayFrom2 = time / (24 * 60 * 60 * 1000);
        System.out.println("2月有" + dayFrom2 + "天");
        if (dayFrom2 == 29) {
            System.out.println("2月有29天，是闰年");
        } else {
            System.out.println("2月有28天，是平年");
        }

//        //思路2
//        //jdk7
//        //我们可以把时间设置为2000年3月1日
//        Calendar c = Calendar.getInstance();
//        c.set(2000, 2, 1);
//        //月份的范围:0~11
//        //再把日历往前减一天
//        c.add(Calendar.DAY_OF_MONTH, -1);
//        //看当前的时间是28号还是29号?
//        int day = c.get(Calendar.DAY_OF_MONTH);
//        System.out.println(day);

        //思路3
        //也可以把第二年的开始1/1减去1天，得到的天数就是该年的天数
        //如果该年的天数是366天，就是闰年
        //如果该年的天数是365天，就是平年

        //思路4：
        //可以用要判断的年的开始2020/1/1 和 结束 2021/1/1 来判断
        //如果2020/1/1到2021/1/1的天数是366天，就是闰年
        //如果2020/1/1到2021/1/1的天数是365天，就是平年

//        //jdk8方式:思路2
//        LocalDate monthStart = LocalDate.of(2000, 2, 1);
//        LocalDate monthEnd = LocalDate.of(2000, 3, 1);
//        long dayFrom28 = ChronoUnit.DAYS.between(monthStart, monthEnd);
//        System.out.println("2月有" + dayFrom28 + "天");


        //思路2
        //jdk8
        //月份的范围:1~12
        //设定时间为2000年的3月1日
        LocalDate ld = LocalDate.of(2000, 3, 1);
        //把时间往前减一天
        LocalDate ld2 = ld.minusDays(1);
        //获取这一天是一个月中的几号
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);


        //自带的方法：isLeapYear()
        //true:闰年
        //false:平年
        System.out.println(ld.isLeapYear());


    }
}
