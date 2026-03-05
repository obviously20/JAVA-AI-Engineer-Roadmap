package learing.faceObject;

import java.sql.Struct;
import java.util.Scanner;

public class Homework01 {
    public static void main(String args[]) {
//        /*## 题目1（完成）
//        定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。
//        请定义出手机类，类中要有空参、有参构造方法，set/get方法。
//        定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。
//        调用对象的两个功能，打印效果如下：
//        正在使用价格为3998元黑色的小米手机打电话....
//        正在使用价格为3998元黑色的小米手机发短信....*/
//        MyPhone p=new MyPhone();
//        p.setBrand("小米");
//        p.setPrice(3998);
//        p.setColor("黑色");
//        p.call();
//        p.sendMessage();

//        /*## 题目2（完成）
//        定义一个女朋友类。女朋友的属性包含：姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。另外定义一个用于展示三个属性值的show()方法。
//        请在测试类中通过有参构造方法创建对象并赋值，然后分别调用展示方法、洗衣服方法和做饭方法。打印效果如下：
//        我女朋友叫凤姐,身高155.0厘米,体重130.0斤
//        女朋友帮我洗衣服
//        女朋友给我做饭*/
//        YourGirlFriend gf=new YourGirlFriend("凤姐",155.0,130.0);
//        gf.show();
//        gf.wash();
//        gf.cook();

//        /*## 题目3（完成）
//        定义项目经理类Manager。属性：姓名name，工号id，工资salary，奖金bonus。行为：工作work()
//        定义程序员类Coder。属性：姓名name，工号id，工资salary。行为：工作work()
//        要求：
//        1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，set和get方法
//        2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
//        3.调用成员方法,打印格式如下:
//        工号为123基本工资为15000奖金为6000的项目经理张三正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
//        工号为135基本工资为10000的程序员李四正在努力的写着代码......*/
//        Manager m=new Manager("张三",123,15000,6000);
//        m.work();
//        Coder c=new Coder("李四",135,10000);
//        c.work();

//        /*## 题目4（完成）
//        定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
//        定义狗类Dog。属性:毛的颜色color，品种breed。行为:吃饭()，看家lookHome()
//        要求:
//        1.按照以上要求定义Cat类和Dog类,属性要私有,生成空参、有参构造，set和get方法
//        2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
//        3.调用成员方法,打印格式如下:
//        花色的波斯猫正在吃鱼.....
//        花色的波斯猫正在逮老鼠....
//        黑色的藏獒正在啃骨头.....
//        黑色的藏獒正在看家.....
//*/
//        Cat c=new Cat("花色","波斯猫");
//        c.eat();
//        c.catchMouse();
//        Dog d=new Dog("黑色","藏獒");
//        d.eat();
//        d.lookHome();

//        //文字版格斗游戏：
//        //格斗游戏，每个游戏角色的姓名、血量，都不同，在选定人物的时候（new对象的时候），这些信息就应该被定下来
//
//        Hero h1=new Hero("法海",100,"男");
//        h1.showData();
//        Hero h2=new Hero("聂小倩",100,"女");
//        h2.showData();
//        while(true){
//            h1.attack(h2);
//            if(h2.getBlood()==0){
//                System.out.println(h1.getName()+"K.O了"+h2.getName());
//                break;
//            }
//            h2.attack(h1);
//            if(h1.getBlood()==0){
//                System.out.println(h2.getName()+"K.O了"+h1.getName());
//                break;
//            }
//        }

//        /*对象数组1
//        定义数组存储3个商品对象。
//        商品的属性:商品的id，名字，价格，库存。
//        创建三个商品对象，并把商品对象存入到数组当中。*/
//        //创建商品数组
//        Product[] products=new Product[3];
//        //创建商品对象
//        //ctrl+p 查看Product类的构造方法里面的参数
//        Product p1=new Product("001","辣椒",100,10);
//        Product p2=new Product("002","西兰花",200,20);
//        Product p3=new Product("003","南瓜",300,30);
//        //把商品对象存入到数组当中
//        products[0]=p1;
//        products[1]=p2;
//        products[2]=p3;
//        //遍历商品数组
//        for(int i=0;i<products.length;i++) {
//            System.out.printf("商品id为%s\t商品名%s\t商品价格%.2f\t商品库存%d%n",products[i].getId(),products[i].getName(),products[i].getPrice(),products[i].getStock());
//        }


        /*TODO:键盘录入有2套体系
         *  第一套：nextInt();接收整数、nextDouble();接收双精度浮点数、next();接收字符串（空格不能用）
         *  （以上遇到空格、制表符、回车就会停止接受，这些符号后面的数据就不会接收了）
         *  第二套：nextLine();接收字符串
         *  (可以接收空格、制表符，遇到回车才就停止接收)
         * */
        /*TODO:以上两套体系不能混用，否则会导致数据接收错误！！！
         *  如果要混用，必须在（第二套）nextLine()之前，先消耗掉（第一套）nextInt()后面的换行符*/
//        /*对象数组2
//        定义数组存储3部汽车对象。
//        汽车的属性:品牌，价格，颜色。
//        创建三个汽车对象，数据通过键盘录入而来，并把数据存入到数组当中。*/
//        //定义汽车数组
//        Car[] cars=new Car[3];
//        Scanner sc=new Scanner(System.in);
////        //创建汽车对象
////        Car car1=new Car();//创建汽车对象1
////        System.out.println("请输入汽车1的品牌：");
////        car1.setBrand(sc.nextLine());
////        System.out.println("请输入汽车1的价格：");
////        car1.setPrice(sc.nextDouble());
////        //TODO:消耗掉换行符----------------------!!!!!!
////        sc.nextLine();
////        System.out.println("请输入汽车1的颜色：");
////        car1.setColor(sc.nextLine());
////
////
////        Car car2=new Car();//创建汽车对象2
////        System.out.println("请输入汽车2的品牌：");
////        car2.setBrand(sc.nextLine());
////        System.out.println("请输入汽车2的价格：");
////        car2.setPrice(sc.nextDouble());
////        sc.nextLine();//消耗掉换行符
////        System.out.println("请输入汽车2的颜色：");
////        car2.setColor(sc.nextLine());
////
////
////        Car car3=new Car();//创建汽车对象3
////        System.out.println("请输入汽车3的品牌：");
////        car3.setBrand(sc.nextLine());
////        System.out.println("请输入汽车3的价格：");
////        car3.setPrice(sc.nextDouble());
////        sc.nextLine();//消耗掉换行符
////        System.out.println("请输入汽车3的颜色：");
////        car3.setColor(sc.nextLine());
////
////        cars[0]=car1;//把汽车对象1存入到数组当中
////        cars[1]=car2;//把汽车对象2存入到数组当中
////        cars[2]=car3;//把汽车对象3存入到数组当中
//
//        for (int i = 0; i < cars.length; i++) {
//            //创建汽车对象，要写在for循环里面，否则会导致数据接收错误！！！--具体原因：B站视频中讲解P92
//            Car car=new Car();
//            System.out.println("请输入第"+(i+1)+"辆汽车的品牌：");
//            car.setBrand(sc.nextLine());
//            System.out.println("请输入第"+(i+1)+"辆汽车的价格：");
//            car.setPrice(sc.nextDouble());
//            sc.nextLine();//消耗掉换行符
//            System.out.println("请输入第"+(i+1)+"辆汽车的颜色：");
//            car.setColor(sc.nextLine());
//            cars[i]=car;//把汽车对象存入到数组当中
//        }
//
//        //遍历汽车数组
//        for (int i = 0; i < cars.length; i++) {
//            System.out.printf("汽车品牌为%s\t汽车价格为%.2f\t汽车颜色为%s%n",cars[i].getBrand(),cars[i].getPrice(),cars[i].getColor());
//        }
//
//
//
//
//        /*对象数组3
//        定义数组存储3部手机对象。
//        手机的属性:品牌，价格，颜色。
//        要求，计算出三部手机的平均价格*/
//        Phone[] phones = new Phone[3];
//        Phone p1=new Phone("小米",1000,"白色");
//        phones[0]=p1;
//        Phone p2=new Phone("苹果",2000,"黑色");
//        phones[1]=p2;
//        Phone p3=new Phone("oppo",3000,"红色");
//        phones[2]=p3;
//
//        //计算三部手机的平均价格
//        double sum=0;
//        for (int i = 0; i <phones.length ; i++) {
//            sum+=phones[i].getPrice();
//        }
//        System.out.println("三部手机的平均价格为："+sum/phones.length);

//        /*对象数组4
//        定义数组存储4个女朋友的对象
//        女朋友的属性:姓名、年龄、性别、爱好a
//        要求1:计算出四女朋友的平均年龄要求
//        2:统计年龄比平均值低的女朋友有几个?并把她们的所有信息打印出来。*/
//        GirlFriend2[] friends = new GirlFriend2[4];
//        GirlFriend2 girl1 = new GirlFriend2("小绿",18,"女","旅游");
//        friends[0] = girl1;
//        GirlFriend2 girl2 = new GirlFriend2("小蓝",19,"女","购物");
//        friends[1] = girl2;
//        GirlFriend2 girl3 = new GirlFriend2("小紫",20,"女","运动");
//        friends[2] = girl3;
//        GirlFriend2 girl4 = new GirlFriend2("小粉",21,"女","学习");
//        friends[3] = girl4;
//        //计算四女朋友的平均年龄
//        int sumAge=0;
//        for (int i = 0; i < friends.length; i++) {
//            sumAge+=friends[i].getAge();
//        }
//        System.out.println("四女朋友的平均年龄为："+sumAge/friends.length);
//        //统计年龄比平均值低的女朋友有几个?并把她们的所有信息打印出来。
//        System.out.println("以下四女朋友的年龄比平均值低的有：");
//        int count=0;
//        for (int i = 0; i < friends.length; i++) {
//            if(friends[i].getAge()<sumAge/friends.length){
//                System.out.println(friends[i].toString());
//                count++;
//            }
//        }
//        System.out.println("四女朋友中年龄比平均值低的有"+count+"个");

        /*对象数组5
        定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性:学号，姓名，年龄。
        要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2:添加完毕之后，遍历所有学生信息。
        要求3:通过id删除学生信息如果存在，则删除，如果不存在，则提示删除失败。
        要求4:删除完毕之后，遍历所有学生信息。
        要求5:查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁*/
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        String[] studentIds = new String[3];
        for (int i = 0; i < students.length; i++) {
            Student s = new Student();
            System.out.println("请输入第" + (i + 1) + "个学生的学号：");
            String id = sc.next();
            //判断学号的唯一性
            if (!checkIdExist(studentIds, id)) {
                s.setId(id);
                studentIds[i] = s.getId();
            } else {
                System.out.println("学号" + id + "已存在，请重新输入！");
                i--;
                continue;
            }
            System.out.println("请输入第" + (i + 1) + "个学生的姓名：");
            s.setName(sc.next());
            System.out.println("请输入第" + (i + 1) + "个学生的年龄：");
            s.setAge(sc.nextInt());
            students[i] = s;
        }
        //遍历学生数组
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

        //再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        //判断数组是否满了
        int count = studentCount(students);
        boolean lengthIsChanged = false;
        System.out.println("是否要再次添加一个学生对象？(true/false)");
        boolean choice = sc.nextBoolean();
        if (choice) {
            while (choice) {
                if (count == students.length) {
                    Student[] students1 = studentIsFull(students);
                    String[] studentIds1 = studentIdIsFull(studentIds);
                    lengthIsChanged = true;
                    Student s1 = new Student();
                    System.out.println("请输入新学生的学号：");
                    String newId = sc.next();
                    //判断学号的唯一性
                    if (!checkIdExist(studentIds1, newId)) {
                        s1.setId(newId);
                    } else {
                        System.out.println("学号" + newId + "已存在，请重新输入！");
                        continue;
                    }
                    System.out.println("请输入新学生的姓名：");
                    s1.setName(sc.next());
                    System.out.println("请输入新学生的年龄：");
                    s1.setAge(sc.nextInt());
                    students1[count] = s1;
                    printStudents(students1);

                    //删除数组的元素
                    deleteStudent(students1, studentIds1);
                    printStudents(students1);

                    //查询学生信息
                    checkStudentInfo(students1, studentIds1);
                } else if (count < students.length) {
                    System.out.println("请输入新学生的学号：");
                    String newId = sc.next();
                    //判断学号的唯一性
                    if (!checkIdExist(studentIds, newId)) {
                        students[count].setId(newId);
                        studentIds[count] = students[count].getId();
                    } else {
                        System.out.println("学号" + newId + "已存在，请重新输入！");
                        continue;
                    }
                    System.out.println("请输入新学生的姓名：");
                    students[count].setName(sc.next());
                    System.out.println("请输入新学生的年龄：");
                    students[count].setAge(sc.nextInt());
                    printStudents(students);
                    deleteStudent(students, studentIds);
                    printStudents(students);
                    checkStudentInfo(students, studentIds);

                }
                break;
            }
        } else {


            // 3. 通过id删除学生信息（优化后的代码）--一次
            System.out.println("\n请输入要删除的学生学号：");
            String delId = sc.next();
            boolean found = false;

            // 一次遍历同时处理两个数组的删除和调整
            int nonNullIndex = 0;
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                    if (students[i].getId().equals(delId)) {
                        // 找到要删除的学生，标记为已删除
                        found = true;
                    } else {
                        // 非删除元素，保持位置或前移
                        if (nonNullIndex != i) {
                            students[nonNullIndex] = students[i];
                            studentIds[nonNullIndex] = studentIds[i];
                            students[i] = null;
                            studentIds[i] = null;
                        }
                        nonNullIndex++;
                    }
                }
            }

