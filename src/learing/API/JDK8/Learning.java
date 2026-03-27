package learing.API.JDK8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Learning {
    public static void main(String[] args) {
        /*TODO ZoneId 时区*/
        /* static Set<string> getAvailableZoneIds() 获取Java中支持的所有时区
            static ZoneId systemDefault() 获取系统默认时区
            static Zoneld of(string zoneld) 获取一个指定时区*/

        // 获取Java中支持的所有时区
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        // 获取系统默认时区
        ZoneId systemDefault = ZoneId.systemDefault();
        System.out.println(systemDefault);

        // 获取一个指定时区
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        System.out.println(zoneId);

        System.out.println("----------------------------------");

        /*todo Instant 时间戳*/
        /*
            static Instant now() 获取当前时间的Instant对象(标准时间)
            static Instant ofXxxx(long epochMilli) 根据(秒/毫秒/纳秒)获取Instant对象
            ZonedDateTime atZone(ZoneId zone) 指定时区
            boolean isxxx(Instant otherInstant) 判断系列的方法
            Instant minusXxx(long millisToSubtract) 减少时间系列的方法
            Instant plusXxx(long millisToSubtract) 增加时间系列的方法
        */

        // 获取当前时间的Instant对象(标准时间)
        Instant now = Instant.now();
        System.out.println(now);//2026-03-27T09:51:45.984940400Z

        //根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant = Instant.ofEpochMilli(1674531200000L);//根据毫秒获取Instant对象
        System.out.println(instant);//2023-01-24T03:33:20Z

        Instant instant2 = Instant.ofEpochSecond(1667453120L);//根据秒获取Instant对象
        System.out.println(instant2);//2022-11-03T05:25:20Z

        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);//根据秒和纳秒获取Instant对象
        System.out.println(instant3);//1970-01-01T00:00:00.000000002Z

        //指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);//2026-03-27T18:05:20.077977800+08:00[Asia/Shanghai]

        // 判断系列的方法
        Instant instant4 = Instant.ofEpochMilli(0L);//0L毫秒
        System.out.println(instant4);
        Instant instant5 = Instant.ofEpochSecond(2L);//2L秒
        System.out.println(instant5);

        // 判断是否在指定时间之前
        boolean isBefore = instant4.isBefore(instant5);
        System.out.println(isBefore);//true

        // 判断是否在指定时间之后
        boolean isAfter = instant4.isAfter(instant5);
        System.out.println(isAfter);//false

        // 减少时间系列的方法
        Instant instant6 = instant5.minusMillis(1000L);//减少1000毫秒
        System.out.println(instant6);//1970-01-01T00:00:01Z

        // 增加时间系列的方法
        Instant instant7 = instant4.plusMillis(1000L);//增加1000毫秒
        System.out.println(instant7);//1970-01-01T00:00:01Z

        System.out.println("----------------------------------");

        /*todo  ZoneDateTime  带时区的时间*/
        /*
            static ZonedDateTime now() 获取当前时间的ZonedDateTime对象
            static ZonedDateTime ofXxxx(。。。) 获取指定时间的ZonedDateTime对象
            ZonedDateTime withXxx(时间) 修改时间系列的方法
            ZonedDateTime minusXxx(时间) 减少时间系列的方法
            ZonedDateTime plusXxx(时间) 增加时间系列的方法
         */

        //1.获取当前时间对象(带时区)
        ZonedDateTime time1 = ZonedDateTime.now();
        System.out.println(time1);//2026-03-27T18:15:37.578285800+08:00[Asia/Shanghai]

        //2.获取指定时间对象(带时区)
        ZonedDateTime time2 = ZonedDateTime.of(2026, 3, 27, 18, 15, 37, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time2);

        //3.修改时间系列的方法
        ZonedDateTime time3 = time2.withHour(7);
        System.out.println(time3);//2026-03-27T07:15:37.000000000+08:00[Asia/Shanghai]

        //4.减少时间系列的方法
        ZonedDateTime time4 = time3.minusHours(1);
        System.out.println(time4);//2026-03-27T06:15:37.000000000+08:00[Asia/Shanghai]

        //5.增加时间系列的方法
        ZonedDateTime time5 = time4.plusHours(1);
        System.out.println(time5);//2026-03-27T07:15:37.000000000+08:00[Asia/Shanghai]

        System.out.println("----------------------------------");

        /*todo DateTimeFormatter   用于时间的格式化和解析*/
        /*
            static DateTimeFormatter ofPattern(格式) 获取格式对象
            String format(时间对象) 按照指定方式格式化
        */

        //1.获取格式对象
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //2.按照指定方式格式化
        String formatted = formatter.format(time5);
        System.out.println(formatted);//2026-03-27 07:15:37.000000000[Asia/Shanghai]

        System.out.println("----------------------------------");

        /*todo JDK8 创建的对象都是不可变的，不能被修改，只能创建新的对象。*/

        /*todo LocalDate  年、月、日*/
        //1.获取当前时间的日历对象(包含 年月日)
        LocalDate nowDate = LocalDate.now();
//System.out.println("今天的日期:" + nowDate);
//2.获取指定的时间的日历对象
        LocalDate ldDate = LocalDate.of(2023, 1, 1);
        System.out.println("指定日期:" + ldDate);

        System.out.println("=============================");

//3.get系列方法获取日历中的每一个属性值//获取年
        int year = ldDate.getYear();
        System.out.println("year: " + year);
//获取月//方式一:
        Month m = ldDate.getMonth();
        System.out.println(m);
        System.out.println(m.getValue());

//方式二:
        int month = ldDate.getMonthValue();
        System.out.println("month: " + month);


//获取日
        int day = ldDate.getDayOfMonth();
        System.out.println("day:" + day);

//获取一年的第几天
        int dayofYear = ldDate.getDayOfYear();
        System.out.println("dayOfYear:" + dayofYear);

//获取星期
        DayOfWeek dayOfWeek = ldDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue());

