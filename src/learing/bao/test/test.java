package learing.bao.test;

import learing.bao.domain.Student;
import learing.bao.domain.Teacher;

import java.lang.ref.Cleaner;

public class test {
    public static void main(String[] args) {
        //TODO 包就是文件夹用来管理各种不同功能的Java类，方便后期代码维护
        //TODO 包名的规则：公司的域名反写+包的作用，需要全部英文小写，见名知意（公司的域名倒写+项目名+模块名）
        //TODO 全类名/全限定名：包名+类名------eg:learing.bao.test.test

        //TODO 使用其他类的规则
        //TODO 要使用其他类，必须先导入这个类所在的包
        //1.使用同一个包下的类，直接写类名即可，不需要导入包
        //2.使用Java.lang包下的类，直接写类名即可，不需要导入包
        //3.其他包下的类，需要先导入这个类所在的包，然后写类名即可（import 包名.类名-----alt+回车）
        ////如果同时使用两个包下的同名类，需要使用全类名/全限定名来区分

        //1
        Student s1 = new Student();
        s1.setId(1001);
        s1.setName("张三");
        System.out.println(s1.getId());
        System.out.println(s1.getName());

        //2.
        String s2 = "hello world";
        System.out.println(s2);

        //3.
        Teacher t1 = new Teacher();
        t1.setAge(30);
        System.out.println(t1.getAge());

        //4.
        learing.bao.domain.Teacher t2 = new learing.bao.domain.Teacher("李四", 40);
        learing.bao.domain2.Teacher t3 = new learing.bao.domain2.Teacher("王五", 50);
        System.out.println(t2.getName());
        System.out.println(t3.getName());


    }
}
