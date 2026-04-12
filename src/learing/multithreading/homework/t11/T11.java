package learing.multithreading.homework.t11;


import java.util.ArrayList;
import java.util.Collections;

public class T11 {
    public static void main(String[] args) {
        //多线程练习6(多线程统计并求最大值)
        //在上一题基础上继续完成如下需求:每次抽的过程中，不打印，抽完时一次性打印(随机)在此次抽奖过程中，抽奖箱1总共产生了6个奖项。
        //分别为:10,20,100,500,2,300最高奖项为300元，总计额为932元
        //在此次抽奖过程中，抽奖箱2总共产生了6个奖项。
        //分别为:5,50,200,800,80,700最高奖项为800元，总计额为1835元
//        //创建抽奖池,并添加所有奖项
//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);
//
//        //创建两个抽奖箱(线程)
//        T11MyTread t1 = new T11MyTread(list);
//        t1.setName("抽奖箱1");
//
//        T11MyTread t2 = new T11MyTread(list);
//        t2.setName("抽奖箱2");
//
//        t1.start();
//        t2.start();

        //创建抽奖池,并添加所有奖项
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        //创建两个抽奖箱(线程)
        T11MyThread2 t1 = new T11MyThread2(list);
        t1.setName("抽奖箱1");

        T11MyThread2 t2 = new T11MyThread2(list);
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();


    }
}
