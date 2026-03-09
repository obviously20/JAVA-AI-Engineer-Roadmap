package learing.AbstractClassesAndInterfaces.MyInterfaces.demo3;

public class Test implements Inter3 {

    /*类和类之间的关系：继承关系，只能单继承，不能多继承，但是可以多层继承*/

        /*类和接口之间的关系：实现关系，一个类可以实现单个或多个接口，但是只能继承一个类
         ----但是如果多个接口中定义了相同的方法，那么实现类只需要重写一次即可，其重写的那一次会覆盖其他接口中的方法*/

    /*接口和接口之间的关系：继承关系，一个接口可以继承多个接口，其子接口要重写所有父接口中的方法*/

    @Override
    public void test1() {
        System.out.println("test1");
    }

    @Override
    public void test2() {
        System.out.println("test2");
    }

    @Override
    public void test3() {
        System.out.println("test3");
    }

}
