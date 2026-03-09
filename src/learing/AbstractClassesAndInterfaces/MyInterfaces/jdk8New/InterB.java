package learing.AbstractClassesAndInterfaces.MyInterfaces.jdk8New;

public interface InterB {
    //2.在实现多个接口时，如果多个接口中定义了相同的默认方法，那么实现类必须重写该方法，否则会报错
    public default void methodB(){
        System.out.println("InterB默认方法----methodB");
    }

    public default void methodC(){
        System.out.println("InterB抽象方法----methodC");
    };

}
