package learing.advancedSets.myCollection;

import java.util.ArrayList;
import java.util.Collection;

public class MyCollection {
    public static void main(String[] args) {
        /*
        public boolean add(E e)             添加
        public void clear()                清空
        public boolean remove(E e)         删除
        public boolean contains(Object obj)判断是否包含
        public boolean isEmpty()           判断是否为空
        public int size()                  集合长度

        注意点:
       Collection是一个接口,我们不能直接创建他的对象。
      所以,现在我们学习他的方法时,只能创建他实现类的对象。
        实现类: ArrayList
*/

        //目的: 为了学习Collection接口里面的方法
        //自己在做一些练习的时候,还是按照之前的方式去创建对象。
        Collection<String> coll = new ArrayList<>();

        //添加元素
        //细节1：若添加的是List集合，那么可以添加重复元素
        //细节2：若添加的是Set集合，那么不能添加重复元素，若添加重复元素，会返回false，那么不会添加，若添加的是新元素，会返回true，那么会添加
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

//        //清空集合
//        coll.clear();
//        System.out.println(coll);

        //删除元素
        //细节1:这里collection.remove()方法删除是共性的方法（List集合和Set集合都可以使用），
        // 但是Set集合没有索引，所以remove()方法删除是根据两者都有的共性：元素对象来删除的
        //细节2：方法会有一个boolean类型的返回值，若删除的是不存在的元素，会返回false，那么不会删除
        coll.remove("bbb");
        System.out.println(coll);
//        //或
//        boolean b = coll.remove("aaa");
//        System.out.println(b);
//        System.out.println(coll);


        //判断是否包含
        //细节1：方法会有一个boolean类型的返回值，若包含，会返回true，若不包含，会返回false
        //todo 若要判断自定义的类是否包含，需要在自定义类中去重写equals()方法；
        // 因为contains()方法是根据Object的equals()方法来判断是否包含的,而Object的equals()方法是根据地址值来判断是否包含的
        boolean b = coll.contains("bbb");
        System.out.println(b);

        //判断是否为空
        boolean isEmpty = coll.isEmpty();
        System.out.println(isEmpty);//false


        //集合长度
        int size = coll.size();
        System.out.println(size);//2





    }
}