            // 如果找到要删除的学生，将最后一个非空位置之后的元素设为null
            if (found) {
                for (int i = nonNullIndex; i < students.length; i++) {
                    students[i] = null;
                    studentIds[i] = null;
                }
                System.out.println("学号" + delId + "已删除！");
            } else {
                System.out.println("学号" + delId + "不存在！");
            }

            // 4. 删除完毕后遍历所有学生信息
            System.out.println("\n删除后的学生列表：");
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                    System.out.println(students[i].toString());
                }
            }


            //5. 查询并修改学生年龄
            System.out.println("\n请输入要查询的学生学号：");
            String checkId = sc.next();
            boolean ageUpdated = false;

            for (int i = 0; i < students.length; i++) {
                // 同时检查studentIds和students数组元素是否为null
                //TODO: 数组早晚都会访问到null,只是在访问到null时，会跳过if语句，所以还是要检查是否为null
                if (studentIds[i] != null && students[i] != null && studentIds[i].equals(checkId)) {
                    students[i].setAge(students[i].getAge() + 1);
                    System.out.println("学号" + checkId + "的年龄已+1岁，当前年龄为：" + students[i].getAge());
                    ageUpdated = true;
                    break; // 假设学号唯一，找到后直接退出循环
                }
            }

            if (!ageUpdated) {
                System.out.println("学号" + checkId + "不存在！");
            }
        }
    }

    //TODO:静态方法可以直接通过类名调用，而不需要创建类的实例
    public static boolean checkIdExist(String[] studentIds, String id) {
        for (int i = 0; i < studentIds.length; i++) {
            if (studentIds[i] != null && studentIds[i].equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static int studentCount(Student[] students) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static Student[] studentIsFull(Student[] students) {
        Student[] students1 = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            students1[i] = students[i];
        }
        return students1;
    }

    public static String[] studentIdIsFull(String[] studentIds) {
        String[] studentIds1 = new String[studentIds.length + 1];
        for (int i = 0; i < studentIds.length; i++) {
            studentIds1[i] = studentIds[i];
        }
        return studentIds1;
    }

    public static void printStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].toString());
            }
        }
    }

    //删除学生信息
    public static Student[] deleteStudent(Student[] students, String[] studentIds) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n请输入要删除的学生学号：");
        String delId = sc.next();
        boolean found = false;

        // 一次遍历同时处理两个数组的删除和调整
        int nonNullIndex = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId().equals(delId)) {
                    // 找到要删除的学生，标记为已删除
                    found = true;
                } else {
                    // 非删除元素，保持位置或前移
                    if (nonNullIndex != i) {
                        students[nonNullIndex] = students[i];
                        studentIds[nonNullIndex] = studentIds[i];
                        students[i] = null;
                        studentIds[i] = null;
                    }
                    nonNullIndex++;
                }
            }
        }

        // 如果找到要删除的学生，将最后一个非空位置之后的元素设为null
        if (found) {
            for (int i = nonNullIndex; i < students.length; i++) {
                students[i] = null;
                studentIds[i] = null;
            }
            System.out.println("学号" + delId + "已删除！");
        } else {
            System.out.println("学号" + delId + "不存在！");
        }

        return students;
    }

    //查询学生信息
    public static void checkStudentInfo(Student[] students, String[] studentIds) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n请输入要查询的学生学号：");
        String checkId = sc.next();
        boolean ageUpdated = false;

        for (int i = 0; i < students.length; i++) {
            // 同时检查studentIds和students数组元素是否为null
            //TODO: 数组早晚都会访问到null,只是在访问到null时，会跳过if语句，所以还是要检查是否为null
            if (studentIds[i] != null && students[i] != null && studentIds[i].equals(checkId)) {
                students[i].setAge(students[i].getAge() + 1);
                System.out.println("学号" + checkId + "的年龄已+1岁，当前年龄为：" + students[i].getAge());
                ageUpdated = true;
                break; // 假设学号唯一，找到后直接退出循环
            }
        }

        if (!ageUpdated) {
            System.out.println("学号" + checkId + "不存在！");
        }
    }
}
