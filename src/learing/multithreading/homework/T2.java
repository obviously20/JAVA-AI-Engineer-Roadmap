package learing.multithreading.homework;

public class T2 {
    public static void main(String[] args) {
        //3个窗口，同时售卖100张票（一共100张票）
        //使用同步方法实现
        //不知道同步方法怎么写->可以先写成同步代码块的形式，然后将同步代码块中的代码抽取出来Ctrl+ALT+M，作为同步方法的代码

        T2MyRun myRun = new T2MyRun();

        Thread window1 = new Thread(myRun, "窗口1");
        Thread window2 = new Thread(myRun, "窗口2");
        Thread window3 = new Thread(myRun, "窗口3");

        window1.start();
        window2.start();
        window3.start();

        //拓：
//        StringBuilder和StringBuffer的区别
        //StringBuilder:线程不安全
        //StringBuffer:线程安全
        //如果只有一个线程操作字符串，建议用StringBuilder
        //如果有多个线程操作字符串，建议用StringBuffer
    }
}
