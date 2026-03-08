package learing.polymorphism.demo2;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        // 多态，调用成员变量：编译时看左边，运行时看左边
        //编译时看左边：Javac 编译时会看左边父类中有没有这个变量，如果有：编译成功，没有编译失败
        //运行时看左边：Java运行时，实际上获取的就是左边父类中的变量的值
        System.out.println(a.name);

        //多态，调用成员方法：编译看左边，调用看右边
        //编译看左边：Javac 编译时会看左边父类中有没有这个方法，如果有：编译成功，没有编译失败
        //运行看右边：Java运行时，实际上运行的是右边子类中的方法
        a.show();
    }
}
class Dog extends Animal{
    String name = "狗";
    @Override
    public void show(){
        System.out.println("Dog-----show()");
    }

}
class Animal {
    String name = "动物";

    public void show() {
        System.out.println("Animal-----show()"); ;
    }
}
