package learing.AbstractClassesAndInterfaces.MyInterfaces.jdk8New;

public class ee implements InterA,InterB{
    @Override
    public void methodAA() {
        System.out.println("ee重写了InterA接口的抽象方法methodAA");
    }
    @Override
    public void methodA() {
        System.out.println("ee重写了InterA接口的默认方法methodA");
    }

    @Override
    public void methodB() {
        System.out.println("ee重写了InterB接口的默认方法methodB");
    }

    @Override
    public void methodC() {
        System.out.println("ee更改了默认方法methodC");
    }

    public static void methodStatic(){
        System.out.println("ee没有重写了InterA接口的静态方法methodStatic，这个只是和InterA接口的静态方法methodStatic同名的静态方法而已" +
                "要知道能被继承下来的方法是在虚方法表上的，而static修饰的方法是不在虚方法表上的，所以ee类不能调用InterA接口的静态方法methodStatic");
    }

}
