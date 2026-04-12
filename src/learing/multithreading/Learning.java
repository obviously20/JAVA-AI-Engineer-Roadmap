package learing.multithreading;

import java.util.concurrent.ExecutionException;

public class Learning {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*todo
        *   学习多线程
        *   多线程的第一种启动方式: 继承Thread类的方式进行实现
        *   1.自己定义一个类继承Thread
        *   2.重写run方法
        *   3.创建子类的对象，并启动线程
        *
        *
        *
        * */

//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//
//        t1.setName("线程1");
//        t2.setName("线程2");
//
//        //多线程交替运行
//        t1.start();
//        t2.start();


        /*todo
        *   多线程的第二种启动方式: 实现Runnable接口的方式进行实现
        *   1.自己定义一个类实现Runnable接口
        *   2.重写run方法
        *   3.创建子类的对象，
        *   4.创建一个Thread对象，并启动线程
        * */

//
//        //创建子类的对象,表示线程要执行的任务对象
//        MyRun r1 = new MyRun();
//        MyRun r2 = new MyRun();
//
//        //创建一个Thread对象,并指定要执行的任务对象
//        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r2);
//
//        t1.setName("线程1");
//        t2.setName("线程2");
//
//        t1.start();
//        t2.start();



        /*todo
         *   多线程的第三种实现方式: 实现Callable接口的方式进行实现
         *   特点:可以获取到多线程运行的结果
         *   1.创建一个类MyCallable实现callable接口
         *   2.重写call方法(是有返回值的，表示多线程运行的结果)
         *   3.创建MyCallable的对象(表示多线程要执行的任务)
         *   4.创建FutureTask的对象(作用管理多线程运行的结果)
         *   5.创建Thread类的对象，并启动(表示线程)
         * */

//        //创建一个MyCallable的对象(表示多线程要执行的任务)
//        MyCallable callable = new MyCallable();
//        //创建一个FutureTask的对象(作用管理多线程运行的结果)
//        FutureTask<Integer> futureTask = new FutureTask<>(callable);
//        //创建一个Thread对象,并指定要执行的任务对象
//        Thread t = new Thread(futureTask);
//        t.start();
//
//        //获取到线程运行的结果 futureTask.get();
//        Integer result = futureTask.get();
//        System.out.println(result);


        ///*
        //String getName()                  返回此线程的名称
        //void setName(String name)         设置线程的名字（构造方法也可以设置名字）
        //细节：
        //    1、如果我们没有给线程设置名字，线程也是有默认的名字的
        //        格式：Thread-X（X序号，从0开始的）
        //    2、如果我们要给线程设置名字，可以用set方法进行设置，也可以构造方法设置
        //
        //static Thread currentThread()     获取当前线程的对象
        //细节：
        //    当JVM虚拟机启动之后，会自动的启动多条线程
        //    其中有一条线程就叫做main线程
        //    他的作用就是去调用main方法，并执行里面的代码
        //    在以前，我们写的所有的代码，其实都是运行在main线程当中
        //
        //static void sleep(long time)      让线程休眠指定的时间，单位为毫秒
        //细节：
        //    1、哪条线程执行到这个方法，那么哪条线程就会在这里停留对应的时间
        //    2、方法的参数：就表示睡眠的时间，单位毫秒
        //        1 秒= 1000毫秒
        //    3、当时间到了之后，线程会自动的醒来，继续执行下面的其他代码
        //*/

        /*setPriority(int newPriority) 设置线程的优先级
        final int getPriority() 获取线程的优先级
        */

//        MyThread thread1 = new MyThread();
//        MyThread thread2 = new MyThread();
//
//        thread1.setName("线程1");
//        thread2.setName("线程2");
//
//
//        System.out.println(thread1.getPriority());
//        System.out.println(thread2.getPriority());
//
//        //todo 优先级：1-10，默认5级；1最低，10最高；优先级高的线程抢占CPU的概率高，但不是100%抢占
//        thread1.setPriority(10);//设置线程1的优先级为10
//        thread2.setPriority(1);//设置线程2的优先级为1
//
//        thread1.start();
//        thread2.start();

        //守护线程：
        //细节:
        //final void setDaemon(boolean on)
        //设置为守护线程
        //当其他的非守护线程执行完毕之后，守护线程会陆续结束
        //通俗易懂:
        //当女神线程结束了，那么备胎也没有存在的必要了

//        MyThread thread1 = new MyThread();
//        thread1.setName("守护线程");
//        thread1.setDaemon(true);//设置为守护线程
//
//        Mythread2 mythread2 = new Mythread2();
//        mythread2.setName("非守护线程");
//
//
//        mythread2.start();
//        thread1.start();

        //public static void yield()
        //出让线程/礼让线程 ----让结果尽可能的均匀


        //public final void join()
        //插入线程/插队线程
        //将一个线程设置为插入线程，那就将其放到当前线程的前面执行，等插入线程执行完毕，才会继续执行当前线程的代码

//        MyThread thread = new MyThread();
//        thread.setName("插入线程");
//        thread.start();
//        thread.join();
//
//        //等插入线程执行完毕，才会继续执行main线程的代码
//        //当前是在main方法下的main线程：所以当前线程是main线程
//        for (int i = 0; i < 10; i++) {
//            System.out.println("main线程在运行"+i);
//        }








    }
}
