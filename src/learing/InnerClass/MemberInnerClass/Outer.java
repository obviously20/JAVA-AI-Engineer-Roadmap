package learing.InnerClass.MemberInnerClass;

public class Outer {
    private int a = 10;


    //TODO：外部类提供方法，获取内部类对象
    public Inner getInner(){
        return new Inner();
    }




    //TODO：成员内部类
    /*TODO 编写成员内部类的注意点
    *   1.成员内部类可以被一些修饰符所修饰，如public、private、protected、默认等
    *   2.在成员内部类里面，JDK16之前不能定义静态变量，JDK16后可以定义静态变量*/
    private class Inner{
        private int a = 20;
        public void show(){
            int a = 30;
            //TODO：在外部类和内部类中都有变量a，如何访问？
            System.out.println("在外部类Outer的 a: " + Outer.this.a);
            System.out.println("在内部类中的成员变量Inner的 a: " + this.a);
            System.out.println("在内部类中的方法的 a: " + a);
        }
    }
}
