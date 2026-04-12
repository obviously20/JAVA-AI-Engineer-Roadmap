package learing.multithreading.homework.t11;

import java.util.ArrayList;
import java.util.Collections;

public class T11MyTread extends Thread {
    ArrayList<Integer> list;

    public T11MyTread(ArrayList<Integer> list) {
        this.list = list;
    }
    //list 唯一

    //线程1
    ArrayList<Integer> list1 = new ArrayList<>();
    //线程2
    ArrayList<Integer> list2 = new ArrayList<>();

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() == 0) {
                    if (getName().equals("线程1")) {
                        int total1 = 0;
                        for (Integer i : list1) {
                            total1 += i;
                        }
                        System.out.println(getName() + "产生了" + list1.size() + "个奖项" + "其中最高奖项为"
                                + Collections.max(list1) + "元"
                                + "总计额为" + total1);
                        break;
                    } else {
                        int total2 = 0;
                        for (Integer i : list2) {
                            total2 += i;
                        }
                        System.out.println(getName() + "产生了" + list2.size() + "个奖项" + "其中最高奖项为"
                                + Collections.max(list2) + "元"
                                + "总计额为" + total2);
                        break;
                    }
                } else {
                    //随机从抽奖池中获取一个元素
                    //打乱抽奖池中的元素顺序
                    Collections.shuffle(list);
                    //获取第一个元素
                    int price = list.remove(0);
//                    System.out.println(getName() + "又产生了一个" + price + "元大奖");
                    if (getName().equals("线程1")) {
                        list1.add(price);
                    } else {
                        list2.add(price);
                    }
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
