package learing.reflection.getConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //利用反射获取构造方法
        //Class类中用于获取构造方法的方法
        // Constructor<?>[]getConstructors():返回所有公共构造方法对象的数组
        // Constructor<?>[]getDeclaredConstructors():返回所有构造方法对象的数组
        // Constructor<T>getConstructor(Class<?>...parameterTypes): 返回单个公共构造方法对象
        // Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes): 返回单个构造方法对象

        //Constructor类中用于创建对象的方法
        //TnewInstance(Object...initargs):根据指定的构造方法创建对象
        //setAccessible(boolean flag):设置为true,表示取消访问检查


        Class clazz = Class.forName("learing.reflection.getConstructor.Student");

        //1.获取公共构造方法
        /*Constructor[] constructor = clazz.getConstructors();
        for (Constructor c : constructor) {
            System.out.println(c);
        }*/

        //2.获取所有构造方法
        /*Constructor[] constructor = clazz.getDeclaredConstructors();
        for (Constructor c : constructor) {
            System.out.println(c);
        }*/

        //3/4.获取指定构造方法
        /*Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor);

        Constructor constructor2 = clazz.getDeclaredConstructor();
        System.out.println(constructor2);

        Constructor constructor3 = clazz.getDeclaredConstructor(String.class);
        System.out.println(constructor3);

        Constructor constructor4 = clazz.getDeclaredConstructor(int.class);
        System.out.println(constructor4);
        */

        //-----------------解剖构造方法对象-----------------------------
        //获取修饰符
        //获取名字
        //获取形参
        //创建对象

        //获取构造方法对象
        Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);

        //获取修饰符:0,1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192
        //public:1
        //private:2
        //protected:4
        //default:0
        int modifiers = constructor.getModifiers();
        System.out.println(modifiers);

        //获取名字
        String name = constructor.getName();
        System.out.println(name);

        //获取形参
        Parameter[] parameters = constructor.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        //创建对象
        Constructor constructor2 = clazz.getDeclaredConstructor(String.class);

        //todo 暴力反射
        //      临时取消访问检查
        //暴力发射：调用私有构造方法/保护方法（不让用的构造方法）-->取消访问检查-->强制调用
        constructor2.setAccessible(true);
        Student student = (Student) constructor2.newInstance("张三");
        System.out.println(student);






    }
}
