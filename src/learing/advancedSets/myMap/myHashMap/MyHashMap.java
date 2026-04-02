package learing.advancedSets.myMap.myHashMap;

import java.util.*;

public class MyHashMap {
    public static void main(String[] args) {
        // 1.HashMap底层是哈希表结构的
        // 2.依赖hashCode方法和equals方法保证 键的唯一
        // 3.如果键存储的是自定义对象，需要重写hashCode和equals方法
        // 如果值存储自定义对象，不需要重写hashCode和equals方法

//        /*存储三个键值对元素，并遍历要求:同姓名，同年龄认为是同一个学生
//        需求:创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)
//
//
//        核心点:
//        HashMap的键位置如果存储的是自定义对象，需要重写hashCode和equals方法。
//        */
//
//        HashMap<Student,String> md = new HashMap<>();
//        md.put(new Student("张三",18),"北京");
//        md.put(new Student("李四",20),"上海");
//        md.put(new Student("王五",22),"广州");
//
//        md.forEach(new BiConsumer<Student, String>() {
//            @Override
//            public void accept(Student student, String s) {
//                System.out.println(student+"="+s);
//            }
//        });
//
//        System.out.println("-----------------");
//
//        md.forEach((Student student, String s) -> System.out.println(student+"="+s));
//
//        System.out.println("-----------------");
//
//        Set<Student> keys = md.keySet();
//        for (Student key : keys) {
//            String value = md.get(key);
//            System.out.println(key+"="+value);
//        }
//
//        System.out.println("-----------------");
//
//        Set<Map.Entry<Student,String>> entrySet = md.entrySet();
//        for (Map.Entry<Student, String> studentStringEntry : entrySet) {
//            System.out.println(studentStringEntry.getKey()+"="+studentStringEntry.getValue());
//        }






        /*某个班级80名学生，现在需要组成秋游活动，
        班长提供了四个景点依次是(A、B、C、D)，
        每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。*/

        // 1.创建一个字符串数组，用于存储所有学生的景点
        String[] places = {"A","B","C","D"};
        //2.创建一个ArrayList集合，用于存储所有学生的景点选择
        ArrayList<String> choosePlaces = new ArrayList<>();
        // 3.模拟80个学生的景点选择
        Random rand = new Random();
        for(int i=0;i<80;i++){
            int index = rand.nextInt(places.length);
            choosePlaces.add(places[index]);
        }

        //4.统计出每个景点想去的人数
        HashMap<String,Integer> hm = new HashMap<>();
        for (String choosePlace : choosePlaces) {
            if(hm.containsKey(choosePlace)){
                //如果hm集合中已经存在choosePlace，说明choosePlace想去的人数加1
                int chooseCount = hm.get(choosePlace);
                chooseCount++;
                hm.put(choosePlace,chooseCount);
            }else {
                hm.put(choosePlace,1);
            }
        }

        System.out.println(hm);

        //5.选出最大的投票数
        int max = 0;
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            int chooseCount = hm.get(key);
            if(chooseCount>max){
                max = chooseCount;
            }
        }
        System.out.println("最大的投票数是:"+max);

        //6.选出最大的投票数对应的景点
        for (String key : keys) {
            int chooseCount = hm.get(key);
            if(chooseCount==max){
                System.out.println("最大的投票数对应的景点是:"+key);
            }
        }













    }
}
