package learing.inheritance.homework02;

public class Teacher extends Character {
    private String department;

    public Teacher() {
    }

    public Teacher(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void postAQuestion() {
        System.out.println(getName()+"在发布问题");
    }
}
