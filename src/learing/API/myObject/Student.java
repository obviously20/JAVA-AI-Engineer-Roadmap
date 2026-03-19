package learing.API.myObject;

import java.util.Objects;

public class Student  {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

//    @Override
//    public String toString() {
//        return "Student{name = " + name + ", age = " + age + "}";
//    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //如果o是this对象本身，返回true
        if (this == o) return true;
        //如果o是null，或者o的类不是Student类，返回false
        if (o == null || getClass() != o.getClass()) return false;
        //将o转换为Student类型
        Student student = (Student) o;
        //比较age属性和name属性是否相等
        return age == student.age && Objects.equals(name, student.name);
    }

}
