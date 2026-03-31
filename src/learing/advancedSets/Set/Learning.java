package learing.advancedSets.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class Learning {
    public static void main(String[] args) {
        /*利用Set系列的集合，添加字符串，并使用多种方式遍历。
        迭代器
        增强for
        Lambda表达式*/

        //Set系列集合的特点
        //无序、不重复、无索引
        //Set集合的方法上基本上与Collection的API一致

        Set<String> set = new HashSet<>();
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        set.add("zhangsan");
        System.out.println(set.add("zhangsan"));//false

        //迭代器遍历
        //结果:
//        lisi
//        zhangsan
//        wangwu
        //无序：遍历取出的元素顺序和添加顺序顺序不同
//        Iterator<String> iterator = set.iterator();
//        while(iterator.hasNext()){
//            String s = iterator.next();
//            System.out.println(s);
//
//        }

//        //增强for遍历
//        for (String s : set) {
//            System.out.println(s);
//        }


        //Lambda表达式遍历
//        set.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        set.forEach((s) ->System.out.println(s));


        //Set集合的实现类特点
        //HashSet:无序、不重复、无索引
        //LinkedHashSet:有序、不重复、无索引
        //TreeSet:可排序、不重复、无索引


    }
}
