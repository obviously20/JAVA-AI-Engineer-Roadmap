package learing.reflection.getMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //规则：
        //
        //get表示获取
        //
        //Declared表示私有
        //
        //最后的s表示所有，复数形式
        //
        //如果当前获取到的是私有的，必须要临时修改访问权限，否则无法使用
        //
        //| 方法名                                                       | 说明                                         |
        //| ------------------------------------------------------------ | -------------------------------------------- |
        //| Method[] getMethods()                                        | 返回所有成员方法对象的数组（只能拿public的） |
        //| Method[] getDeclaredMethods()                                | 返回所有成员方法对象的数组，存在就能拿到     |
        //| Method getMethod(String name, Class<?>... parameterTypes)    | 返回单个成员方法对象（只能拿public的）       |
        //| Method getDeclaredMethod(String name, Class<?>... parameterTypes) | 返回单个成员方法对象，存在就能拿到           |



        Class clazz = Class.forName("learing.reflection.getMethod.Student");

        //获取所有成员方法(只能拿public的且父类的 public 也会被拿到)
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);

        }

        System.out.println("-----------------");

        //获取所有成员方法(存在就能拿到:包括私有的且父类的 private 也会被拿到)
        methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("-----------------");

        //获取单个成员方法(只能拿public的)
        Method method = clazz.getMethod("sleep");
        System.out.println(method);
        System.out.println("-----------------");

        //获取单个成员方法(存在就能拿到)
        //参数：方法名，参数类型
        Method method1 = clazz.getDeclaredMethod("study", String.class);
        System.out.println(method1);
        System.out.println("-----------------");


        //————————————————————————解剖————————————————————————

        //获取方法的修饰符
        int modifiers = method1.getModifiers();
        System.out.println(modifiers);

        //获取方法的名字
        String name =method1.getName();
        System.out.println(name);

        //获取方法的形参
        Parameter[] parameters = method1.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter.getType());
        }

        //获取方法抛出的异常
        Class[] exceptionsTypes = method1.getExceptionTypes();
        for (Class exceptionType : exceptionsTypes) {
            System.out.println(exceptionType);
        }


        //方法运行
        //
        // Object invoke(Object obj, Object... args) ：运行方法
        //
        //参数一：用obj对象调用该方法
        //
        //参数二：调用方法的传递的参数（如果没有就不写）
        //
        //返回值：方法的返回值（如果没有就不写）

        Student student = new Student();
        //临时修改访问权限
        method1.setAccessible(true);
        String result = (String) method1.invoke(student, "数学");
        System.out.println(result);





    }
}
