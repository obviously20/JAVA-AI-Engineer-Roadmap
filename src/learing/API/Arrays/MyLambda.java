package learing.API.Arrays;

import java.util.Arrays;

public class MyLambda {
    public static void main(String[] args) {
        /*
Lambda表达式的注意点：
    1.Lambda表达式可以用来简化匿名内部类的书写
    2.Lambda表达式只能简化函数式接口的匿名内部类的写法
    3.只能在函数式接口的场景下使用lambda表达式
    函数式接口：
        有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加@FunctionalInterface注解
*/

//1.利用匿名内部类的形式去调用下面的方法
//调用一个方法的时候，如果方法的形参是一个接口，那么我们要传递这个接口的实现类对象
//如果实现类对象只要用到一次，就可以用匿名内部类的形式进行书写

/*
method(new Swim() {
    @Override
    public void swimming() {
        System.out.println("正在游泳~~~");
    }
});
*/

        //2.利用lambda表达式进行改写
        method(() -> {
                    System.out.println("正在游泳~~~");
                }
        );



        /*
lambda的省略规则：
    1.参数类型可以省略不写。
    2.如果只有一个参数，参数类型可以省略，同时()也可以省略。
    3.如果Lambda表达式的方法体只有一行，大括号，分号，return可以省略不写，需要同时省略。
*/

        Integer[] arr = {1, 3, 2, 4, 5};
        // 原始完整写法
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o2 - o1;
        });

// 规则1：省略参数类型
        Arrays.sort(arr, (o1, o2) -> {
            return o2 - o1;
        });

// 规则3：方法体只有一行，省略大括号、分号、return
        Arrays.sort(arr, (o1, o2) -> o2 - o1);

// 单参数示例（规则2）
//// 原始写法
//        method((String s) -> {
//            System.out.println(s);
//        });
//// 省略参数类型+()
//        method(s -> System.out.println(s));

    }

    public static void method(Swim swim) {
        swim.swimming();
    }


}

interface Swim {
    public abstract void swimming();
}
