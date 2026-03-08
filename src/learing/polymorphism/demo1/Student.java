package learing.polymorphism.demo1;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void show(){
        System.out.println("学生的name:"+getName()+"age:"+getAge());
    }
}
