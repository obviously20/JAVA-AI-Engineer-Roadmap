package learing.multithreading.homework.t7;

public class T7 {
    public static void main(String[] args) {
        //多线程练习2(送礼品)
        //有100份礼品,两人同时发送，当剩下的礼品小于10份的时候则不再送出。
        //利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来.


        T7MyRun myRun = new T7MyRun();

        Thread thread1 = new Thread(myRun);
        thread1.setName("人1");
        Thread thread2 = new Thread(myRun);
        thread2.setName("人2");

        thread1.start();
        thread2.start();


    }
}
