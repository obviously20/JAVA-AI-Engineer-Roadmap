package learing.InnerClass.practice.p5;

public class Test {
    public static void main(String[] args) {

        /*在测试类Test中创建A的对象a并调用成员方法methodA(),要求用两种方式实现 */
        //访问成员内部类的方法

        //1使用匿名内部类实现

        //创建A的对象a并调用成员方法methodA(),
        // TODO 静态方法要想调用成员内部类的方法,必须先创建外部类的对象
        Test test = new Test();
        A a = test.new A();
        a.methodA(
                new InterA() {
                    @Override
                    public void showA() {
                        System.out.println("匿名内部类实现methodA");
                    }
                });

        //2使用创建一个实现接口的类的方式
        Test test1 = new Test();
        cometrue cometrue = test1.new cometrue();
        a.methodA(cometrue);



    }

    interface InterA {
        public abstract void showA();
    }


    //成员内部类
     class A {
        //接口的多态
        public void methodA(InterA a) {
            a.showA();
        }
    }

        //创建一个实现接口的类的方式
    class cometrue implements InterA{
        @Override
        public void showA() {
            System.out.println("另外创建一个实现接口的类来实现methodA");
        }
    }


}
