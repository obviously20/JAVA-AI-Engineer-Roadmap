package learing.AbstractClassesAndInterfaces.MyInterfaces.demo2;

public interface Test {
    /*TODO 接口中的成员的特点
    *  成员变量：只能是常量，默认修饰符：public static final
    *  成员方法：只能是抽象方法，默认修饰符：public abstract
    *   没有构造方法*/
    /*DK7以前:接口中只能定义抽象方法。
      JDK8的新特性:接口中可以定义有方法体的方法。
      JDK9的新特性:接口中可以定义私有方法。*/

    // 成员变量：只能是常量，默认修饰符：public static final
    int a=10;
    //public static final int a=10;
    //a=20;

    public abstract void test();
}
