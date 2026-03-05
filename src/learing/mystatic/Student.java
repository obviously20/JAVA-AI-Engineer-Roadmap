package learing.mystatic;

public class Student {
    private String name;
    private int age;
    public static String teacherName;

    public Student() {
    }

    public Student(String name, int age) {
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

    public void study(){
        System.out.println(name + " is studying");
    }
    public void askteacher(){
        System.out.println(name + " is asking " + teacherName);
    }

}
