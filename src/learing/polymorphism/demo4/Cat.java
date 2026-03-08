package learing.polymorphism.demo4;

public class Cat extends Pet {

    public Cat() {
    }
    public Cat(String color, int age) {
        super(color, age);
    }

    @Override
    public String eat(String something) {
        return "年龄为"+getAge()+"的"+getColor()+"的猫在吃"+something;
    }

    public void catchMouse() {
        System.out.println("年龄为"+getAge()+"的"+getColor()+"的猫在抓老鼠");
    }
}
