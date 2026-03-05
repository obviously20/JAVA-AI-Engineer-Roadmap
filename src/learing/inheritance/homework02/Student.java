package learing.inheritance.homework02;

public class Student extends Character {
    private String inCalss;

    public Student() {
        super();
    }

    public Student(String name, int age, String inCalss) {
        super(name, age);
        this.inCalss = inCalss;
    }

    public String getInCalss() {
        return inCalss;
    }

    public void setInCalss(String inCalss) {
        this.inCalss = inCalss;
    }

    public void fillInClassFeedback() {
        System.out.println(getName()+"在填写班级反馈");
    }
}
