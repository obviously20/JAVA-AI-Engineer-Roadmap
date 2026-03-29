package learing.advancedSets.myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class EnhancedForAndLambda {
    public static void main(String[] args) {
        /*Col1ection系列集合三种通用的遍历方式:
        1.迭代器遍历
        2.增强for遍历（todo 只能用于所有的单列集合和数组）
        3.1ambda表达式遍历
        增强for格式:
        for(数据类型 变量名:集合/数组){

        }

        快捷：集合名.for
        */


        Collection<String> coll = new ArrayList<>();
        coll.add("A");
        coll.add("B");
        coll.add("C");

        //增强for本质上还是迭代器遍历，可以把String s 当作是一个临时变量(String str = it.next()的第三方变量)，每次循环都获取到集合中的一个元素
        //故：
        //增强for的细节
        //修改增强for中的变量s，不会改变集合中原本的数据。
        //2.增强for遍历
        for (String s : coll) {
//            s = "ppp";
            System.out.println(s);
        }
        System.out.println(coll);//结果：A B C


        System.out.println("---------------");

        //3.lambda遍历
        //forEach底层原理：
        //其实它也会从头一个一个遍历集合中的元素，然后把元素传递给accept方法
        //故s依次表示集合中的每个元素
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });




    }
}
