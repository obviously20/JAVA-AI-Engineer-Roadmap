package learing.advancedSets.methodReference.homework;

import learing.advancedSets.methodReference.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class H1 {
    public static void main(String[] args) {
        //练习1:集合中存储一些字符串的数据，比如:张三,23。
        // 收集到Student类型的数组当中(使用方法引用完成)

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三,23", "李四,24", "王五,25");
        Student[] arr = list.stream()
                .map(Student::new)//将字符串转换为Student对象(引用构造方法，要在Student类中定义构造方法)
                .toArray(Student[]::new);//创建Student类型的数组
        System.out.println(Arrays.toString(arr));


    }
}
