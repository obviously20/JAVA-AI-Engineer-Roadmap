package learing.reflection.getField;

import java.io.File;
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        ///*
        //Class类中用于获取成员变量的方法
        //    Field[] getFields():                返回所有公共成员变量对象的数组
        //    Field[] getDeclaredFields():       返回所有成员变量对象的数组
        //    Field getField(String name):        返回单个公共成员变量对象
        //    Field getDeclaredField(String name): 返回单个成员变量对象
        //
        //Field类中用于创建对象的方法
        //    void set(Object obj, Object value): 赋值
        //    Object get(Object obj)              获取值
        //*/

        Class clazz = Class.forName("learing.reflection.getField.Student");

        //获取所有公共成员变量对象的数组
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("-----------------");

        //获取所有成员变量对象的数组
        Field[] fields1 = clazz.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field);
        }
        System.out.println("-----------------");

        //获取单个公共成员变量对象
        Field field = clazz.getField("gander");
        System.out.println(field);
        System.out.println("-----------------");

        //获取单个成员变量对象
        Field field1 = clazz.getDeclaredField("name");
        System.out.println(field1);
        System.out.println("-----------------");

        //获取权限修饰符
        //public: 0
        //private: 1
        //protected: 2
        int modifiers = field1.getModifiers();
        System.out.println(modifiers);
        System.out.println("-----------------");
        //获取成员变量的数据类型
        Class type = field1.getType();
        System.out.println(type);
        System.out.println("-----------------");
        //获取成员变量的名称
        String name = field1.getName();
        System.out.println(name);
        System.out.println("-----------------");

        //获取成员变量记录的值
        Student student = new Student("张三", 18, "男");
        //todo 临时开启访问权限
        field1.setAccessible(true);
        String value = (String) field1.get(student);
        System.out.println(value);
        System.out.println("-----------------");

        //修改成员变量记录的值
        field1.set(student, "李四");
        System.out.println(student);
        System.out.println("-----------------");
    }
}
