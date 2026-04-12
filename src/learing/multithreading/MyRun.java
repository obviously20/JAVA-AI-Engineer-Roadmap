package learing.multithreading;

public class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //获取当前线程对象 :Thread.currentThread();//t1 or ...
            //通过当前线程对象获取线程名
            System.out.println("线程" + Thread.currentThread().getName() + "在运行");
        }
    }
}
