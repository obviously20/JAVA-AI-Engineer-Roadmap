package learing.multithreading.homework.t11;

import java.util.ArrayList;
import java.util.Collections;

public class T11MyThread2 extends Thread {
    ArrayList<Integer> list;

    public T11MyThread2(ArrayList<Integer> list) {
        this.list = list;
    }
    //list 唯一

    @Override
    public void run() {
        ArrayList<Integer> boxlist = new ArrayList<>();
        while (true) {
            synchronized (list) {
                if (list.size() == 0) {
                    int total = 0;
                    for (Integer i : boxlist) {
                        total += i;
                    }
                    System.out.println(getName() + "产生了" + boxlist.size() + "个奖项" + "其中最高奖项为"
                            + Collections.max(boxlist) + "元"
                            + "总计额为" + total);
                    break;
                } else {
                    //随机从抽奖池中获取一个元素
                    //打乱抽奖池中的元素顺序
                    Collections.shuffle(list);
                    //获取第一个元素
                    int price = list.remove(0);
//                    System.out.println(getName() + "又产生了一个" + price + "元大奖");

                    boxlist.add(price);
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
}

