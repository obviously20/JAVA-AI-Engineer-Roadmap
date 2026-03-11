package learing.InnerClass.practice.p2;

public class NewPhone extends Phone implements IPlay {
    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("发短信");
    }

    @Override
    public void playGame() {
        System.out.println("玩游戏");
    }
}
