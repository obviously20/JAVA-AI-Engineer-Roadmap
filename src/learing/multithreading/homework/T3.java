package learing.multithreading.homework;

public class T3 {
    public static void main(String[] args) {
        //模拟窗口售卖票:用Lock手动实现锁

        T3Thread t1 = new T3Thread();
        T3Thread t2 = new T3Thread();
        T3Thread t3 = new T3Thread();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
