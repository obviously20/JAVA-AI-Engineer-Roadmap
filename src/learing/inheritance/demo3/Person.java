package learing.inheritance.demo3;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("Person类（父类）的无参构造方法被调用");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person类（父类）的有参构造方法被调用");
    }
}
