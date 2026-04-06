package learing.advancedSets.immutableSet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Learning {
    public static void main(String[] args) {
        // 不可变的list集合
        /*
            创建不可变的List集合
            "张三", "李四", "王五", "赵六"
        */

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        List<String> list = List.of("张三", "李四", "王五", "赵六");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------------------------");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // 一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
//        list.add("王二");
//        list.remove("张三");

        System.out.println("----------------------------------");

        //------------------------------------------------------------------

        /*
           创建不可变的Set集合
           "张三", "李四", "王五", "赵六"


           细节：
                当我们要获取一个不可变的Set集合时，里面的参数一定要保证唯一性
        */
        Set<String> set = Set.of("张三", "李四", "王五", "赵六");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("----------------------------------");

//        set.add("王二");
//        set.remove("张三");

        System.out.println("----------------------------------");

        //-----------------------------------------------------------------

        //### 不可变的Map集合
        //
        //####键值对个数小于等于10
         /*
        创建Map的不可变集合
            细节1：
                键是不能重复的
            细节2：
                Map里面的of方法，参数是有上限的，最多只能传递20个参数，10个键值对
            细节3：
                如果我们要传递多个键值对对象，数量大于10个，在Map接口中还有一个方法
        */

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        Map<String, String> map = Map.of("张三", "南京", "李四", "北京", "王五", "上海",
                "赵六", "广州", "孙七", "深圳", "周八", "杭州",
                "吴九", "宁波", "郑十", "苏州", "刘一", "无锡",
                "陈二", "嘉兴");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("----------------------------------");

        Set<String> keySet = map.keySet();
        java.util.Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + "=" + map.get(key));
        }
        System.out.println("----------------------------------");

        // 一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
//        map.put("王二", "北京");
//        map.remove("王五");


        /*
            创建Map的不可变集合,键值对的数量超过10个
        */



        //如果我们要传递多个键值对对象，数量大于10个，在Map接口中还有一个方法，叫做ofEntries
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("张三", "南京");
        map2.put("李四", "北京");
        map2.put("王五", "上海");
        map2.put("赵六", "广州");
        map2.put("孙七", "深圳");
        map2.put("周八", "杭州");
        map2.put("吴九", "宁波");
        map2.put("郑十", "苏州");
        map2.put("刘一", "无锡");
        map2.put("陈二", "嘉兴");
        map2.put("王二", "北京");
        map2.put("王刚", "上海");//12对>10



        //2.利用上面的数据来获取一个不可变的集合
/*
        //获取到所有的键值对对象（Entry对象）
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        //把entries变成一个数组
        Map.Entry[] arr1 = new Map.Entry[0];
        //toArray方法在底层会比较集合的长度跟数组的长度两者的大小
        //如果集合的长度 > 数组的长度 ：数据在数组中放不下，此时会根据实际数据的个数，重新创建数组
        //如果集合的长度 <= 数组的长度：数据在数组中放的下，此时不会创建新的数组，而是直接用
        Map.Entry[] arr2 = entries.toArray(arr1);
        //不可变的map集合
        Map map = Map.ofEntries(arr2);
        map.put("bbb","222");*/

        //简化：将一个HashMap集合转换为不可变的Map集合
        //不可变的Map集合，一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        //Map<Object, Object> map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));

        Set<Map.Entry<String, String>> entrySet2 = map2.entrySet();
        Map<String, String> map3 = Map.ofEntries(entrySet2.toArray(new Map.Entry[0]));

        Set<Map.Entry<String, String>> entrySet3 = map3.entrySet();
        for (Map.Entry<String, String> entry : entrySet3) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("----------------------------------");
//        map3.put("王二", "北京");
//        map3.remove("王五");


        //跟简便的jdk10的
        //将一个HashMap集合转换为不可变的Map集合Map.copyOf()
        Map<String, String> map5 = Map.copyOf(map2);
//        map5.put("bbb","222");





    }
}
