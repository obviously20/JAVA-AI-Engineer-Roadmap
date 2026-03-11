package learing.InnerClass.practice.p2;

public class OldPhone extends Phone {
    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("发短信");
    }
}
