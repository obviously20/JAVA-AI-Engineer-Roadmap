package learing;

import learing.faceObject.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Set {
    public static void main(String[] args) {
//        //TODO: 集合--ArrayList类
//        //JDK7以前的定义格式
////        ArrayList<String> list = new ArrayList<String>();
//        //JDK7以后的定义格式
//        ArrayList<String> list = new ArrayList<>();
//        //集合返回的结果是用[] 包起来的
//        System.out.println(list);
//
//        //方法-->增删改查
//        //TODO：添加元素 list.add(E element);
//        list.add("aA");
//        list.add("aA");
//        list.add("aA");
//        list.add("bB");
//        list.add("cC");
//        list.add("Dd");
//        list.add("eE");
//        list.add("Ff");
//        System.out.println(list);
//
//        //TODO：删除元素 list.remove(int index);-删除指定索引位置的元素，返回被删除的元素
//        String str=list.remove(0);
//        System.out.println(str);
//        System.out.println(list);
//        //TODO：删除元素 list.remove(E element);-删除指定元素，返回是否删除成功
//        boolean bool=list.remove("aA");
//        System.out.println(bool);
//        System.out.println(list);
//
//
//        //TODO:修改元素 list.set(int index,E element);-将指定索引位置的元素修改为新的元素
//        list.set(5,"Gg");
//        System.out.println(list);
//
//        //TODO：查询元素 list.get(int index);-返回指定索引位置的元素
//        String str2=list.get(5);
//        System.out.println(str2);
//
//        //TODO：查询元素 list.size();-返回集合的大小（元素的个数）
//        //遍历集合
//        System.out.println(list.size());
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        /*需求:定义一个集合，添加字符串，并进行遍历遍历格式参照:[元素1，元素2，元素3]。*/
//        ArrayList<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        System.out.printf("[");
//        for (int i = 0; i < list.size(); i++) {
//            if(i==list.size()-1){
//                System.out.print(list.get(i));
//            }else{
//                System.out.print(list.get(i)+",");
//            }
//        }
//        System.out.printf("]");

//        //TODO: 集合--不能存储基本数据类型，只能存储引用数据类型，故要把基本数据类型转换为对应的包装类
//        //包装类：int-->Integer
//        //char-->Character
//        //boolean-->Boolean
//        //long-->Long
//        //float-->Float
//        //double-->Double
//        //byte-->Byte
//        ArrayList<Integer> list = new ArrayList<>();
//        //JDK5后int 和 Integer可以自动装箱和拆箱
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.printf("[");
//        for (int i = 0; i < list.size(); i++) {
//            if(i==list.size()-1){
//                System.out.print(list.get(i));
//            }else{
//                System.out.print(list.get(i)+",");
//            }
//        }
//        System.out.println("]");


//        ArrayList<Character> list = new ArrayList<>();
//        list.add('a');
//        list.add('b');
//        list.add('c');
//        System.out.printf("[");
//        for (int i = 0; i < list.size(); i++) {
//            if(i==list.size()-1){
//                System.out.print(list.get(i));
//            }else{
//                System.out.print(list.get(i)+",");
//            }
//        }
//        System.out.println("]");

//        //添加自定义类型的元素
//        ArrayList<Student> list = new ArrayList<>();
//        list.add(new Student("1001","张三",18));
//        list.add(new Student("1002","李四",19));
//        list.add(new Student("1003","王五",20));
//        for (int i = 0; i < list.size(); i++) {
//             Student stu = list.get(i);//拿到的是对应索引的地址值
//             System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getAge());
//        }

//        //键盘录入学生信息
//        ArrayList<Student> list = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of students: ");
//        int num = sc.nextInt();
//        for (int i = 0; i < num; i++) {
//            System.out.println("Enter the information of student "+(i+1)+":");
//            System.out.println("Enter the id:");
//            String id = sc.next();
//            System.out.println("Enter the name:");
//            String name = sc.next();
//            System.out.println("Enter the age:");
//            int age = sc.nextInt();
//            //有参构造方法，一步完成对象的创建和初始化
//            list.add(new Student(id,name,age));
//        }
//        for (int i = 0; i < list.size(); i++) {
//             Student stu = list.get(i);//拿到的是对应索引的地址值
//             System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getAge());
//        }


//        /*添加用户对象并判断是否存在
//        需求:
//        1，main方法中定义一个集合，存入三个用户对象。用户属性为:id，username,password2要求:定义一个方法，根据id查找对应的用户信息。
//        如果存在，返回true
//        如果不存在，返回false*/
//        Scanner sc = new Scanner(System.in);
//        ArrayList<TestUser> list = new ArrayList<>();
//        list.add(new TestUser("1001","zhangsan","123456"));
//        list.add(new TestUser("1002","lisi","123456"));
//        list.add(new TestUser("1003","wangwu","123456"));
//        System.out.println("请输入要查找的用户id:");
//        String id = sc.next();
//        boolean flag = findUserById(list,id);
//        if(flag){
//            System.out.println("用户存在");
//        }else{
//            System.out.println("用户不存在");
//        }

//        /*需求:
//        1，main方法中定义一个集合，存入三个用户对象。用户属性为:id，username，password2，要求:定义一个方法，根据id查找对应的用户信息。
//        如果存在，返回索引
//        如果不存在，返回-1*/
//        Scanner sc = new Scanner(System.in);
//        ArrayList<TestUser> list = new ArrayList<>();
//        list.add(new TestUser("1001","zhangsan","123456"));
//        list.add(new TestUser("1002","lisi","123456"));
//        list.add(new TestUser("1003","wangwu","123456"));
//        System.out.println("请输入要查找的用户id:");
//        String id = sc.nextLine();
//        int index = findIndexById(list,id);
//        if(index==-1){
//            System.out.println("用户不存在");
//        }else{
//            System.out.println("用户存在，索引为:"+index);
//            System.out.println(list.get(index).toString());
//        }


//        /*添加手机对象并返回要求的数据
//        需求:
//        定义Javabean类:PhonePhone属性:品牌，价格。main方法中定义一个集合，存入三个手机对象。
//        分别为:小米，1000。苹果，8000。锤子2999。定义一个方法，将价格低于3000的手机信息返回。*/
//        ArrayList<TestPhone> list = new ArrayList<>();
//        list.add(new TestPhone("小米",1000));
//        list.add(new TestPhone("苹果",8000));
//        list.add(new TestPhone("锤子",2999));
//        System.out.println("价格低于3000的手机信息为:");
//        ArrayList<TestPhone> list1 = findPriceLowerThan3000(list);
//        for (int i = 0; i < list1.size(); i++) {
//            System.out.println(list1.get(i).toString());
//        }


//        /*现有如下字符串元素：["aaa", "bbb", "aaa", "aaa", "ccc", "bbb"]，请将所有的元素按顺序存入ArrayList集合中，并遍历集合查看存储结果。*/
//        Scanner sc = new Scanner(System.in);
//        String[] strs = {"aaa", "bbb", "aaa", "aaa", "ccc", "bbb"};
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = 0; i < strs.length; i++) {
//            list.add(strs[i]);
//        }
//        System.out.print("[");
//        for (int i = 0; i < list.size(); i++) {
//            if (i == list.size() - 1) {
//                System.out.print(list.get(i));
//            }else {
//                System.out.printf(list.get(i) + ",");
//            }
//        }
//        System.out.print("]");

//        /*请定义教师（Teacher）类，属性包含姓名和专业名称。将若干教师对象存入ArrayList集合中，并遍历集合打印教师信息，格式如下：
//        ~~~java
//        姓名：赵老师, 专业：javase
//        姓名：钱老师, 专业：javaee
//        姓名：孙老师, 专业：php
//        姓名：李老师, 专业：python*/
//        ArrayList<TestTeacher> list = new ArrayList<>();
//        TestTeacher tc1 = new TestTeacher("赵老师","javase");
//        TestTeacher tc2 = new TestTeacher("钱老师","javaee");
//        TestTeacher tc3 = new TestTeacher("孙老师","php");
//        TestTeacher tc4 = new TestTeacher("李老师","python");
//        list.add(tc1);
//        list.add(tc2);
//        list.add(tc3);
//        list.add(tc4);
//        for (int i = 0; i < list.size(); i++) {
//            TestTeacher tc = list.get(i);
//            System.out.println(tc.toString());
//        }

        /*有如下员工信息：

~~~java
姓名：张三，工资：3000
姓名：李四，工资：3500
姓名：王五，工资：4000
姓名：赵六，工资：4500
姓名：田七，工资：5000
~~~

先需要将所有的员工信息都存入ArrayList集合中，并完成如下操作：

1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五”

2、判断是否有姓名为“赵六”的员工，如果有，将其删除

3、给姓名为“田七”的员工，涨500工资*/

        Scanner sc = new Scanner(System.in);
        ArrayList<TestEmployee> list = new ArrayList<>();
        list.add(new TestEmployee("张三", 3000));
        list.add(new TestEmployee("李四", 3500));
        list.add(new TestEmployee("王五", 4000));
        list.add(new TestEmployee("赵六", 4500));
        list.add(new TestEmployee("田七", 5000));
        System.out.println("请输入你要进行的操作：1改名、2删除、3涨工资");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("请输入要改名的员工姓名:");
                String name = sc.next();
                System.out.println("请输入新的姓名:");
                String newName = sc.next();
                int index = findIndexByName(list, name);
                if (index == -1) {
                    System.out.println("该员工不存在");
                } else {
                    TestEmployee employee = list.get(index);
                    employee.setName(newName);
                    list.set(index, employee);
                    System.out.println("改名成功");
                }
                break;
            case 2:
                System.out.println("请输入要删除的员工姓名:");
                String delName = sc.next();
                index = findIndexByName(list, delName);
                if (index == -1) {
                    System.out.println("该员工不存在");
                } else {
                    list.remove(index);
                    System.out.println("删除成功");
                }
                break;
            case 3:
                System.out.println("请输入要涨工资的员工姓名:");
                String raiseName = sc.next();
                index = findIndexByName(list, raiseName);
                if (index == -1) {
                    System.out.println("该员工不存在");
                } else {
                    TestEmployee employee = list.get(index);
                    System.out.println("请输入涨工资的金额:");
                    double raiseSalary = sc.nextDouble();
                    employee.setSalary(employee.getSalary() + raiseSalary);
                    list.set(index, employee);
                    System.out.println("涨工资成功");
                }
                break;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }


    }

    //根据id查找用户对象
    public static boolean findUserById(ArrayList<TestUser> list, String id) {
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            TestUser user = list.get(i);
            if (user.getId().equals(id)) {
                flag = true;
                System.out.println(user.toString());
                break;
            }
        }
        return flag;
        /*既要判断用户是否存在（true/false），又要返回用户的索引*/
        //上面的都去掉，这样就可以直接返回是否存在了，不用再写一遍逻辑
//        return findIndexById(list,id)>=0;

    }

    //根据id查找用户对象的索引
    public static int findIndexById(ArrayList<TestUser> list, String id) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            TestUser user = list.get(i);
            if (user.getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    //根据价格判断是否低于3000
    public static ArrayList<TestPhone> findPriceLowerThan3000(ArrayList<TestPhone> list) {
        //TODO：如果要返回多个对象，那就定义一个集合或数组来存储，最后返回该集合或数组
        ArrayList<TestPhone> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            TestPhone phone = list.get(i);
            if (phone.getPrice() < 3000) {
                list1.add(phone);
            }

        }
        return list1;
    }

    //根据姓名查找用户对象的索引
    public static int findIndexByName(ArrayList<TestEmployee> list, String name) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            TestEmployee employee = list.get(i);
            if (employee.getName().equals(name)) {
                index = i;
                break;
            }
        }
        return index;
    }


}
