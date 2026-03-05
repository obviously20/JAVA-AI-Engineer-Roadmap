package learing.inheritance.homework03;

public class Test {
    public static void main(String[] args) {
        // 1. 创建一个Phone对象
        Phone phone = new Phone("小米", 1999);
        System.out.println(phone.getBrand()+phone.getPrice()+phone.getSize());
        // 2. 调用call方法
        phone.call();
        // 3. 调用sendMessage方法
        phone.sendMessage();
        // 4. 调用playGame方法
        phone.playGame();
    }
}
