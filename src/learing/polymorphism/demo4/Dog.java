package learing.polymorphism.demo4;

public class Dog extends Pet {
    public Dog() {
    }

    public Dog(String color, int age) {
        super(color, age);
    }

    @Override
    public String eat(String something) {
        return "年龄为"+getAge()+"的"+getColor()+"的狗在吃"+something;
    }

    public void lookhome() {
        System.out.println("年龄为"+getAge()+"的"+getColor()+"的狗在看家");
    }
}
