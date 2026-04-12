package learing.multithreading.homework;


public class T2MyRun implements Runnable {

    //票的编号:所有线程共享一个变量；但是不用static修饰，因为在Thread那里创建多个对象，每个对象都有自己的counter变量，故要用static修饰
    //而Runnable那里创建的是一个对象(任务)，所以不用static修饰,因为就只有一个counter变量
    int counter = 0;

    @Override
    public void run() {
        while (true) {
            if (extracted()) break;
        }
    }

    //同步方法:只能被一个线程执行，其他线程必须等待
    //同步方法的锁对象:如果是静态方法，锁对象是当前类的字节码文件对象
    //如果是非静态方法，锁对象是当前对象的this引用
    private synchronized boolean extracted() {
        if (counter < 100) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter++;
            System.out.println(Thread.currentThread().getName() + "在售卖第" + counter + "张票");
        } else {
            return true;
        }
        return false;
    }
}
