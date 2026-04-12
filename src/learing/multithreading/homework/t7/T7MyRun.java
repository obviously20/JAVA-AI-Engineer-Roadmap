package learing.multithreading.homework.t7;

public class T7MyRun implements Runnable {

    int gift = 100;

    @Override
    public void run() {
        while(true){
            synchronized (T7MyRun.class){
                if(gift<10){
                    break;
                }else {
                    gift--;
                    System.out.println(Thread.currentThread().getName()+"送出1份礼品,剩余"+gift+"份");
                }
            }

        }
    }
}
