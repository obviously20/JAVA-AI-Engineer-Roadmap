package learing.advancedSets.methodReference.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

import learing.advancedSets.methodReference.Student;

public class H3 {
    public static void main(String[] args) {
        //练习3:创建集合添加学生对象，学生对象属性:name，age
        //把姓名和年龄拼接成:张三-23的字符串，并放到数组当中(使用方法引用完成)
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, new Student("张三", 23), new Student("李四", 24), new Student("王五", 25));
//        String[] students = list.stream().map(new Function<Student, String>() {
//            @Override
//            public String apply(Student student) {
//                return student.getName() + "-" + student.getAge();
//            }
//        }).toArray(String[]::new);
        String[] students = list.stream().map(Student::toStringH3).toArray(String[]::new);
        System.out.println(Arrays.toString(students));
    }
}
