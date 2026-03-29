package learing.advancedSets.myList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Learning {
    public static void main(String[] args) {
        //List是Collection系列集合的一种，是有序的，可以重复的集合，有索引
        //且可以使用Collection系列集合的方法，也可以使用List系列集合的方法


        //### List集合的特有方法【应用】
        //- 方法介绍
        //| 方法名                          | 描述                                   |
        //| ------------------------------- | -------------------------------------- |
        //| void add(int index,E   element) | 在此集合中的指定位置插入指定的元素     |
        //| E remove(int   index)           | 删除指定索引处的元素，返回被删除的元素 |
        //| E set(int index,E   element)    | 修改指定索引处的元素，返回被修改的元素 |
        //| E get(int   index)              | 返回指定索引处的元素                   |


//        ArrayList<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//
//        //add方法
//        //在指定位置插入指定的元素，然后其他元素向后移动一个位置引
//        //如果指定位置等于集合的大小，就直接添加到集合的末尾
//        //如果指定位置大于/小于出IndexOutOfBoundsException异常
//        list.add(2,"E");
//        System.out.println(list);
//        list.add(5,"F");
//        System.out.println(list);
//
//        //remove方法
//        //删除指定索引处的元素，返回被删除的元素
//        //如果指定索引超出集合的范围，就出IndexOutOfBoundsException异常
//        list.remove(2);
//        System.out.println(list);
//
//        //set方法
//        list.set(2,"G");
//        System.out.println(list);//[A,B,G,D,F]
//
//        //get方法
//        System.out.println(list.get(0));//A

        //### List集合的五种遍历方式【应用】
        //
        //1. 迭代器
        //2. 列表迭代器
        //3. 增强for
        //4. Lambda表达式
        //5. 普通for循环

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        //1. 迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("-----------------");

        //2. 增强for
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        //3. Lambda表达式
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        list.forEach((String s) -> {
//                System.out.println(s);
//            }
//        );

        //最终版本
        list.forEach(s -> System.out.println(s));

        System.out.println("-----------------");

        //4. 普通for循环
        //索引遍历：size()&get()
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
        System.out.println("-----------------");



        //5. ListIterator(列表迭代器)
        java.util.ListIterator<String> it2 = list.listIterator();
        while (it2.hasNext()){
            String str = it2.next();
            System.out.println(str);
        }
        System.out.println("-----------------");

        ////可以add 和 remove(列表里面的方法)-->只能用迭代器的add()方法添加元素,不能用集合的add()方法添加元素否则会出异常
        ListIterator<String> it3 = list.listIterator();
        while (it3.hasNext()) {
            String str = it3.next();
            if(str.equals("C")){
                it3.add("G");
            }
            System.out.println(str);
        }
        System.out.println(list);//[A,B,G,D,E]






    }
}
