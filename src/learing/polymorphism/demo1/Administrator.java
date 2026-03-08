package learing.polymorphism.demo1;

public class Administrator extends Person{
    public Administrator() {
    }

    public Administrator(String name, int age) {
        super(name, age);
    }

    @Override
    public void show(){
        System.out.println("管理员name:"+getName()+" age:"+getAge());
    }

}
