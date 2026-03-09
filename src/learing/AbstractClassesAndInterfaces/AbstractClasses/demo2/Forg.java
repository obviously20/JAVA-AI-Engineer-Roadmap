package learing.AbstractClassesAndInterfaces.AbstractClasses.demo2;

public class Forg extends Animal {

    public Forg() {
    }

    public Forg(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }
}
