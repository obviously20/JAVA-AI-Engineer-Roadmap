package learing.API.myRunTime;

import java.io.IOException;
import java.util.Random;

public class learningRunTime {
    public static void main(String[] args) throws IOException {
         /*
            public static Runtime getRuntime() 当前系统的运行环境对象
            public void exit(int status) 停止虚拟机
            public int availableProcessors() 获得CPU的线程数
            public long maxMemory() JVM能从系统中获取总内存大小(单位byte)
            public long totalMemory() JVM已经从系统中获取总内存大小(单位byte)
            public long freeMemory() JVM剩余内存大小(单位byte)
            public Process exec(string command) 运行cmd命令
        */

//        //获得当前系统的运行环境对象
//        Runtime r1 = Runtime.getRuntime();
//        Runtime r2 = Runtime.getRuntime();
//        System.out.println(r1==r2);

//        //停止虚拟机
//        //Runtime r1 = Runtime.getRuntime();
//        //r1.exit(0);//0表示正常停止虚拟机，非0表示异常停止虚拟机
//        Runtime.getRuntime().exit(0);//这是System.exit(0)的原码
//        System.out.println("虚拟机停止");

//        //获得CPU的线程数
//        System.out.println(Runtime.getRuntime().availableProcessors());

//        //JVM能从系统中获取总内存大小(单位byte)----B
//        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024+"MB");
//        //JVM已经从系统中获取总内存大小(单位byte)----B->MB
//        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024+"MB");
//        //JVM剩余内存大小(单位byte)----B->MB
//        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024+"MB");

        /*//执行cmd命令
        //-s : 关机
        //-r : 重启
        //-t : 延迟时间(单位秒)
        //-a : 取消关机或重启
        //Runtime.getRuntime().exec("shutdown -s -t 3600");//3600秒后关机
        //Runtime.getRuntime().exec("shutdown -s -t 3600");
        //Runtime.getRuntime().exec("shutdown -a");//取消关机或重启*/





    }
}
