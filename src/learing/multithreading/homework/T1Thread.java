package learing.multithreading.homework;

public class T1Thread extends Thread {

    //票的编号:用static定义的变量，所有线程共享一个变量
    static int counter = 0; //0~99

    //共享代码块:所有线程共享的代码块，用于售卖票，防止多个线程同时售卖票，导致票号重复
    //因此要用锁来保护共享的代码块：即一个线程在售卖票时，其他线程不能售卖票、
    // （就好比排队上厕所：一个人抢到一个厕所把门锁上，此时其他线程不能上厕所，只有等他上完出来，其他才能抢上厕所）

    //锁:用synchronized关键字定义的代码块，只能被一个线程执行，其他线程必须等待
    //锁对象:用Object类定义的锁对象，所有线程共享一个锁对象(必须唯一)
//    static Object lock = new Object();
    //也可以用当前类的字节码文件作为锁对象
    static Class lock = T1Thread.class;



    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if(counter<100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    counter++;
                    System.out.println(getName()+"在售卖第"+counter+"张票");
                }else {
                    break;
                }
            }
        }
    }
}
