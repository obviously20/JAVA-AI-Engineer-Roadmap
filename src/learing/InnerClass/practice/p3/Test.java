package learing.InnerClass.practice.p3;

public class Test {
    public static void main(String[] args) {
        /*## 第三题：

        ### 需求:

        1. 接口IPlay中有一个方法playGame()，在测试类中如何调用该方法？

        ​		要求1.创建子类实现接口的方式实现

        ​		要求2:用匿名内部类实现



        2. 一个抽象类Fun中有一个抽象方法 fun() , 在测试类中如何调用该方法?

        ​		要求1.创建子类继承抽象类的方式实现
        ​		要求2:用匿名内部类实现*/

        //1.1
        Phone p = new Phone("小米", 2999);
        p.playGame();
        //1.2
        new Iplay() {
            @Override
            public void playGame() {
                System.out.println("是匿名内部类------玩游戏");
            }

        }.playGame();


        //2.1
        Fun zi = new Zi();
        zi.fun();

        //2.2
        new Fun() {
            @Override
            public void fun() {
                System.out.println("是匿名内部类------调用fun方法");
            }

        }.fun();

    }
}
