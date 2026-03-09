package learing.AbstractClassesAndInterfaces.MyInterfaces.jdk9New;

public interface Inter {
    /*接口中私有方法：重复的代码提取到一个方法中，但又不希望被其他类调用*/
//    public default void Inter1(){
//        System.out.println("Inter1");
////        System.out.println("100行代码");
//        Inter3();
//    }
//
//    public default void Inter2(){
//        System.out.println("Inter2");
////        System.out.println("100行代码");
//        Inter3();
//    }
//
//    //TODO 1普通私有方法：private +去掉default关键字-->给默认方法服务的
//    private void Inter3(){
//        System.out.println("100行代码");
//    }



    public static void Inter1(){
        System.out.println("Inter1");
//        System.out.println("100行代码");
        Inter3();
    }

    public static void Inter2(){
        System.out.println("Inter2");
//        System.out.println("100行代码");
        Inter3();
    }

    //TODO 2静态私有方法：private +static+去掉default关键字-->给静态方法服务的
    private static void Inter3(){
        System.out.println("100行代码");
    }
}
