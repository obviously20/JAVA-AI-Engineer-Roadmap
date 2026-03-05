package learing.inheritance.homework02;

public class Character {
    private String name;
    private int age;

    public Character() {
    }

    public Character(String name, int age) {
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

    public void viewSchedule() {
        System.out.println(getName()+"在查看课表");
    }
}
