package learing.inheritance.homework06;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("张三", 18);
        Dog dog = new Dog(1, "黄色");
        Cat cat = new Cat(2, "玄色");

        dog.lookHome();
        dog.eat("狗粮");
        person.keepPet(dog, "骨头");

        cat.catchMouse();
        cat.eat("猫粮");
        person.keepPet(cat, "小鱼干");

    }
}

