package learing.multithreading.homework.t4;

public class Foodie extends Thread {
    //消费者
    @Override
    public void run() {
        /*
        * 1.循环
        * 2.同步代码块
        * 3.判断共享数据是否到了末尾（到了末尾）
        * 4.判断共享数据是否到了末尾（没有到末尾，执行核心逻辑）*/


        while(true){
            synchronized (Desk.lock){
               if(Desk.consumeNum==0){
                   break;
               }else {
                   //核心逻辑：
                   //先判断是否有面条
                   if(Desk.foodFlog==0){
                       try {
                           Desk.lock.wait();//让当前线程跟锁进行绑定，在唤醒的时候就知道唤醒那些等待者
                       } catch (InterruptedException e) {
                           throw new RuntimeException(e);
                       }
                   }else{
                       //如果有面条，就吃一个
                       //面条数减1
                       Desk.consumeNum--;
                       System.out.println("消费者还可以再吃"+Desk.consumeNum+"碗面条");
                       //吃完等待生产者生产面条：唤醒生产者生产面条
                       Desk.lock.notifyAll();//唤醒所有等待者
                       //将桌子上（是否有面条）设置为0
                       Desk.foodFlog=0;
                   }



               }
            }
        }





























    }

}
