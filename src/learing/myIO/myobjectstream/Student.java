package learing.myIO.myobjectstream;

import java.io.Serial;
import java.io.Serializable;

//Serializable接口
//todo 实现Serializable接口的类，就可以被序列化
//序列化:把对象转换为字节数组
//反序列化:把字节数组转换为对象

//需求:
//把一个对象序列化到文件中去

//实现Serializable接口
public class Student implements Serializable {


    //serialVersionUID:序列化版本号
    //如果一个类实现了Serializable接口，那么该类中必须添加serialVersionUID字段
    //serialVersionUID字段的类型必须是long类型
    //serialVersionUID字段的值必须是唯一的
    @Serial
    private static final long serialVersionUID = -2412910067575749695L;
    private String name;
    private int age;
    //transient:不参与序列化
//    private transient String address;


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
}
