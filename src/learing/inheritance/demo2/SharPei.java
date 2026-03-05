package learing.inheritance.demo2;

public class SharPei extends Dog{
    @Override
    public void eat() {
        //TODO:当重写父类的方法时，在子类的方法中可以使用super关键字调用父类的方法（避免重新实现父类的方法）
        super.eat();
        System.out.println("吃骨头");
    }
}
