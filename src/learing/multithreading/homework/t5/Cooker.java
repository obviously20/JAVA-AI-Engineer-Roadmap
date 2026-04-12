package learing.multithreading.homework.t5;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker extends Thread {
    //先声明一个阻塞队列的对象
    ArrayBlockingQueue<String> queue;

    //构造方法：在构造方法中初始化阻塞队列的对象
    public Cooker(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            //不断从阻塞队列中放数据（面条）
            try {
                //阻塞队列中的put方法：将数据放入队列中，如果队列已满，则等待队列有空间可用（wait）
                //且其中的方法是同步方法，所以会 "自动锁" ，所以不会出现数据不一致的情况
                queue.put("面条");
                System.out.println("厨师放入1碗面条");//打印语句在锁的外面
                //数据上锁了，所以没问题，打印语句没上锁所以有问题，但是他并不会影响数据，只是影响了我们去阅读而已

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }























}
