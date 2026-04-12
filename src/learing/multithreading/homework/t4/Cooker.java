package learing.multithreading.homework.t4;

public class Cooker extends Thread {
    /*
     * 1.循环
     * 2.同步代码块
     * 3.判断共享数据是否到了末尾（到了末尾）
     * 4.判断共享数据是否到了末尾（没有到末尾，执行核心逻辑）*/

    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.consumeNum==0){
                    break;
                }else{
                    //核心逻辑：
                    //先判断桌子上是否有面条
                    if(Desk.foodFlog==1) {
                        //如果有就等待，并唤醒消费者吃面条
                        try {
                            Desk.lock.wait();//让当前线程跟锁进行绑定，在唤醒的时候就知道唤醒那些等待者
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        //如果没有就生产一碗面条
                        System.out.println("厨师生产了一碗面条");
                        //修改桌子上是否有面条为1
                        Desk.foodFlog=1;
                        //并唤醒消费者吃面条
                        Desk.lock.notifyAll();

                    }
                }
            }
        }
    }
}
