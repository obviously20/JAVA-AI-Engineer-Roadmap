package learing.InnerClass.StaticInnerClass;

public class Test {
    public static void main(String[] args) {
        //TODO 创建静态内部类对象的格式:
        //TODO 外部类名.内部类名对象名=new 外部类名.内部类名();
        //静态的直接用类名调用,只要是静态的东西,都可以用类名.调用;--区分于成员内部类的对象调用：Outer.Inner oi = new Outer().new Inner();
        Outer.Inner oi = new Outer.Inner();
        oi.method1();



        //TODO 调用静态方法的格式:
        //TODO 外部类名.内部类名.方法名();
        Outer.Inner.method2();
    }
}
