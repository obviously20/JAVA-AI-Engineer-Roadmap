package learing.advancedSets.methodReference.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import learing.advancedSets.methodReference.Student;

public class H2 {
    public static void main(String[] args) {
        //练习2:创建集合添加学生对象，学生对象属性:name，age只获取姓名并放到数组当中(使用方法引用完成)
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, new Student("张三", 23), new Student("李四", 24), new Student("王五", 25));
        String[] arr = list.stream().
                map(Student::getName)//将Student对象转换为String类型(引用getName()方法)
                .toArray(String[]::new);//创建String类型的数组

//        for (String s : arr) {
//            System.out.println(s);
//        }
        System.out.println(Arrays.toString(arr));
    }
}
