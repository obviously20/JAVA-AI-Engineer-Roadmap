package learing.inheritance.demo1;

public class Animal {
    //TODO：子类只能继承直接父类的方法，不能继承间接父类的方法
    //TODO：子类只能继承父类非private的方法和属性
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void drink(){
        System.out.println("Animal is drinking");
    }
}