//is开头的方法表示判断
        System.out.println(ldDate.isBefore(ldDate));
        System.out.println(ldDate.isAfter(ldDate));

//with开头的方法表示修改，只能修改年月日
        LocalDate withLocalDate = ldDate.withYear(2000);
        System.out.println(withLocalDate);

//minus开头的方法表示减少，只能减少年月日
        LocalDate minusLocalDate = ldDate.minusYears(1);
        System.out.println(minusLocalDate);


//plus开头的方法表示增加，只能增加年月日
        LocalDate plusLocalDate = ldDate.plusDays(1);
        System.out.println(plusLocalDate);

//-------------
// 判断今天是否是你的生日
        LocalDate birDate = LocalDate.of(2000, 1, 1);
        LocalDate nowDate1 = LocalDate.now();

        MonthDay birMd = MonthDay.of(birDate.getMonthValue(), birDate.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(nowDate1);

        System.out.println("今天是你的生日吗? " + birMd.equals(nowMd));//今天是你的生日吗?

        System.out.println("----------------------------");

        /*todo LocalTime  时、分、秒*/
        // 获取本地时间的日历对象。(包含 时分秒)
        LocalTime nowTime = LocalTime.now();
        System.out.println("今天的时间:" + nowTime);

        int hour = nowTime.getHour();//时
        System.out.println("hour: " + hour);

        int minute = nowTime.getMinute();//分
        System.out.println("minute: " + minute);

        int second = nowTime.getSecond();//秒
        System.out.println("second:" + second);

        int nano = nowTime.getNano();//纳秒
        System.out.println("nano:" + nano);
        System.out.println("------------------------------------");
        System.out.println(LocalTime.of(8, 20));//时分
        System.out.println(LocalTime.of(8, 20, 30));//时分秒
        System.out.println(LocalTime.of(8, 20, 30, 150));//时分秒纳秒
        LocalTime mTime = LocalTime.of(8, 20, 30, 150);

//is系列的方法
        System.out.println(nowTime.isBefore(mTime));
        System.out.println(nowTime.isAfter(mTime));

//with系列的方法，只能修改时、分、秒
        System.out.println(nowTime.withHour(10));

//plus系列的方法，只能修改时、分、秒
        System.out.println(nowTime.plusHours(10));

        System.out.println("----------------------------------");

        /*todo LocalDateTime  年、月、日、时、分、秒*/
        // 当前时间的的日历对象(包含年月日时分秒)
        LocalDateTime nowDateTime = LocalDateTime.now();

        System.out.println("今天是:" + nowDateTime);//今天是：
        System.out.println(nowDateTime.getYear());//年
        System.out.println(nowDateTime.getMonthValue());//月
        System.out.println(nowDateTime.getDayOfMonth());//日
        System.out.println(nowDateTime.getHour());//时
        System.out.println(nowDateTime.getMinute());//分
        System.out.println(nowDateTime.getSecond());//秒
        System.out.println(nowDateTime.getNano());//纳秒
// 日:当年的第几天
        System.out.println("dayofYear:" + nowDateTime.getDayOfYear());
//星期
        System.out.println(nowDateTime.getDayOfWeek());
        System.out.println(nowDateTime.getDayOfWeek().getValue());
//月份
        System.out.println(nowDateTime.getMonth());
        System.out.println(nowDateTime.getMonth().getValue());

        LocalDate ld = nowDateTime.toLocalDate();
        System.out.println(ld);//2026-03-27

        LocalTime lt = nowDateTime.toLocalTime();
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());

        System.out.println("----------------------------");



        /*工具类*/
        /*Duration  时间间隔（秒，纳，秒）*/
        // 本地日期时间对象。
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

