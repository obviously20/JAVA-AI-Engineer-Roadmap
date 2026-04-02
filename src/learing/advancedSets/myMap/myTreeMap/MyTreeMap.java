package learing.advancedSets.myMap.myTreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {

        //1.TreeMap集合的特点是怎么样的?
        //不重复、无索引、可排序
        //底层基于红黑树实现排序，增删改查性能较好
        //2.TreeMap集合排序的两种方式
        //实现Comparable接口，指定比较规则
        //创建集合时传递Comparator比较器对象，指定比较规则



        //        //TreeMap基本应用
//        //需求1:
//        //键:整数表示id
//        //值:字符串表示商品名称
//        //要求:按照id的升序排列、按照id的降序排列
//
//
//        Product p1 = new Product(11,"可口可乐");
//        Product p2 = new Product(2,"7喜");
//        Product p3 = new Product(31,"雪碧");
////        TreeMap<Integer,String> tm = new TreeMap<>();
////
////        tm.put(p1.getId(),p1.getName());
////        tm.put(p2.getId(),p2.getName());
////        tm.put(p3.getId(),p3.getName());
////
////
////        System.out.println(tm);
//
//        //按照id的降序排列
//        TreeMap<Integer,String> tm2 = new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                //o1:当前键值对
//                //o2:已经存在在红黑树中的键值对
//                return o2-o1;
//            }
//        });
//
//        tm2.put(p1.getId(),p1.getName());
//        tm2.put(p2.getId(),p2.getName());
//        tm2.put(p3.getId(),p3.getName());
//
//        System.out.println(tm2);
//




        //需求2:
        //键:学生对象
        //值:籍贯
        //要求:按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("lisi",20);
        Student s3 = new Student("wangwu",22);
        Student s4 = new Student("zhangsan",18);
        Student s5 = new Student("zhangsan",25);

//        TreeMap<Student,String> tm = new TreeMap<>();
//        tm.put(s1,"北京");
//        tm.put(s2,"上海");
//        tm.put(s3,"广州");
//        tm.put(s4,"深圳");
//        tm.put(s5,"武汉");
//
//        System.out.println(tm);

        TreeMap<Student,String> tm2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.getAge() - o2.getAge();
                i=i==0?o1.getName().compareTo(o2.getName()):i;
                return i;
            }
        });

        tm2.put(s1,"北京");
        tm2.put(s2,"上海");
        tm2.put(s3,"广州");
        tm2.put(s4,"深圳");
        tm2.put(s5,"武汉");

        System.out.println(tm2);








    }
}
