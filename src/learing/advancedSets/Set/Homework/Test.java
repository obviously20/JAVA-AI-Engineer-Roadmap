package learing.advancedSets.Set.Homework;

import learing.advancedSets.Set.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        /*需求:创建5个学生对象按照总分从高到低输出到控制台如果总分一样，
        按照语文成绩排如果语文一样，按照数学成绩排如果数学成绩一样，
        按照英语成绩排如果英文成绩一样，按照年龄排如果年龄一样，按照姓名的字母顺序排如果都一样，
        认为是同一个学生，不存。
        属性:(姓名，年龄，语文成绩，数学成绩，英语成绩),*/

        Student1 s1 = new Student1("zhangsan", 23, 90, 80, 70);
        Student1 s2 = new Student1("lisi", 24, 65, 70, 70);
        Student1 s3 = new Student1("wangwu", 23, 90, 80, 70);
        Student1 s4 = new Student1("zhaoliu", 26, 80, 80, 70);
        Student1 s5 = new Student1("wangwu", 24, 70, 99, 100);

        //方法1：自然排序
        TreeSet<Student1> treeSet = new TreeSet<>();
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);

        for (Student1 student1 : treeSet) {
            System.out.println(student1);
        }
        System.out.println("-----------------");

        //方法2：自定义排序:根据总成绩从高到低排序
        TreeSet<Student1> treeSet2 = new TreeSet<>(new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                int sum1 = o1.getChineseScore() + o1.getMathScore() + o1.getEnglishScore();
                int sum2 = o2.getChineseScore() + o2.getMathScore() + o2.getEnglishScore();
                // 先按总成绩排序
                int i = sum2 - sum1;
                // 如果总成绩相同，按语文成绩排序
                i = i == 0 ? o1.getChineseScore() - o2.getChineseScore() : i;
                // 如果语文成绩相同，按数学成绩排序
                i = i == 0 ? o1.getMathScore() - o2.getMathScore() : i;
                // 如果数学成绩相同，按年龄排序
                i = i == 0 ? o1.getAge() - o2.getAge() : i;
                // 如果年龄相同，按姓名排序
                i = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
                // 如果姓名相同，按默认排序
                return i;
            }
        });

        treeSet2.add(s1);
        treeSet2.add(s2);
        treeSet2.add(s3);
        treeSet2.add(s4);
        treeSet2.add(s5);

        for (Student1 student1 : treeSet2) {
            System.out.println(student1);
            System.out.printf("总成绩:%d\n",student1.getChineseScore()+student1.getMathScore()+student1.getEnglishScore());
        }
    }
}


