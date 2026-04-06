package learing.advancedSets.myStream.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Test1 {
    public static void main(String[] args) {
        //数据过滤
        //定义一个集合，并添加一些整数1，2,3,4，5，6，7，8,9,10
        //过滤奇数，只留下偶数。
        //并将结果保存起来

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        Integer[] integers = list.stream().filter(i -> i%2==0).toArray(new IntFunction<Integer[]>() {
//            @Override
//            public Integer[] apply(int value) {
//                return new Integer[value];
//            }
//        });
        Integer[] integers = list.stream().filter(i -> i%2==0).toArray(value -> new Integer[value]);
        System.out.println(Arrays.toString(integers));



    }
}
