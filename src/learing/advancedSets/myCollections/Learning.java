package learing.advancedSets.myCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Learning {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        //原来的方式
//        list.add("a");
//        list.add("b");
//        list.add("c");
        //新的方式:使用Collections类的addAll方法:
        //addAll方法:可以将多个元素添加到集合中
        Collections.addAll(list,"a","b","c");
        System.out.println(list);

        System.out.println("-----------------");

        //打乱集合中的元素
        //shuffle方法:可以打乱集合中的元素,将元素随机打乱
        Collections.shuffle(list);
        System.out.println(list);


        /*
public static <T> void sort(List<T> list)                            排序
public static <T> void sort(List<T> list, Comparator<T> c)          根据指定的规则进行排序
public static <T> int binarySearch(List<T> list, T key)             以二分查找法查找元素
public static <T> void copy(List<T> dest, List<T> src)              拷贝集合中的元素
public static <T> int fill(List<T> list, T obj)                     使用指定的元素填充集合
public static <T> void max/min(Collection<T> coll)                   根据默认的自然排序获取最大/小值
public static <T> void swap(List<?> list, int i, int j)              交换集合中指定位置的元素
*/

// ========== sort默认规则演示 ==========
        System.out.println("----------------sort默认规则---------------------");
// 默认规则，需要重写Comparable接口compareTo方法。Integer已经实现，按照从小打大的顺序排列
// 如果是自定义对象，需要自己指定规则
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 10, 1, 2, 4, 8, 5, 9, 6, 7, 3);
        Collections.sort(list1);
        System.out.println(list1);

// ========== sort指定规则演示 ==========
        System.out.println("----------------sort自己指定规则规则---------------------");
        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list1);

// Lambda表达式简化Comparator写法
        Collections.sort(list1, (o1, o2) -> o2 - o1);
        System.out.println(list1);

// ========== binarySearch二分查找演示 ==========
        System.out.println("----------------binarySearch---------------------");
// 需要元素有序
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(Collections.binarySearch(list2, 9));   // 查找存在的元素
        System.out.println(Collections.binarySearch(list2, 20));// 查找不存在的元素
        System.out.println(Collections.binarySearch(list2, 1)); // 查找第一个元素

// ========== copy拷贝集合演示 ==========
        System.out.println("----------------copy---------------------");
// 把list3中的元素拷贝到list4中
// 注意点：如果list3的长度 > list4的长度，方法会报错
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        Collections.addAll(list3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.addAll(list4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        System.out.println(list3);
        Collections.copy(list4, list3);
        System.out.println(list4);

// ========== fill填充集合演示 ==========
        System.out.println("----------------fill---------------------");
// 把集合中现有的所有数据，都修改为指定数据
        ArrayList<Integer> list5 = new ArrayList<>();
        Collections.addAll(list5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.fill(list5, 100);
        System.out.println(list5);

// ========== max/min获取最大/最小值演示 ==========
        System.out.println("----------------max/min---------------------");
// 求最大值或者最小值
        ArrayList<Integer> list6 = new ArrayList<>();
        Collections.addAll(list6, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(Collections.max(list6));
        System.out.println(Collections.min(list6));

// String类型的max/min（自定义规则：按字符串长度取最大值）
        System.out.println("----------------max/min指定规则---------------------");
// String中默认是按照字母的abcdefg顺序进行排列的
// 现在我要求最长的字符串
// 默认的规则无法满足，可以自己指定规则
// 求指定规则的最大值或者最小值
        ArrayList<String> list7 = new ArrayList<>();
        Collections.addAll(list7, "a", "aa", "aaa", "aaaa");
        System.out.println(Collections.max(list7, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }));

// ========== swap交换集合元素演示 ==========
        System.out.println("----------------swap---------------------");
        ArrayList<Integer> list8 = new ArrayList<>();
        Collections.addAll(list8, 1, 2, 3);
        Collections.swap(list8, 0, 2);
        System.out.println(list8);

    }
}
