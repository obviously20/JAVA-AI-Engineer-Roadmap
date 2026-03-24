package learing.API.JDK7;

import java.util.Calendar;
import java.util.Date;

public class LearningCalendar {
    public static void main(String[] args) {
        /*getTime()方法:将Calendar对象转换为Date对象
        语法:Date date = calendar.getTime();
        说明:将Calendar对象转换为Date对象，返回值为Date类型*/

        /*setTime()方法:将Date对象转换为Calendar对象
        语法:calendar.setTime(date);
        说明:将Date对象转换为Calendar对象，返回值为void*/

        /*getTimeInMillis()方法:将Calendar对象转换为毫秒值
        语法:long millis = calendar.getTimeInMillis();
        说明:将Calendar对象转换为毫秒值，返回值为long类型*/

        /*setTimeInMillis()方法:将毫秒值转换为Calendar对象
        语法:calendar.setTimeInMillis(millis);
        说明:将毫秒值转换为Calendar对象，返回值为void*/

        /*java.util.Calendar类表示一个“日历类”，可以进行日期运算。它是一个抽象类，不能创建对象，我们可以使用它的子类：java.util.GregorianCalendar类。*/
        // 1. 获取当前时间的Calendar对象;根据系统的不同时区获取不同的Calendar对象
        Calendar calendar = Calendar.getInstance();
        //2.创建Date对象
        Date date = calendar.getTime();
//        System.out.println(date);

        //4.设置指定字段的值set
        calendar.set(calendar.YEAR, 2024);
        calendar.set(calendar.MONTH, 8);//9月-->月份从0开始，所以需要-1-->8
        calendar.set(calendar.DAY_OF_MONTH, 1);
        //2024年9月1日

        //5.add
        calendar.add(calendar.DAY_OF_MONTH, 1);
        calendar.add(calendar.MONTH, -1);
        //2024年8月2日

        //3.get()方法获取指定字段的值，返回值为int类型
        //细节1:月份从0开始（1月为0、2月为1、...12月为11），需要+1才能得到正确的月份值
        //细节2:星期从1开始（星期日为1、星期一为2、...星期六为7），得到正确的星期值
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1;
        int day = calendar.get(calendar.DAY_OF_MONTH);
        int week = calendar.get(calendar.DAY_OF_WEEK);
        System.out.println(year + "年" + month + "月" + day + "日" + getWeek(week));



    }

    private static String getWeek(int week) {
        //查表法：
        //细节1:星期从1开始（星期日为1、星期一为2、...星期六为7），得到正确的星期值
        //1.建立一个数组，用于存储星期的名称
        String[] weeks = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return weeks[week];
    }
}
