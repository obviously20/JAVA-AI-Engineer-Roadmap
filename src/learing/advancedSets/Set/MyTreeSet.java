package learing.advancedSets.Set;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class MyTreeSet {
    public static void main(String[] args) {
        //TreeSet 是一个可排序（由小到大）的集合，元素是唯一的，不能重复添加
        //TreeSet 的基本应用

        //先示例添加Integer类型的元素
        TreeSet<Integer> treeSet = new TreeSet<>();


        //todo 乱序添加元素，但TreeSet会默认按照由小到大的顺序排序添加的元素（底层是红黑树）
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(6);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);

//        //打印出来的是升序:[1, 2, 3, 4, 5, 6]
//        System.out.println(treeSet);

        //也是有Set的3种遍历方式
        //1.迭代器
        Iterator<Integer> it = treeSet.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }
        System.out.println("-----------------");

        //2.增强for循环
        for (Integer i : treeSet) {
            System.out.println(i);
        }
        System.out.println("-----------------");

        //3.lambda表达式
//        treeSet.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });

//        treeSet.forEach((Integer integer) ->{
//                System.out.println(integer);
//            }
//        );

        treeSet.forEach(integer -> System.out.println(integer));

        //todo TreeSet集合默认的规则
        //  对于数值类型:Integer，Double，默认按照从小到大的顺序进行排序。
        //  对于字符、字符串类型:按照字符在ASCII码表中的数字升序进行排序。
        //  aaa<aab<c:aaa和aab比较第一个字符相同则比较第二个字符，以此类推，
        //  第3个字符不同则比较第3个字符：而在ASCII码表中，a的ASCII码值为97，b的ASCII码值为98，c的ASCII码值为99，所以aaa<aab。
        //  而c>a ，所以c>aaa。



    }
}
