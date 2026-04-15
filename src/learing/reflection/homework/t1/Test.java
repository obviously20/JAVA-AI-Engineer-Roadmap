package learing.reflection.homework.t1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        //对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中去

        NPC npc = new NPC("李四", 40, "能说会道", "交际官");
        Hero hero = new Hero("张三", 25, "风刃", "剑", 100.0);


        //调用方法
        saveToFile(npc);
        saveToFile(hero);



    }
    public static void saveToFile(Object obj) throws IOException, IllegalAccessException {
        //将对象的所有字段名和值，保存到文件中去
        //1.获取class对象
        Class clazz = obj.getClass();

        //2.创建输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\learing\\reflection\\homework\\t1\\testland\\test.txt",true));

        //3.获取改对象的所有成员变量
        Field[] files = clazz.getDeclaredFields();
        for (Field field : files) {
            //允许访问私有字段
            field.setAccessible(true);
            //获取字段名
            String name = field.getName();
            //获取字段值
            String value = field.get(obj).toString();
            //将字段名和值，写入文件中去
            bw.write(name+"="+value+"\n");
        }
        //4.关闭流
        bw.close();


    }
}
