package learing.multithreading.homework.t12;

import learing.polymorphism.demo1.Administrator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class T12 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //多线程练习7(多线程之间的比较)
        //在上一题基础上继续完成如下需求:最高奖项为300元，总计额为932元
        //在此次抽奖过程中，抽奖箱1总共产生了6个奖项，分别为:10,20,100,500,2,300
        //在此次抽奖过程中，抽奖箱2总共产生了6个奖项，分别为:5,50,200,800,80,700
        //最高奖项为800元，总计额为1835元在此次抽奖过程中,抽奖箱2中产生了最大奖项,该奖项金额为800元
        //以上打印效果只是数据模拟,实际代码运行的效果会有差异


        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,20,100,500,2,300,5,50,200,800,80,700);

        T12MyCallable t12MyCallable = new T12MyCallable(list);

        //创建两个任务:分别对应两个抽奖箱，这样就知道哪个抽奖箱产生了最大奖项了
        FutureTask<Integer> futureTask1 = new FutureTask<>(t12MyCallable);
        FutureTask<Integer> futureTask2 = new FutureTask<>(t12MyCallable);

        Thread thread1 = new Thread(futureTask1);
        Thread thread2 = new Thread(futureTask2);

        thread1.start();
        thread2.start();

        System.out.println(futureTask1.get());
        System.out.println(futureTask2.get());

        if (futureTask2.get() == 800){
            System.out.println("在此次抽奖过程中,抽奖箱2中产生了最大奖项,该奖项金额为800元");
        }





    }
}
