package learing.advancedSets.myStream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Learning {
    public static void main(String[] args) {

//        //Collection体系的集合可以使用默认方法stream()生成流
//        List<String> list = new ArrayList<String>();
//        Stream<String> listStream = list.stream();
//
//        Set<String> set = new HashSet<String>();
//        Stream<String> setStream = set.stream();
//
//        //----------------------------------------------
//
//        //Map体系的集合间接的生成流:需要中转
//        //1.通过keySet()方法获取键的流
//        //2.通过entrySet()方法获取值的流
//        Map<String, Integer> map = new HashMap<String, Integer>();
//        Stream<String> keyStream = map.keySet().stream();
//        Stream<Integer> valueStream = map.values().stream();
//        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();
//
//        //----------------------------------------------
//
//        //数组可以通过Arrays中的静态方法stream生成流
//        String[] strArray = {"hello", "world", "java"};
//        Stream<String> strArrayStream = Arrays.stream(strArray);
//
//        //同种数据类型的多个数据可以通过Stream接口的静态方法of(T... values)生成流
//        Stream<String> strArrayStream2 = Stream.of("hello", "world", "java");
//        Stream<Integer> intStream = Stream.of(10, 20, 30);
//        //todo 细节:如果用Stream.of()方法来为引用数据类型数组生成流，那么一个元素就会被包装成一个对象
//        Integer[] intArray1 = {1, 2, 3, 4, 5};
//        Stream.of(intArray1).forEach(s->System.out.println(s));//1 2 3 4 5
//        //todo 细节:如果用Stream.of()方法来为基本数据类型数组生成流，那么所有元素就会被包装成一个对象
//        int[] intArray2 = {10, 20, 30};
//        Stream.of(intArray2).forEach(s->System.out.println(s));//[I@2d98a335
//
//        //----------------------------------------------

        //### Stream流中间操作方法【应用】
        //
        //- 概念
        //
        //  中间操作的意思是,执行完此方法之后,Stream流依然可以继续执行其他操作
        //
        //- 常见方法
        //
        //  | 方法名                                          | 说明                                                       |
        //  | ----------------------------------------------- | ---------------------------------------------------------- |
        //  | Stream<T> filter(Predicate predicate)           | 用于对流中的数据进行过滤                                   |
        //  | Stream<T> limit(long maxSize)                   | 返回此流中的元素组成的流，截取前指定参数个数的数据         |
        //  | Stream<T> skip(long n)                          | 跳过指定参数个数的数据，返回由该流的剩余元素组成的流       |
        //  | static <T> Stream<T> concat(Stream a, Stream b) | 合并a和b两个流为一个流                                     |
        //  | Stream<T> distinct()                            | 返回由该流的不同元素（根据Object.equals(Object) ）组成的流 |

//        //        Stream<T> filter(Predicate predicate)：过滤
////        Predicate接口中的方法	boolean test(T t)：对给定的参数进行判断，返回一个布尔值
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("张三丰");
//        list.add("张无忌");
//        list.add("张翠山");
//        list.add("王二麻子");
//        list.add("张良");
//        list.add("谢广坤");
//
////        list.stream().filter(new Predicate<String>() {
////            @Override
////            public boolean test(String name) {
////                //返回true表示保留
////                //返回false表示过滤
////                return name.startsWith("张");
////            }
////        }).forEach(s->System.out.println(s));
//
//        //简化为：
//        list.stream().filter(name->name.startsWith("张")).forEach(s->System.out.println(s));
//
//        System.out.println("-----------------");
//
//        //limit&skip代码演示
//        //创建一个集合，存储多个字符串元素
//        ArrayList<String> list = new ArrayList<String>();
//
//        list.add("林青霞");
//        list.add("张曼玉");
//        list.add("王祖贤");
//        list.add("柳岩");
//        list.add("张敏");
//        list.add("张无忌");
//
//        //limit方法：截取前指定参数个数的数据
//        list.stream().limit(3).forEach(s->System.out.println(s));//林青霞 张曼玉 王祖贤
//        System.out.println("-----------------");
//        //skip方法：跳过指定参数个数的数据
//        //跳过前3个数据，返回由该流的剩余元素组成的流
//        list.stream().skip(3).forEach(s->System.out.println(s));//柳岩 张敏 张无忌
//        System.out.println("-----------------");
//        //要取王祖贤~张敏
//        list.stream().skip(2).limit(3).forEach(s -> System.out.println(s));//王祖贤 柳岩 张敏
//        System.out.println("-----------------");


//        //concat&distinct代码演示
//        //创建一个集合，存储多个字符串元素
//        ArrayList<String> list1 = new ArrayList<String>();
//        list1.add("林青霞");
//        list1.add("张曼玉");
//        list1.add("林青霞");
//        list1.add("张曼玉");
//        list1.add("王祖贤");
//        list1.add("柳岩");
//        list1.add("张敏");
//
//        ArrayList<String> list2 = new ArrayList<String>();
//        list2.add("王二麻子");
//        list2.add("张良");
//        list2.add("谢广坤");
//        list2.add("王二麻子");
//        list2.add("张良");
//        list2.add("谢广坤");
//
//        //concat方法：合并a和b两个流为一个流,如果a和b两个流的元素类型不同,则会返回它们的父类类型
//        Stream.concat(list1.stream(), list2.stream()).forEach(s->System.out.println(s));
//        System.out.println("-----------------");
//        //distinct方法：去重
//        ArrayList<String> list3 = new ArrayList<>();
//        list3.addAll(list1);
//        list3.add("林青霞");
//        list3.add("张曼玉");
//        System.out.println(list3);
//        System.out.println("-----------------");
//        list3.stream().distinct().forEach(s->System.out.println(s));

//        //map方法：将流中的数据转换为其他类型
//        //map方法的参数是一个Function接口的实现类
//        //Function<T, R>接口中的方法R apply(T t)：对给定的参数执行此操作
//        //在map方法的底层,会循环获取到流中的每一个数据.
//        //并循环调用apply方法,并把每一个数据传递给apply方法
//        //s就依次表示了流中的每一个数据.
//        //所以,我们只要在apply方法中,写上处理的业务逻辑就可以了.
//        ArrayList<String> list = new ArrayList<>();
//        list.add("张三丰-15");
//        list.add("张无忌-18");
//        list.add("张翠山-20");
//        list.add("王二麻子-22");
//        list.add("张良-23");
//        list.add("谢广坤-24");
//        //String:表示流中的每一个数据
//        //Integer:表示转换后的数据，返回值类型为Integer类型
//        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s.split("-")[1]);
//            }
//        }).forEach(s-> System.out.println(s));
//        System.out.println("-----------------");
//        list.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s->System.out.println(s));

        //### Stream流终结操作方法【应用】
        //
        //- 概念
        //
        //  终结操作的意思是,执行完此方法之后,Stream流将不能再执行其他操作
        //
        //- 常见方法
        //
        //  | 方法名                        | 说明                     |
        //  | ----------------------------- | ------------------------ |
        //  | void forEach(Consumer action) | 对此流的每个元素执行操作 |
        //  | long count()                  | 返回此流中的元素数       |
//        ArrayList<String> list = new ArrayList<>();
//        list.add("张三丰");
//        list.add("张无忌");
//        list.add("张翠山");
//        list.add("王二麻子");
//        list.add("张良");
//        list.add("谢广坤");
//
//        //method1(list);
//
////        long count()：返回此流中的元素数
//        long count = list.stream().count();
//        System.out.println(count);
//
//
//        //  void forEach(Consumer action)：对此流的每个元素执行操作
//        //  Consumer接口中的方法void accept(T t)：对给定的参数执行此操作
//        //在forEach方法的底层,会循环获取到流中的每一个数据.
//        //并循环调用accept方法,并把每一个数据传递给accept方法
//        //s就依次表示了流中的每一个数据.
//        //所以,我们只要在accept方法中,写上处理的业务逻辑就可以了.
//        list.stream().forEach(
//                new Consumer<String>() {
//                    @Override
//                    public void accept(String s) {
//                        System.out.println(s);
//                    }
//                }
//        );
//
//        System.out.println("====================");
//        //lambda表达式的简化格式
//        //是因为Consumer接口中,只有一个accept方法
//        list.stream().forEach(
//                (String s)->{
//                    System.out.println(s);
//                }
//        );
//        System.out.println("====================");
//        //lambda表达式还是可以进一步简化的.
//        list.stream().forEach(s->System.out.println(s));




//        ArrayList<String> list = new ArrayList<>();
//        list.add("张三丰");
//        list.add("张无忌");
//        list.add("张翠山");
//        list.add("王二麻子");
//        list.add("张良");
//        list.add("谢广坤");
//
//        //toArray方法：将流中的数据转换为数组
//        //toArray方法的参数是一个IntFunction接口的实现类
//        //IntFunction<String[]>:将int类型的数据转换为String[]类型的数据
//        //public String[] apply(int value);
//        //apply方法的参数是一个int类型的数据,返回值是一个String[]类型的数据,其中value表示流中的元素数
//        //所以,我们可以在apply方法中,返回一个长度为value的数组
//        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });
//        System.out.println(Arrays.toString(arr));
//        System.out.println("-----------------");
//        String[] arr2 = list.stream().toArray(value -> new String[value]);
//        System.out.println(Arrays.toString(arr2));


        //工具类Collectors提供了具体的收集方式
        //
        //| 方法名                                                       | 说明                   |
        //| ------------------------------------------------------------ | ---------------------- |
        //| public static <T> Collector toList()                         | 把元素收集到List集合中 |
        //| public static <T> Collector toSet()                          | 把元素收集到Set集合中  |
        //| public static  Collector toMap(Function keyMapper,Function valueMapper) | 把元素收集到Map集合中  |

       ArrayList<String> list = new ArrayList<>();
       list.add("lisi-男-24");
       list.add("wangwu-男-25");
       list.add("zhangsan-男-23");
//       list.add("lisi-男-24");
       list.add("zmh-女-25");

       //重复收集:list
        List<String> tolist = list.stream().filter(s->"男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(tolist);

        //不重复收集:set
        Set<String> set = list.stream().filter(s->"男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(set);

        //收集到map集合中
        //todo key不能重复，否则会报错
        //搞清楚那个是key,那个是value（规则）
        //key:name
        //value:age
        Map<String, Integer> toMap = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                //.collect(Collectors.toMap(new Function<流中的数据类型, key的类型>() {
                //    @Override
                //    public key（key的类型） apply(流中的数据类型 s（流中的数据）) {
                //        return s.split("-")[0];
                //    }//key的规则
                //}, new Function<流中的数据类型, value的类型>() {
                //    @Override
                //    public String（value的类型） apply(String s（流中的数据）) {
                //        return s.split("-")[2];
                //    }//value的规则
                //}));

                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));
        System.out.println(toMap);
        System.out.println("-----------------");
        Map<String, Integer> toMap2 = list.stream().filter(s->"男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s->s.split("-")[0],s->Integer.parseInt(s.split("-")[2])));
        System.out.println(toMap2);


    }
}

