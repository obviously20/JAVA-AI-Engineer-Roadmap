package learing.multithreading.homework.t5;

import java.util.concurrent.ArrayBlockingQueue;

public class T5 {
    public static void main(String[] args) {
        //利用阻塞队列实现生产者和消费者(等待唤醒机制)

        //1.创建阻塞队列的对象
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        //2.创建生产者和消费者线程
        Cooker cooker = new Cooker(queue);
        Foodie foodie = new Foodie(queue);
        cooker.start();
        foodie.start();
    }
}
