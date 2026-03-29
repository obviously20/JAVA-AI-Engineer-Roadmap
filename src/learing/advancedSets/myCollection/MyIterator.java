package learing.advancedSets.myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyIterator {
    public static void main(String[] args) {
        //1.迭代器
        /*Iterator<String> it = list.iterator();
           while(it.hasNext()){
                String str = it.next();
                System.out.println(str);}*/

        //注意点：迭代器在遍历集合的时候是不依赖索引的
        //迭代器的四个细节:
        //1.如果当前位置没有元素，还要强行获取，会报NoSuchElementException
        //2.迭代器遍历完毕，指针不会复位
        //3.循环中只能用一次next方法
        //4.迭代器遍历时，不能用集合的方法进行增加或者删除


        Collection<String> coll = new ArrayList<>();
        coll.add("A");
        coll.add("B");
        coll.add("C");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String str =  it.next();
            System.out.println(str);
        }

//        //1
//        System.out.println(it.next());//报错：NoSuchElementException

        //2
//        System.out.println(it.hasNext());//false
//        //如果要再次遍历，需要重新获取迭代器
//        Iterator<String> it2 = coll.iterator();
//        while (it2.hasNext()){
//            String str =  it2.next();
//            System.out.println(str);
//        }

        //3
        //一个it.hasNext()方法对应一个next()方法，不能用多个next()方法，否者会报错
//        Iterator<String> it2 = coll.iterator();
//        while (it2.hasNext()){
//            System.out.println(it2.next());//A      C
//            System.out.println(it2.next());//B      NoSuchElementException
//        }

        //4迭代器遍历时，不能用集合的方法进行增加或者删除
        //如果要删除元素，只能用迭代器的方法,remove()方法
        Iterator<String> it2 = coll.iterator();
        while (it2.hasNext()){
            String str =  it2.next();
            if(str.equals("B")){
                it2.remove();
            }
            System.out.println(str);
        }
        System.out.println(coll);//[A, C]






    }
}
