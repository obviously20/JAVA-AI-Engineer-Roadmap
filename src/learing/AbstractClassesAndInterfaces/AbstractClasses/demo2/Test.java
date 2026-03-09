package learing.AbstractClassesAndInterfaces.AbstractClasses.demo2;

public class Test {
    public static void main(String[] args) {
        Animal f = new Forg();
        f.setName("青蛙");
        f.setAge(1);

        Animal d = new Dog();
        d.setName("狗");
        d.setAge(2);

        Sheep s = new Sheep();
        s.setName("羊");
        s.setAge(3);

        System.out.println(f.getName() + "的年龄是" + f.getAge());
        f.drink();
        f.eat();

        System.out.println(d.getName() + "的年龄是" + d.getAge());
        d.drink();
        d.eat();

        System.out.println(s.getName() + "的年龄是" + s.getAge());
        s.drink();
        s.eat();
    }
}
