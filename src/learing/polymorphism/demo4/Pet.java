package learing.polymorphism.demo4;

public class Pet {
    private String color;
    private int age;

    public Pet() {
    }

    public Pet(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String eat(String something) {
        return "年龄为"+getAge()+"的"+getColor()+"的XX在吃"+something;
    }
}
