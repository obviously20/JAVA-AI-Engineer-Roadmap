package learing.advancedSets.myCollections.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    //班级里有5个学生
    //要求:
    //被点到的学生不会再被点到。
    //I但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。
    public static void main(String[] args) {
//        //1.创建集合
//        ArrayList<String> list1 = new ArrayList<>();
//        //2.添加学生
//        Collections.addAll(list1, "张三", "李四", "王五", "赵六", "钱七");
//        //3.随机点名
//        Random r =new Random();
//        int index = r.nextInt(list1.size());
////        System.out.println(list1.get(index));
////        //4.删除被点到的学生:被点到的学生不会再被点到
////        list1.remove(index);//删除索引为index的学生，并返回删除的学生姓名
//        System.out.println(list1.remove(index));
//        //点完一轮，需要重新开启第二轮点名。-->需要另一个集合来存储被点到的学生，而不是直接删除原集合中的学生
//        ArrayList<String> list2 = new ArrayList<>();

//        //综上：
//        //以下是抽取完一轮后的操作
//
//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
//        Collections.addAll(list1, "张三", "李四", "王五", "赵六", "钱七");
//
//        //判断是否需要重新开启第二轮点名
//        int count = list1.size();
//
//        for (int i = 0; i < count; i++) {
//            Random rand = new Random();
//            int index = rand.nextInt(list1.size());
//            list2.add(list1.get(index));
//            System.out.println(list1.remove(index));
//        }
//
//        //重新开启第二轮点名,准备
//
////        //抽取完一轮后list1为空
////        System.out.println(list1);//[]
////        System.out.println(list2);//[钱七, 王五, 赵六, 李四, 张三]
//
//        list1.addAll(list2);
//        list2.clear();
//
////        System.out.println(list1);//[钱七, 王五, 赵六, 李四, 张三]
////        System.out.println(list2);//[]

        //综上：
       // 假设要抽5轮

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list1, "张三", "李四", "王五", "赵六", "钱七");

        for(int i=0;i<5;i++){
            System.out.println("-----------------第"+(i+1)+"轮点名------------------");
            //判断是否需要重新开启第二轮点名
            int count = list1.size();

            for (int j = 0; j < count; j++) {
                Random rand = new Random();
                int index = rand.nextInt(list1.size());
                list2.add(list1.get(index));
                System.out.println(list1.remove(index));
            }

            //重新开启第二轮点名,准备

//        //抽取完一轮后list1为空
//        System.out.println(list1);//[]
//        System.out.println(list2);//[钱七, 王五, 赵六, 李四, 张三]

            list1.addAll(list2);
            list2.clear();

//        System.out.println(list1);//[钱七, 王五, 赵六, 李四, 张三]
//        System.out.println(list2);//[]
        }




    }
}
