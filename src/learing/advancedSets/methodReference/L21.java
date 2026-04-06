package learing.advancedSets.methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class L21 {
    public static void main(String[] args) {
        // 1. 创建集合
        ArrayList<String> list = new ArrayList<>();
        // 2. 添加测试数据
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        //名字是张开头且长度为3的姓名
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("张") && s.length() == 3;
//            }
//        }).forEach(s -> System.out.println(s));

        //方法引用：引用   其他类的方法new L211()::方法名-->可以调用其他类的所有方法(区别于类名::方法名)
        // 1. 创建对象
        L211 l211 = new L211();
        // 2. 调用方法
        list.stream().filter(l211::test).forEach(s -> System.out.println(s));





    }
}
