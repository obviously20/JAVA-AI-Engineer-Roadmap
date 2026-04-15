package learing.reflection.homework.t2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        //反射可以跟配置文件结合的方式，动态的创建对象，并调用方法

        //1.加载配置文件
        //1.1创建Properties对象
        Properties prop = new Properties();
        //1.2创建输入流
        FileInputStream fis = new FileInputStream("resources\\prop.properties");
        //1.3加载配置文件
        prop.load(fis);
        //1.4关闭流
        fis.close();
        System.out.println(prop);

        //2.根据配置文件中的信息，创建对象
        //2.1获取全类名和方法名
        String className = prop.getProperty("classname");
        String methodName = prop.getProperty("method");
        System.out.println(className);
        System.out.println(methodName);

        //2.2根据全类名创建class对象
        Class clazz = Class.forName(className);

        //2.3获取构造方法
        Constructor constructor = clazz.getDeclaredConstructor();
        Object object = constructor.newInstance();
        System.out.println(object);

        //2.4调用方法
        Method method = clazz.getDeclaredMethod(methodName);
        //允许访问私有方法
        method.setAccessible(true);
        method.invoke(object);




    }
}
