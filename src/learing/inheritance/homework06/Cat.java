package learing.inheritance.homework06;

public class Cat extends Animal {


    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("The age who is "+getAge()+" and color is "+getColor()+" Cat is eating "+something);
    }

    public void catchMouse() {
        System.out.println("The age who is "+getAge()+" and color is "+getColor()+" Cat is catching mouse");
    }
}
