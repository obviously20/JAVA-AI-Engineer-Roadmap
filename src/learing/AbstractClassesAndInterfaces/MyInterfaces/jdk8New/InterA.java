package learing.AbstractClassesAndInterfaces.MyInterfaces.jdk8New;

public interface InterA {

    /*JDK8新特性：静态方法*/
    public abstract void methodAA();


    /*JDK8新特性：默认方法*/
    //1.默认方法可以被接口实现类继承，也可以被接口实现类重写,不过重写时需要去掉default关键字
    //2.在实现多个接口时，如果多个接口中定义了相同的默认方法，那么实现类必须重写该方法，否则会报错
    public default void methodA(){
        System.out.println("InterA默认方法----methodA");
    }

    public default void methodC(){
        System.out.println("InterA抽象方法----methodC");
    }

    //3.public 可以省略，因为接口中的方法默认都是public的，而default关键字是为了区分抽象方法和默认方法,不能省略

    //4.静态类方法，不能被接口实现类继承，也不能被接口实现类重写
    public static void methodStatic(){
        System.out.println("InterA静态方法----methodStatic");
    }
}
