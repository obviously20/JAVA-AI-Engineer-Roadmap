package learing.AbstractClassesAndInterfaces.MyInterfaces.MyAdapter;

public interface InterA {
    /*1.当一个接口中抽象方法过多，但是我只要使用其中一部分的时候，就可以适配器设计模式
    (设计模式：解决各种问题的套路/一种方案)
      2.书写步骤:
        编写中间类XXXAdapter
        实现对应的接口
        对接口中的抽象方法进行空实现:
        让真正的实现类继承中间类，并重写需要用的方法
        为了避免其他类创建适配器类的对象，中间的适配器类用abstract进行修饰*/
    public abstract void method1();

    public abstract void method2();

    public abstract void method3();

    public abstract void method4();

    public abstract void method5();

    public abstract void method6();

    public abstract void method7();

    public abstract void method8();

    public abstract void method9();

    public abstract void method10();
}