// 出生的日期时间对象
        LocalDateTime birthDate = LocalDateTime.of(2000, 1, 1, 0, 0, 0);
        System.out.println(birthDate);

        Duration duration = Duration.between(birthDate, today);//第二个参数减第一个参数
        System.out.println("相差的时间间隔对象:" + duration);

        System.out.println("============================================");
        System.out.println(duration.toDays());//两个时间差的天数
        System.out.println(duration.toHours());//两个时间差的小时数
        System.out.println(duration.toMinutes());//两个时间差的分钟数
        System.out.println(duration.toMillis());//两个时间差的毫秒数
        System.out.println(duration.toNanos());//两个时间差的纳秒数
        System.out.println("----------------------------");

        /*Period  时间间隔（年，月，日）*/
        // 当前本地 年月日
        LocalDate today1 = LocalDate.now();
        System.out.println(today1);

// 生日的 年月日
        LocalDate birthDate1 = LocalDate.of(2000, 1, 1);
        System.out.println(birthDate1);

        Period period = Period.between(birthDate1, today1);//第二个参数减第一个参数

        System.out.println("相差的时间间隔对象:" + period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println(period.toTotalMonths());

        System.out.println("----------------------------------");

        /*todo ChronoUnit  时间间隔（所有单位）----重点 */


        // 当前时间
        LocalDateTime today2 = LocalDateTime.now();
        System.out.println(today2);
        // 生日时间
        LocalDateTime birthDate2 = LocalDateTime.of(2000, 1, 1,0, 0, 0);
        System.out.println(birthDate2);

        System.out.println("相差的年数:" + ChronoUnit.YEARS.between(birthDate, today));
        System.out.println("相差的月数:" + ChronoUnit.MONTHS.between(birthDate, today));
        System.out.println("相差的周数:" + ChronoUnit.WEEKS.between(birthDate, today));
        System.out.println("相差的天数:" + ChronoUnit.DAYS.between(birthDate, today));
        System.out.println("相差的时数:" + ChronoUnit.HOURS.between(birthDate, today));
        System.out.println("相差的分数:" + ChronoUnit.MINUTES.between(birthDate, today));
        System.out.println("相差的秒数:" + ChronoUnit.SECONDS.between(birthDate, today));
        System.out.println("相差的毫秒数:" + ChronoUnit.MILLIS.between(birthDate, today));//毫秒数
        System.out.println("相差的微秒数:" + ChronoUnit.MICROS.between(birthDate, today));//微秒数
        System.out.println("相差的纳秒数:" + ChronoUnit.NANOS.between(birthDate, today));//纳秒数
        System.out.println("相差的半天数:" + ChronoUnit.HALF_DAYS.between(birthDate, today));//半天数
        System.out.println("相差的十年数:" + ChronoUnit.DECADES.between(birthDate, today));//十年数
        System.out.println("相差的世纪(百年)数:" + ChronoUnit.CENTURIES.between(birthDate, today));//世纪(百年)数
        System.out.println("相差的千年数:" + ChronoUnit.MILLENNIA.between(birthDate, today));//千年数
        System.out.println("相差的纪元数:" + ChronoUnit.ERAS.between(birthDate, today));//纪元数


    }
}