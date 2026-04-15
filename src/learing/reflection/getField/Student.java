package learing.reflection.getField;

public class Student {
    private String name;
    private int age;
    public String gander;


    public Student() {
    }

    public Student(String name, int age, String gander) {
        this.name = name;
        this.age = age;
        this.gander = gander;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gander
     */
    public String getGander() {
        return gander;
    }

    /**
     * 设置
     * @param gander
     */
    public void setGander(String gander) {
        this.gander = gander;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", gander = " + gander + "}";
    }
}
