package learing.multithreading.homework.t4;

public class T4 {
    public static void main(String[] args) {
        /*实现线程轮流交替执行的效果
        需求:完成生产者和消费者(等待唤醒机制)的代码*/

        Foodie foodie = new Foodie();
        Cooker cooker = new Cooker();

        foodie.setName("吃货");
        cooker.setName("厨师");

        foodie.start();
        cooker.start();
    }
}
