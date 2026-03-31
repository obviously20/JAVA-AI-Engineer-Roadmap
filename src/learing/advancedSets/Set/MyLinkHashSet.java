package learing.advancedSets.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MyLinkHashSet {
    // 有序、不重复、无索引。
    //todo：这里的有序指的是保证存储和取出的元素顺序一致
    //原理:底层数据结构是依然哈希表，只是每个元素又额外的多了一个双链表的机制记录存储的顺序。实现的HashSet集合
    public static void main(String[] args) {
        //创建集合
        Set<Student> set = new LinkedHashSet<>();
        //添加元素
        set.add(new Student("张三", 18));
        set.add(new Student("李四", 19));
        set.add(new Student("王五", 20));
        System.out.println(set);
        //[Student{name = 张三, age = 18}, Student{name = 李四, age = 19}, Student{name = 王五, age = 20}]

        //LinkedHashSet集合的特点和原理是怎么样的?
        //有序、不重复、无索引
        //底层基于哈希表，使用双链表记录添加顺序
        //在以后如果要数据去重，我们使用哪个?
        //默认使用HashSet
        //如果要求去重且存取有序，才使用LinkedHashSet
    }
}
