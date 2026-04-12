package learing.multithreading;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + "在运行"+i);
        }
    }

}
