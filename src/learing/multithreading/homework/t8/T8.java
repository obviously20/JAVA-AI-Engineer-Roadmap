package learing.multithreading.homework.t8;

public class T8 {
    public static void main(String[] args) {
        //多线程练习3(打印奇数数字)
        //同时开启两个线程，共同获取1-100之间的所有数字。
        //要求:将输出所有的奇数。

        T8Thread thread1 = new T8Thread();
        thread1.setName("线程1");
        T8Thread thread2 = new T8Thread();
        thread2.setName("线程2");

        thread1.start();
        thread2.start();
    }
}
