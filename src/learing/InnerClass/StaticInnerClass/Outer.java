package learing.InnerClass.StaticInnerClass;

public class Outer {
    //TODO：静态内部类
    /*1.静态内部类是成员内部类中的一种，静态内部类不能直接访问外部类的非静态成员变量和方法*/
    /*2.静态内部类可以直接访问外部类的静态成员变量和方法*/

    int a=10;
    static int b=20;

    static class Inner{
        public void method1(){
//            //TODO: 静态内部类如果要访问外部类的非静态成员变量，需要创建外部类的对象，然后通过对象访问
//            Outer o=new Outer();
//            System.out.println(o.a);
//            System.out.println(b);
            System.out.println("非静态方法被执行");
        }

        public static void method2(){
//            Outer o=new Outer();
//            System.out.println(o.a);
//            System.out.println(b);
            System.out.println("静态方法被执行");
        }
    }
}
