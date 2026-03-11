package learing.InnerClass.LocalInnerClass;

public class Test {
    public static void main(String[] args) {
        //1.在外部类的方法中创建局部内部类的对象,并调用方法
        Outer o = new Outer();
        o.method();
    }
}

