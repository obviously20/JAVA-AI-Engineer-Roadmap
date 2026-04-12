package learing.multithreading.homework.t9;

public class T9 {
    public static void main(String[] args) {
        //多线程练习4(抢红包)
        //抢红包也用到了多线程。
        //假设:100块，分成了3个包，现在有5个人去抢。
        //其中，红包是共享数据。
        //5个人是5条线程。
        //打印结果如下:
        //D
        //XXX抢到了XXX元
        //XXX抢到了XXX元
        //XXX抢到了XXX元
        //XXX没抢到
        //XXX没抢到

        T9MyThread t1 = new T9MyThread();
        T9MyThread t2 = new T9MyThread();
        T9MyThread t3 = new T9MyThread();
        T9MyThread t4 = new T9MyThread();
        T9MyThread t5 = new T9MyThread();


        t1.setName("张三");
        t2.setName("李四");
        t3.setName("王五");
        t4.setName("赵六");
        t5.setName("王二");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
