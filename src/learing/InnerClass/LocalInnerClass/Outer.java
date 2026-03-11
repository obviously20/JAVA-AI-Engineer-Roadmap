package learing.InnerClass.LocalInnerClass;

public class Outer {
    /*局部内部类
        1.将内部类定义在方法里面就叫做局部内部类，类似于方法里面的局部变量。
        2.外界是无法直接使用，需要在方法内部创建对象并使用。
        3.该类可以直接访问外部类的成员，也可以访问方法内的局部变量。*/

     public void method(){
         int b = 10;

         class Inner{
             int a=10;

             //局部内部类可以直接访问外部类的成员变量,也可以访问方法内的局部变量
             public void method1(){
                 System.out.println(a);
                 System.out.println(b);
                 System.out.println("局部内部类的method1方法");
             }

             public static void method2(){
                 System.out.println("局部内部类的method2静态方法");
             }
         }

         //2.在方法内部可以创建局部内部类的对象,并调用方法
         Inner i = new Inner();
         System.out.println(i.a);
         i.method1();
         Inner.method2();




     }
}
