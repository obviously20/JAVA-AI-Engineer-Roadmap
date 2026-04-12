package learing.multithreading.homework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class T3Thread extends Thread {
    static int counter = 0;

    //锁对象
    //所有线程共享一个锁对象(必须唯一)
    //ReentrantLock:是Lock接口的实现类，提供了锁的实现功能：lock.lock()、lock.unlock()
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (counter < 100) {
                    Thread.sleep(100);
                    counter++;
                    System.out.println(getName() + "在售卖第" + counter + "张票");
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {//无论是否发生异常/>100张票，都要释放锁
                lock.unlock();
            }
        }
    }

}
