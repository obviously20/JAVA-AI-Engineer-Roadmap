package learing.polymorphism.demo4;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void keepPet(Pet p,String something) {
        if(p instanceof Dog d) {
            System.out.println("年龄为"+this.getAge()+"的"+this.getName()+"养了一只"+d.getColor()+"的"+d.getAge()+"岁的狗"+ d.eat(something));
            d.lookhome();
        }else if(p instanceof Cat c) {
            System.out.println("年龄为"+this.getAge()+"的"+this.getName()+"养了一只"+c.getColor()+"的"+c.getAge()+"岁的猫"+ c.eat(something));
            c.catchMouse();
        }else {
            System.out.println("未知的宠物类型");
        }
    }


}
