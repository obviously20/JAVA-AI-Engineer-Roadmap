package learing.advancedSets.myList;

import java.util.ArrayList;

public class Expand {
    //拓展:remove方法 1.删除指定元素 2.删除指定索引处的元素
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        //todo 因为在调用方法的时候，如果方法出现了重载现象//优先调用，实参跟形参类型一致的那个方法。
        //  此时remove方法是不会自动装箱的。

        //删除指定元素(Object obj)
        //删除指定元素，返回是否删除成功
        Integer i = Integer.valueOf(2);
        //这里的remove方法优先调用的是Object类型的remove方法，因为i是Integer类型的，而remove方法是重载的，所以会调用Object类型一致的那个方法。
        System.out.println(list.remove(i));//true
        System.out.println(list);//[1,3]

        //删除指定索引处的元素
        //这里的remove方法优先调用的是int类型的remove方法，因为1是int类型的，而remove方法是重载的，所以会调用int类型一致的那个方法（索引处的元素）。
        System.out.println(list.remove(1));//3
        System.out.println(list);//[1]





    }
}
