package learing.advancedSets.Set;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        //todo TreeSet 中插入自定义类型的元素：
        // 第一种：默认排序/自然排序
        // 要在自定义类型的类中实现Comparable<T>接口，其中T是自定义类型的类的类型。
        // 1.实现Comparable<T>接口
        // 2.在实现的compareTo（重写）方法中，根据元素的属性进行比较:this:当前对象,o:在数组中存储对象。--而在这里底层是红黑树，不是哈希表所以不用重写equals和hashCode方法
        // 3.返回比较结果：负数表示this<o：this元素根据红黑树的规则，应该排在o元素的左边，
        // 0表示this=o：this元素和o元素相等，不进行排序，舍去。
        // 正数表示this>o：this元素根据红黑树的规则，应该排在o元素的右边。
        //（去对应的JavaBean类中实现compareTo方法）


        //todo 2.比较器排序：一般情况下默认使用自然排序，但如果自然排序不能满足需求，就可以使用比较器排序。
        // 用new TreeSet<Student>(new Comparator<Student>() {...})
        // 创建一个TreeSet对象，其中Comparator<Student>是一个匿名内部类，重写了compare方法，根据元素的属性进行比较
        // 且重写其中的返回规则和第一种排序的规则相同


//        TreeSet<Student> studentSet1 = new TreeSet<Student>(new Comparator<Student>() {
//            //其中o1:代表当前对象，o2:代表在红黑树中存储对象。
//            //根据o1的年龄和o2的年龄进行比较：
//            //如果一样就比较姓名
//            //如果姓名也一样就返回0，不进行排序，舍去。
//            @Override
//            public int compare(Student o1, Student o2) {
//                int i =o1.getAge()-o2.getAge();
//                i=i==0?o1.getName().compareTo(o2.getName()):i;
//                return i;
//            }
//        });

        //用更加简洁的写法lambda
        TreeSet<Student> studentSet1 = new TreeSet<Student>(
            //其中o1:代表当前对象，o2:代表在红黑树中存储对象。
            //根据o1的年龄和o2的年龄进行比较：
            //如果一样就比较姓名
            //如果姓名也一样就返回0，不进行排序，舍去。
            ( o1, o2) ->{
                int i =o1.getAge()-o2.getAge();
                i=i==0?o1.getName().compareTo(o2.getName()):i;
                return i;
            }
        );
        //todo 方式1和方式2都在，那就用方式2的比较器排序。


        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhaoliu", 26);

        studentSet1.add(s1);
        studentSet1.add(s2);
        studentSet1.add(s3);
        studentSet1.add(s4);


//        TreeSet<Student> studentSet = new TreeSet<Student>();
//        studentSet.add(s1);
//        studentSet.add(s2);
//        studentSet.add(s3);
//        studentSet.add(s4);

        System.out.println(studentSet1);

    }
}
