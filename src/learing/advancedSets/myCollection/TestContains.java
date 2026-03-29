package learing.advancedSets.myCollection;

import java.util.ArrayList;
import java.util.Collection;

public class TestContains {
    public static void main(String[] args) {
        //测试contains()方法
        Collection<Student> students = new ArrayList<Student>();
        students.add(new Student("张三", 18));
        students.add(new Student("李四", 19));
        students.add(new Student("王五", 20));

        //判断是否包含
        Student s = new Student("张三", 18);
        boolean b = students.contains(s);
        System.out.println(b);//true

    }
}
