package learing.multithreading.homework.t6;

public class T6 {
    public static void main(String[] args) {
        //多线程练习1(卖电影票)
        //要求:请用多线程模拟卖票过程并打印剩余电影票的数量
        //一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒，

        T6Thread t1 = new T6Thread();
        T6Thread t2 = new T6Thread();

        t1.setName("窗口1");
        t2.setName("窗口2");

        t1.start();
        t2.start();
    }
}
