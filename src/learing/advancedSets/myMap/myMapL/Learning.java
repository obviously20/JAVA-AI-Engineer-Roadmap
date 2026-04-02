package learing.advancedSets.myMap.myMapL;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Learning {
    public static void main(String[] args) {
        /*双列集合的特点
        1双列集合一次需要存一对数据，分别为键和值
        键不能重复，值可以重复键和值是一一对应的，每一个键只能找到自己对应的值
        键+值这个整体我们称之为“键值对”或者“键值对对象”，在Java中叫做“Entry对象”*/

        /*
        V put(K key,V value)                添加元素
        V remove(Object key)               根据键删除键值对元素
        void clear()                       移除所有的键值对元素
        boolean containsKey(Object key)    判断集合是否包含指定的键
        boolean containsValue(Object value)判断集合是否包含指定的值
        boolean isEmpty()                  判断集合是否为空
        int size()                         集合的长度，也就是集合中键值对的个数
        */

//        //put
//        //添加元素/覆盖元素
//        //如果键不存在，就添加元素，返回null
//        //如果键存在，就覆盖元素，返回旧的值
//        Map<String,String> map = new HashMap<>();
//        String value = map.put("可乐","可口可乐");
////        System.out.println(value);
//        map.put("雪碧","7喜");
//        map.put("果味汽水","芬达");

//        String value2 = map.put("可乐","百事可乐");
//        System.out.println(value2);


//        //remove
//        //根据键删除键值对元素
//        //如果键存在，就删除成功，返回旧的值
//        //如果键不存在，就删除失败，返回null
//        String value3 = map.remove("可乐");
//        System.out.println(value3);


//        //clear
//        //移除所有的键值对元素，没有返回值，也没有异常抛出
//        map.clear();


//        //containsKey
//        //判断集合是否包含指定的键
//        //如果键存在，就返回true
//        //如果键不存在，就返回false
//        boolean b1 = map.containsKey("可乐");
//        System.out.println(b1);

//        //containsValue
//        //判断集合是否包含指定的值
//        //如果值存在，就返回true
//        //如果值不存在，就返回false
//        boolean b2 = map.containsValue("可口可乐");
//        System.out.println(b2);

//        //isEmpty
//        //判断集合是否为空
//        //如果集合为空，就返回true
//        //如果集合不为空，就返回false
//        boolean b3 = map.isEmpty();
//        System.out.println(b3);

//        //size
//        //集合的长度，也就是集合中键值对的个数
//        int size = map.size();
//        System.out.println(size);
//
//
//        System.out.println(map);




//        //Map 集合的遍历
//
//        //1.通过键去获取值
//        Map<String,String> map2 = new HashMap<>();
//        map2.put("可乐","可口可乐");
//        map2.put("雪碧","7喜");
//        map2.put("果味汽水","芬达");
//
//        //通过keySet方法获取所有的键
//        Set<String> keys = map2.keySet();
//
//        //1.1 通过增强for循环遍历键
//        for (String key : keys) {
//            String value = map2.get(key);
//            System.out.println(key+"="+value);
//        }
//        System.out.println("-----------------");
//
//        //1.2 通过迭代器遍历键
//        Iterator<String> it = keys.iterator();
//        while(it.hasNext()){
//            //获取当前迭代器指向的键值，并将指针指向下一个键
//            //然后通过键去获取值
//            String key = it.next();
//            String value = map2.get(key);
//            System.out.println(key+"="+value);
//        }
//        System.out.println("-----------------");
//
//        //1.3 lambda表达式遍历键
////        keys.forEach(new Consumer<String>() {
////            @Override
////            public void accept(String key) {
//////                System.out.println(key);
////                //通过键去获取值
////                String value = map2.get(key);
////                System.out.println(key+"="+value);
////            }
////        });
//
//        keys.forEach(key-> {
////                System.out.println(key);
//                //通过键去获取值
//                String value = map2.get(key);
//                System.out.println(key+"="+value);
//            }
//        );


//        //2.通过键值对遍历
//        Map<String,String> map3 = new HashMap<>();
//        map3.put("火元素大师","凯·史密斯");
//        map3.put("水系大师","妮娅·史密斯");
//        map3.put("土系大师","寇·巴克特");
//        map3.put("生命大师","劳埃德·蒙哥马利·加满都");
//        map3.put("闪电大师","杰·沃克");
//        map3.put("寒冰大师","赞·朱利安·罗伯特");
//
//        //获取对应的键值对:entrySet
//        //泛型嵌套，Map.Entry<String,String> 表示键值对的类型
//        Set<Map.Entry<String,String>> entries = map3.entrySet();
//
//        //遍历键值对
//        //2.1 通过增强for循环遍历键值对
//        for (Map.Entry<String, String> entry : entries) {//第一个拿到的键值对是：火元素大师=凯·史密斯
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key+":"+value);
//        }
//        System.out.println("-----------------");
//
//        //2.2 通过迭代器遍历键值对
//        Iterator<Map.Entry<String, String>> it = entries.iterator();
//        while (it.hasNext()) {//第一个拿到的键值对是：火元素大师=凯·史密斯
//            Map.Entry<String, String> entry = it.next();
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key+":"+value);
//
//        }
//        System.out.println("-----------------");
//
//        //2.3 lambda表达式遍历键值对
////        entries.forEach(new Consumer<Map.Entry<String, String>>() {
////            @Override
////            public void accept(Map.Entry<String, String> stringStringEntry) {
////                String key = stringStringEntry.getKey();
////                String value = stringStringEntry.getValue();
////                System.out.println(key+":"+value);
////            }
////        });
//
//        entries.forEach(stringStringEntry-> {
//                String key = stringStringEntry.getKey();
//                String value = stringStringEntry.getValue();
//                System.out.println(key+":"+value);
//            }
//        );

        //3.通过lambda表达式遍历键值对
        Map<String,String> map4 = new HashMap<>();
        map4.put("火元素大师","凯·史密斯");
        map4.put("水系大师","妮娅·史密斯");
        map4.put("土系大师","寇·巴克特");
        map4.put("生命大师","劳埃德·蒙哥马利·加满都");
        map4.put("闪电大师","杰·沃克");
        map4.put("寒冰大师","赞·朱利安·罗伯特");

        //遍历键值对

        //forEach方法:底层是通过entrySet方法获取所有的键值对，然后遍历键值对，调用accept方法
        //accept方法的参数是键值对的键和值
        map4.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+":"+value);
            }
        });

        System.out.println("-----------------");

        map4.forEach((String key, String value) -> {
                System.out.println(key+":"+value);
            }
        );

        System.out.println("-----------------");

        map4.forEach((key, value) -> System.out.println(key+":"+value));









    }
}
