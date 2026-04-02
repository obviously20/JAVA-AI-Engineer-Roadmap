package learing.advancedSets.myMap.myLinkadHM;

import java.util.LinkedHashMap;

public class MyLinkedHashMap {
    public static void main(String[] args) {
        //LinkedHashMap:
        //由键决定:
        //有序、不重复、无索引。
        //有序:
        //保证存储和取出的顺序一致
        //原理:
        //底层数据结构是依然哈希表，只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序。

        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("b",1);
        lhm.put("a",2);
        lhm.put("c",3);
        //如果键已经存在，会覆盖旧的值
        lhm.put("a",4);
        System.out.println(lhm);
    }
}
