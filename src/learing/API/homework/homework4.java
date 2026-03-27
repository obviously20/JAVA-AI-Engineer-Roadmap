package learing.API.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;

public class homework4 {
    public static void main(String[] args) throws ParseException {
        /*需求：
        请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成*/

        //JDK7方式
        //先要有我的出生日期
        String birthDateStr = "2005-08-29";
        //将字符串转换位Date类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //将字符串转换位Date类型
        Date birthDate = sdf.parse(birthDateStr);
        //得到生日时的毫秒值
        long birthTime = birthDate.getTime();
        //得到当前时间的毫秒值
        long currentTime = System.currentTimeMillis();
        //计算出你活了多少天
        long days = (currentTime - birthTime)/1000/60/60/24;
        //输出结果
        System.out.println("You活了" + days + "天");

        //jdk8方式
        LocalDate birthDate8 = LocalDate.of(2005, 8, 29);
        LocalDate nowday = LocalDate.now();
        //计算出你活了多少天
        long day8 = ChronoUnit.DAYS.between(birthDate8, nowday);//后减前
        //输出结果
        System.out.println("You活了" + day8 + "天");












    }
}
