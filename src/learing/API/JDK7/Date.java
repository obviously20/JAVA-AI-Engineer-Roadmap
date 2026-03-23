package learing.API.JDK7;

public class Date {
    //时间的相关知识点：
    //世界标准时间：最开始是格林威治时间GMT，目前世界标准时间是UTC时间（原子钟）
    //中国时间：东八区时间，与世界标准时间相差8小时，中国时间=世界标准时间+8小时
    //时间换算单位:1秒=1000毫秒 1毫秒=1000微秒 1微秒=1000纳秒

    private long time;
    //java.util.Date`类 表示特定的瞬间，精确到毫秒
    //构造方法：

    //无参构造方法：创建一个表示当前时间的Date对象
    public Date() {
        time = System.currentTimeMillis();
    }

    //有参构造方法：创建一个表示指定时间的Date对象
    public Date(long time) {
        this.time = time;
    }

    //`public long getTime()` 把日期对象转换成对应的时间毫秒值
    public long getTime() {
        return time;
    }

    //``public void setTime(long time)` 把方法参数给定的毫秒值设置给日期对象
    public void setTime(long time) {
        this.time = time;
    }
}
