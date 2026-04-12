package learing.multithreading.homework.t10;

import java.util.ArrayList;
import java.util.Collections;

public class T10MyTread extends Thread {
    ArrayList<Integer> list;

    public T10MyTread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if(list.size() == 0){
                    break;
                }else {
                    //随机从抽奖池中获取一个元素
                    //打乱抽奖池中的元素顺序
                    Collections.shuffle(list);
                    //获取第一个元素
                    int price = list.remove(0);
                    System.out.println(getName() + "又产生了一个" + price + "元大奖");
                }
            }
            //随机休眠:是为了使抽奖过程更加真实
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /*问题原因：

两个线程共享同一个 ArrayList 对象
但使用 synchronized (T10MyTread.this) 锁住的是每个线程自己的实例，而不是共享的 list 对象
这导致两个线程可以同时访问和修改 list，造成并发异常
修复方案： 将同步锁对象从 T10MyTread.this 改为共享的 list 对象：*
修复后的同步机制：

两个线程都使用同一个 list 对象作为锁
当一个线程进入同步块时，另一个线程必须等待
确保对共享 list 的访问是线程安全的*/


}
