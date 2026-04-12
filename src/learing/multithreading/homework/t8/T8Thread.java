package learing.multithreading.homework.t8;

public class T8Thread extends Thread {
    static int number = 0;
    @Override
    public void run() {
        while(true){
            synchronized (T8Thread.class){
                if(number>=100){
                    break;
                }else{
                    number++;
                    if(number%2==1){
                        System.out.println(getName()+"打印"+number);
                    }
                }
            }
        }
    }
}
