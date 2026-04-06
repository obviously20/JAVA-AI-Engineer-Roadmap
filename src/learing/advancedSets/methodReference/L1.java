package learing.advancedSets.methodReference;

import java.util.ArrayList;
import java.util.Collections;

public class L1 {
    public static void main(String[] args) {
        //静态方法引用
        // 1. 创建字符串类型的ArrayList集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        // 一次性添加多个元素
        Collections.addAll(list, "1", "2", "3", "4", "5");

        // ---------------------- 方式1：匿名内部类实现 Function 接口 ----------------------
        // Stream流的map方法需要 Function 函数式接口（输入String，输出Integer）
        /*
        list.stream()
            .map(new Function<String, Integer>() {
                @Override
                public Integer apply(String s) {
                    // 核心逻辑：将字符串转换为整数
                    int i = Integer.parseInt(s);
                    return i;
                }
            })
            // 遍历转换后的整数
            .forEach(s -> System.out.println(s));
         */

        // 重新初始化集合，用于后续Lambda/方法引用演示
        list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

        // ---------------------- 方式2：Lambda表达式（简化格式） ----------------------
        // 原理：Function是函数式接口，Lambda直接实现抽象方法 apply
        list.stream()
                // Lambda简化：参数s自动推断为String，直接执行parseInt转换
                .map(s -> Integer.parseInt(s))
                // 遍历输出
                .forEach(System.out::println);

        // 重新初始化集合，用于方法引用演示
        list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

        // ---------------------- 方式3：方法引用 ----------------------
        // 方法引用满足的核心规则：
        // 1. 被引用的方法已存在：Integer类的静态方法 parseInt(String s)
        // 2. 形参/返回值匹配：Function<String, Integer> 要求输入String、返回Integer
        //    而 parseInt(String s) 正好是 输入String、返回int（自动拆装箱兼容）
        // 3. 功能匹配：将字符串转换为整数
        list.stream()
                //todo 静态方法引用语法：类名::方法名
                .map(Integer::parseInt)
                // 遍历输出（也是方法引用：System.out的println方法）
                .forEach(System.out::println);
    }
}
