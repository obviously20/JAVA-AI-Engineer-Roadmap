package learing.advancedSets.myCollections.homework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        /*班级里有N个学生，学生属性:姓名，年龄，性别。
        实现随机点名器。*/

        //1.创建学生
        Student s1 = new Student("张三", 18, "男");
        Student s2 = new Student("李四", 19, "女");
        Student s3 = new Student("王五", 20, "男");
        Student s4 = new Student("赵六", 21, "女");
        Student s5 = new Student("王二", 22, "男");

        //2.创建集合
        ArrayList<Student> list = new ArrayList<>();
        //3.添加学生到集合
        Collections.addAll(list, s1, s2, s3, s4, s5);
        //4.创建随机点名器
        //法1：先打乱，再取第一个
        Collections.shuffle(list);
        System.out.println(list.get(0).getName());

        //法2：随机取一个
        Random random = new Random();
        int index =random.nextInt(list.size());
        System.out.println(list.get(index).getName());



    }
}
