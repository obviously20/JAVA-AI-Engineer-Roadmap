package learing.multithreading.homework.t12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class T12MyCallable implements Callable<Integer> {
    ArrayList<Integer> list;

    public T12MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> boxlist = new ArrayList<>();
        while (true) {
            synchronized (list) {
                if (list.size() == 0) {
//                    int total = 0;
//                    for (Integer i : boxlist) {
//                        total += i;
//                    }
//                    System.out.println(Thread.currentThread().getName() + "产生了" + boxlist.size() + "个奖项" + "其中最高奖项为"
//                            + Collections.max(boxlist) + "元"
//                            + "总计额为" + total);
                    break;
                } else {
                    //随机从抽奖池中获取一个元素
                    //打乱抽奖池中的元素顺序
                    Collections.shuffle(list);
                    //获取第一个元素
                    int price = list.remove(0);

                    boxlist.add(price);
                }
            }
            //随机休眠:是为了使抽奖过程更加真实
            Thread.sleep(10);

        }
        //也有线程没有产生奖项的情况
        if(boxlist.size() == 0){
            return null;
        }else {
            return Collections.max(boxlist);
        }

    }
}
