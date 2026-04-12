package learing.multithreading.homework.t10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;

public class T10 {
    public static void main(String[] args) {
        //多线程练习5(抽奖箱抽奖)
        //有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池中的奖项为{10,5,20,50,100,200,500,800,2,80,300,700);
        // 创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”
        // 随机从抽奖池中获取奖项元素并打印在控制台上,
        // 格式如下:每次抽出一个奖项就打印一个(随机)
        // 抽奖箱1又产生了一个10元大奖
        // 抽奖箱1又产生了一个100元大奖:
        // 抽奖箱1又产生了一个200元大奖
        // 抽奖箱1又产生了一个800元大奖
        // 抽奖箱2又产生了一个700元大奖
        //

        //创建抽奖池,并添加所有奖项
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        //创建两个抽奖箱(线程)
        T10MyTread t1 = new T10MyTread(list);
        t1.setName("抽奖箱1");

        T10MyTread t2 = new T10MyTread(list);
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();

    }
}
