package learing.multithreading.homework.t5;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {
    //先声明一个阻塞队列的对象
    ArrayBlockingQueue<String> queue;

    //构造方法：在构造方法中初始化阻塞队列的对象
    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            //不断从阻塞队列中取数据（面条）
            try {
                //阻塞队列中的take方法：从队列中取出数据，如果队列为空，则等待队列有数据可用（wait）
                //且其中的方法是同步方法，所以会 "自动锁" ，所以不会出现数据不一致的情况
                String food = queue.take();
                System.out.println(food);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
