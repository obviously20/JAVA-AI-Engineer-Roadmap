package learing.API.myObject;

import com.google.gson.Gson;

import java.util.Objects;

public class LearningObject {
    public static void main(String[] args) throws CloneNotSupportedException {
//        //TODO
//        // public String toStrng() //返回该对象的字符串表示形式（包名+类名+@+哈希码）
//        Object object = new Object();
//        System.out.println(object.toString());//java.lang.Object@185f39b6
//        Student student = new Student("张三", 18);
////        System.out.println(student.toString());//learing.API.myObject.Student@4dd8dc3
//        //但是我们调用toString方法，不是要创建对象的地址值，而是要展示对象的属性值
//        //所以在前面也学到过，当所继承的父类不能满足我们的需求时，我们可以重写toString方法-->所以在Student类中重写了toString方法
//        //重写后，调用toString方法，会返回对象的属性值
//        System.out.println(student.toString());//Student{name = 张三, age = 18}
//
//        /*小结：
//        1. 在通过输出语句输出一个对象时，默认调用的就是toString()方法
//        2. 输出地址值一般没有意义，我们可以通过重写toString方法去输出对应的成员变量信息（快捷键：atl + insert ， 空白处 右键 -> Generate -> 选择toString）
//        3. toString方法的作用：以良好的格式，更方便的展示对象中的属性值
//        4. 一般情况下Jdk所提供的类都会重写Object类中的toString方法*/

//        //TODO
//        // public boolean equals(Object obj); //比较两个对象地址值是否相等；true表示相同，false表示不相同
//        Student student1 = new Student("张三", 18);
//        Student student2 = new Student("张三", 18);
//        //这里应为Student类中没有重写equals方法，所以默认调用Object类中的equals方法，比较的是对象的地址值
//        //而显然，student1和student2是两个不同的对象，所以返回false
////        System.out.println(student1.equals(student2));//false
//        //在重写了equals方法后，比较的是对象的属性值
//        //而显然，student1和student2的属性值是相同的，所以返回true
//        System.out.println(student1.equals(student2));//true
//
//        //TODO 大厂面试题
//        String s = "abc";
//        StringBuilder sb = new StringBuilder("abc");
//        System.out.println(s.equals(sb));//false
//        //因为s是String类型，当其调用equals方法时，String类里面重写了equals方法逻辑
//        /*public boolean equals(Object anObject) {
//            if (this == anObject) {
//                return true;
//            }
//            return (anObject instanceof String aString)
//                    && (!COMPACT_STRINGS || this.coder == aString.coder)
//                    && StringLatin1.equals(value, aString.value);
//        }*/
//        //当判断到s与sb的类型不同，所以返回false
//
//        System.out.println(sb.equals(s));//false
//        //而StringBuilder类中没有重写equals方法，所以默认调用Object类中的equals方法，比较的是对象的地址值
//        //而显然，sb与s是两个不同的对象，所以返回false\
//
//        //小结：
//        //1. 默认情况下equals方法比较的是对象的地址值
//        //2. 比较对象的地址值是没有意义的，因此一般情况下我们都会重写Object类中的equals方法


        //public Object clone() //创建当前对象的一个副本，返回副本的引用(实现的是浅拷贝)
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        User user1 = new User(1, "张三", "123456", "C:\\Users\\Administrator\\Desktop\\123", data);
        //要调用Object类中的clone方法，所以要抛出CloneNotSupportedException异常
        //所以要在方法签名中添加throws CloneNotSupportedException异常
        //且Object类中的clone方法是native修饰的，所以不能被重写，只能被调用父类的clone方法-->所以这里要在User类中重写clone方法（其中调用父类的clone方法）
        User user2 = (User) user1.clone();
        //TODO 浅拷贝:基本数据类型直接复制，引用数据类型复制的是地址值（指向的是同一个对象）：
        // 如字符串的话就是复制user1.username在串池中的地址值给user2的user2.username
        // 如数组的话就是复制user1.data的地址值给user2的user2.data
        // 而数组是引用数据类型，所以user2.data指向的是user1.data指向的同一个数组
        // 所以，当user1.data中的元素被修改时，user2.data中的元素也会被修改
        // 同样，当user2.data中的元素被修改时，user1.data中的元素也会被修改
//        data[0] = 100;
//        System.out.println(user1.toString());//User{id = 1, username = 张三, password = 123456, path = C:\\Users\\Administrator\\Desktop\\123, data = [100, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0]}
//        System.out.println(user2.toString());//User{id = 1, username = 张三, password = 123456, path = C:\\Users\\Administrator\\Desktop\\123, data = [100, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0]}

        //TODO 深拷贝：基本数据类型直接复制，引用数据类型复制的是新创建的对象：
        // 字符串在串池中创建一个新的字符串对象（但是如果在串池中已经存在，就直接返回存在的字符串对象的地址值），
        // 数组在堆中创建一个新的数组对象，把user1.data中的元素复制到新创建的数组中，把新创建的数组的地址值赋值给user2的user2.data
        //如果要完成深拷贝，需要在User类中重写clone方法，实现深拷贝的逻辑
//        data[0] = 100;
//        System.out.println(user1.toString());
//        System.out.println(user2.toString());

//        //但是，深拷贝的逻辑比较复杂（eg:二维数组），所以当需要深拷贝时，会调用第三方的深拷贝工具类：gson
//        //项目中导入gson的jar包
//        Gson gson = new Gson();
//        //把user1对象转换为json字符串
//        String json = gson.toJson(user1);
//        //把json字符串转换为user对象-->实现深拷贝
//        user2 = gson.fromJson(json, User.class);
//        //验证深拷贝是否成功
//        data[0] = 100;
//        System.out.println(user1);
//        System.out.println(user2);

        //Objects是Object的一个工具类
        Student s1 = null;
        Student s2 = new Student("张三", 18);
//        System.out.println(s1.equals(s2));//异常，因为s1是null，所以调用equals方法时，会抛出NullPointerException异常
        // -->所以要判断s1是否为null，若为null，则提示s1不能为空
//        if(s1 == null){
//            System.out.println("s1不能为空");
//        }else {
//            System.out.println(s1.equals(s2));
//        }
        //TODO-->但是每次都要自己写判断调用者是否为null，若为null，则提示调用者不能为空-->于是就有Objects类中的equals方法了
        //Objects.equals()方法：先判断调用者是否为null，若为null，则返回false，若不为null，则调用equals方法比较
        //调用equals方法是类中的equals方法，如果有重写equals方法，就会调用重写后的equals方法比较属性是否相等，
        // 如果没有重写equals方法，就会调用Object类中的equals方法，比较的是对象的地址值
        Student s3 = null;
        Student s4 = new Student("张三", 18);
        System.out.println(Objects.equals(s3, s4));//false

        //Objects.isNull()方法：判断对象是否为null
        System.out.println(Objects.isNull(s3));//true
        System.out.println(Objects.isNull(s4));//false

        //Objects.nonNull()方法：判断对象是否不为null
        System.out.println(Objects.nonNull(s3));//false
        System.out.println(Objects.nonNull(s4));//true







    }
}
