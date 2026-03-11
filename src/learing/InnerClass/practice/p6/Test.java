package learing.InnerClass.practice.p6;
//目标：调用成员方法methodB
public class Test {
    public static void main(String[] args) {


        //static 静态方法要调用非静态的方法/成员变量时,必须先创建外部类的对象
        Test test = new Test();
        test.new B(new InterB() {
            @Override
            public void showB() {
                System.out.println("匿名内部类实现methodB");
            }
        }).methodB();


    }


    //定义一个接口
    interface InterB {
        void showB();
    }


//class B 成员内部类
    class B {
        InterB b;

        //构造方法
        public B(InterB b) {
            this.b = b;
        }

        //成员方法
        public void methodB() {
            b.showB();
        }
    }



}


