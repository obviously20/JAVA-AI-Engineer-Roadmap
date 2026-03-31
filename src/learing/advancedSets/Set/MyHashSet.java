package learing.advancedSets.Set;

import java.util.Set;
import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        //根据hashCode方法算出来的int类型的整数
        // 该方法定义在Object类中，所有对象都可以调用，默认使用地址值进行计算
        // 一般情况下，会重写hashCode方法，利用对象内部的属性值计算哈希值

        //哈希值:
        //对象的整数表现形式
        // 1.如果没有重写hashcode方法(按地址值)，不同对象计算出的哈希值是不同的
        // 2.如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
        // 3.但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。(哈希碰撞)

        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("zhangsan", 18);
        Student s3 = new Student("lisi", 20);
        Student s4 = new Student("wangwu", 21);

        //2.如果没有重写hashcode方法(按地址值)，不同对象计算出的哈希值是不同的
        //如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
        System.out.println(s1.hashCode());//1828972342-->-1461067297
        System.out.println(s2.hashCode());//1452126962（重写hashcode方法后,按照属性值计算）-->-1461067297
        System.out.println(s3.hashCode());//931919113-->102983074
        System.out.println(s4.hashCode());//1607521710-->1120558037

        //哈希碰撞:
        //不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。(哈希碰撞)
        System.out.println("abc".hashCode());//96354
        System.out.println("abD".hashCode());//96354

        //如果集合中存储的是自定义对象，必须要重写hashCode和equals方法
        //HashSet是利用什么机制保证数据去重的?
        // 根据对象的哈希值和equals方法判断是否重复


        System.out.println("-----------------");


        //需求:创建一个存储学生对象的集合，存储多个学生对象。
        //使用程序实现在控制台遍历该集合。
        //要求:学生对象的成员变量值相同，我们就认为是同一个对象


        //todo 如果HashSet里面存储的是自定义对象，那一定要重写hashCode() 和 equals()
        // 如果是String Integer类方法已经重写过
        Set<Student> set = new HashSet<>();



//        //上面已经有了
//        Student s1 = new Student("zhangsan", 18);
//        Student s2 = new Student("zhangsan", 18);
//        Student s3 = new Student("lisi", 20);
//        Student s4 = new Student("wangwu", 21);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        //遍历集合
        System.out.println(set);
        //[Student{name = lisi, age = 20}, Student{name = zhangsan, age = 18}, Student{name = wangwu, age = 21}]






    }
}
