package learing.multithreading.homework.t4;

public class Desk {
    /*
    *控制生产者和消费者的执行
    * */

    //桌子上是否有面条
    //0:没有面条
    //1:有面条
    public static int foodFlog = 0;

    //消费者可以消费的面条数量：可以吃10碗
    public static int consumeNum = 10;

    //锁对象
    public static Object lock = new Object();


}
