package learing.advancedSets.Set;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Student implements Comparable<Student> {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // 按年龄排序
    @Override
    public int compareTo(@NotNull Student o) {
        System.out.println("this:" + this);
        System.out.println("o:" + o);
        System.out.println("---------------");
        return this.age - o.age;
        //假如当前的年龄小于o的年龄，返回负数，就排在o的左边，但o的左边又有其他元素，那就会继续调用compareTo方法，直到找到this适合的位置
        //元素添加是根据红黑树的规则，将元素插入到树中（插入时会根据红黑树的规则，调整树的结构，保持树的平衡）
    }
}
