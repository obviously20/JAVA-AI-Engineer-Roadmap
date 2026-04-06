package learing.advancedSets.myStream.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        //数据操作
        //现在有两个ArrayList集合，
        //第一个集合中:存储6名男演员的名字和年龄。第二个集合中:存储6名女演员的名字和年龄。
        //姓名和年龄中间用逗号隔开。比如:张三,23
        //要求完成如下的操作:
        //1，男演员只要名字为3个字的前两人
        //2，女演员只要姓杨的，并且不要第一个
        //3，把过滤后的男演员姓名和女演员姓名合并到一起
        //4，将上一步的演员信息封装成Actor对象。
        //5，将所有的演员对象都保存到List集合中。
        //备注:演员类Actor，属性有:name,age

        ArrayList<String> manlist = new ArrayList<String>();
        Collections.addAll(manlist, "张三疯,23", "李四狗,24", "王五人,25", "赵六,26", "王二,27", "麻子,28");
        ArrayList<String> womanlist = new ArrayList<String>();
        Collections.addAll(womanlist, "杨芳,23", "小绿,24", "小黄,24", "杨粉,25", "小紫,26", "小蓝,27");

        //1.男演员只要名字为3个字的前两人
        manlist.stream().filter(s -> s.split(",")[0].length() == 3).limit(2).forEach(s -> System.out.println(s.split(",")[0]));
        System.out.println("-----------------");

        //2.女演员只要姓杨的，并且不要第一个
        womanlist.stream().filter(s -> s.split(",")[0].startsWith("杨")).skip(1).forEach(s -> System.out.println(s.split(",")[0]));
        System.out.println("-----------------");

        //3.把过滤后的男演员姓名和女演员姓名合并到一起
        Stream.concat(manlist.stream().filter(s -> s.split(",")[0].length() == 3).limit(2)
                , womanlist.stream().filter(s -> s.split(",")[0].startsWith("杨")).skip(1)).forEach(s -> System.out.println(s.split(",")[0]));
        System.out.println("-----------------");

        //4.将上一步的演员信息封装成Actor对象。
//        Stream.concat(manlist.stream().filter(s->s.split(",")[0].length()==3).limit(2)
//                ,womanlist.stream().filter(s->s.split(",")[0].startsWith("杨")).skip(1))
//                .forEach(new Consumer<String>() {
//                    @Override
//                    public void accept(String s) {
//                        Actor actor = new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]));
//                        System.out.println(actor);
//                    }
//                });
        Stream.concat(manlist.stream().filter(s -> s.split(",")[0].length() == 3).limit(2)
                        , womanlist.stream().filter(s -> s.split(",")[0].startsWith("杨")).skip(1))
                .forEach(s -> {
                            Actor actor = new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]));
                            System.out.println(actor);
                        }
                );

        System.out.println("-----------------");
        //5.将所有的演员对象都保存到List集合中。
        List<Actor> actors = Stream.concat(manlist.stream(), womanlist.stream()).map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]))).collect(Collectors.toList());
        System.out.println(actors);


    }
}
