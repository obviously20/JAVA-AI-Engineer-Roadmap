package learing.reflection.getMethod;

import java.lang.reflect.InvocationTargetException;

public class Student {
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

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }



    public void sleep() {
        System.out.println("我在睡觉");
    }

    private String study(String subject) throws Exception, IllegalAccessException , InvocationTargetException {
        System.out.println("我在学习" + subject);
        return "好好学习！";
    }

    private void eat(String food) {
        System.out.println("我在吃" + food);
    }








}
