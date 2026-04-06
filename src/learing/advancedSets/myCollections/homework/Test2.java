package learing.advancedSets.myCollections.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        ///*班级里有N个学生，学生属性:姓名，年龄，性别。
        //实现随机点名器。其中抽到男生的概率是70%，抽到女生的概率是30%。*/


        //1.创建学生
        Student s1 = new Student("张男", 18, "男");
        Student s2 = new Student("李女", 19, "女");
        Student s3 = new Student("王男", 20, "男");
        Student s4 = new Student("赵女", 21, "女");
        Student s5 = new Student("王二", 22, "男");
        Student s6 = new Student("赵六", 23, "女");

        //创建男生集合
        ArrayList<Student> maleList = new ArrayList<>();
        Collections.addAll(maleList, s1, s3, s5);
        //创建女生集合
        ArrayList<Student> femaleList = new ArrayList<>();
        Collections.addAll(femaleList, s2, s4, s6);


        //2.创建概率集合 男：1 女：0 表示
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);
        //3.打乱集合
        Collections.shuffle(list);
        //4.随机取一个
        Random random = new Random();
        int i = random.nextInt(list.size());
        int sex = list.get(i);
        System.out.println(sex);
        //5.判断是男还是女
        if(sex == 1){
            int index = random.nextInt(maleList.size());
            System.out.println(maleList.get(index).getName());
        }else{
            int index = random.nextInt(femaleList.size());
            System.out.println(femaleList.get(index).getName());
        }







    }
}
