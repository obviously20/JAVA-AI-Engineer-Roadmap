package learing.advancedSets.myStream;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //案例需求
        //
        //按照下面的要求完成集合的创建和遍历
        //
        //- 创建一个集合，存储多个字符串元素
        //- 把集合中所有以"张"开头的元素存储到一个新的集合
        //- 把"张"开头的集合中的长度为3的元素存储到一个新的集合
        //- 遍历上一步得到的集合

        //集合的批量添加
        ArrayList<String> list1 = new ArrayList<>(List.of("张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤"));

        ArrayList<String> list2 = new ArrayList<>();

        ArrayList<String> list3 = new ArrayList<>();

//        ArrayList<String> list4 = new ArrayList<>();

        for (String name : list1) {
            if (name.startsWith("张")) {
                list2.add(name);
            }
        }
        for (String name : list2) {
            if (name.length() == 3) {
                list3.add(name);
            }
        }

//        for (String name : list1) {
//            if (name.startsWith("张") && name.length() == 3) {
//                list4.add(name);
//            }
//        }

        for (String name : list3) {
            System.out.println(name);
        }

//        System.out.println(list4);

        //Stream流
        list1.stream().filter(s->s.startsWith("张"))
                .filter(s->s.length() == 3)
                .forEach(s-> System.out.println(s));


    }
}
