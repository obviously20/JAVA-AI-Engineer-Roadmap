package learing.multithreading.homework.t6;

public class T6Thread extends Thread {
    static int ticket = 1000;

    @Override
    public void run() {
        while (true) {
            synchronized (T6Thread.class) {
                if (ticket == 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket--;
                    System.out.println(getName() + "卖出票1张票,剩余" + ticket + "张");

                }
            }
        }
    }
}
