package learing.multithreading;

public class Mythread2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + "在运行"+i);
            //出让线程/礼让线程 ----让结果尽可能的均匀
//            Thread.yield();
        }
    }
}
