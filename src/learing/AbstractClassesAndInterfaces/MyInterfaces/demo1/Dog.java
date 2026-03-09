package learing.AbstractClassesAndInterfaces.MyInterfaces.demo1;

public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    // 抽象类的子类必须实现抽象方法or成为抽象类
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
    // 接口的实现类必须实现接口中的所有方法or成为抽象类
    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
