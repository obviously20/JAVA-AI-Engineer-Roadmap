package learing.multithreading.homework;

public class T1 {
    public static void main(String[] args) {
        //3个窗口，同时售卖100张票（一共100张票）
        T1Thread t1 = new T1Thread();
        T1Thread t2 = new T1Thread();
        T1Thread t3 = new T1Thread();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
