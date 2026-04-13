package learing.multithreading;

import java.util.concurrent.*;

public class Learning2 {
    public static void main(String[] args) {
//        //public static ExecutorService newCachedThreadPool()创建一个没有上限的线程池
//        //public static ExecutorService newFixedThreadPool (int nThreads) 创建有 上限的线程池
//
//
//        ExecutorService pool1 = Executors.newCachedThreadPool();
//        ExecutorService pool2 = Executors.newFixedThreadPool(3);
//
//
//        pool1.execute(new MyRun());
//        pool1.execute(new MyRun());
//        pool1.execute(new MyRun());
//
//        //关闭线程池
////        pool.shutdown();


//        //上面创建的线程池都是默认的线程池：使用的都是java工具类创建
//        //创建一个自定义的线程池
//        /*
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
//        (核心线程数量,最大线程数量,空闲线程最大存活时间,任务队列,创建线程工厂,任务的拒绝策略);
//
//        参数一：核心线程数量          不能小于0
//        参数二：最大线程数            不能小于0，最大数量 >= 核心线程数量
//        参数三：空闲线程最大存活时间  不能小于0
//        参数四：时间单位              用TimeUnit指定
//        参数五：任务队列              不能为null
//        参数六：创建线程工厂          不能为null
//        参数七：任务的拒绝策略        不能为null
//        */
//
//        ThreadPoolExecutor pool = new ThreadPoolExecutor(
//                 3,  //核心线程数量，能小于0
//                            6,  //最大线程数，不能小于0，最大数量 >= 核心线程数量
//                            60,//空闲线程最大存活时间
//                TimeUnit.SECONDS,//时间单位
//                new ArrayBlockingQueue<>(3),//任务队列
//                Executors.defaultThreadFactory(),//创建线程工厂
//                new ThreadPoolExecutor.AbortPolicy()//任务的拒绝策略
//        );
//        pool.execute(new MyRun());
//        pool.execute(new MyRun());


        //最大并行数：线程池最大并行数 = 最大线程数（maximumPoolSize）
//        int count = Runtime.getRuntime().availableProcessors();
//        System.out.println(count);

//        ThreadPoolExecutor pool = new ThreadPoolExecutor(
//                 3,    // 核心线程
//                6, // 最大线程 ⬅️ 这就是【最大并行数】
//                 60,
//                TimeUnit.SECONDS,
//                new ArrayBlockingQueue<>(3), // 任务队列容量3
//                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy()
//        );



        //线程池多大合适？
        //核心线程数量：根据任务的性质，确定核心线程数量
        //CPU密集型运算：项目以计算为主
        //IO密集型运算：项目多以IO为主，如文件读写、网络通信、数据库操作等

        //CPU密集型运算
        //最大并行数（Runtime.getRuntime().availableProcessors()）+1

        //IO密集型运算
        //最大并行数（Runtime.getRuntime().availableProcessors()）*期望CPU利用率(100%/80%/...)*(总时间(CPU计算时间+等待时间)/CPU计算时间)
        //其中(总时间(CPU计算时间+等待时间)/CPU计算时间)可以用thread dump来计算





    }
}
