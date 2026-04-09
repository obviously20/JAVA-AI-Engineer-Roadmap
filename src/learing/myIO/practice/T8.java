package learing.myIO.practice;

import learing.myIO.myobjectstream.Student;

import java.io.*;
import java.util.ArrayList;

public class T8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        //如果要序列化多个对象，改如何操作？
//
//        Student s1 = new Student("张三", 18);
//        Student s2 = new Student("李四", 19);
//        Student s3 = new Student("王五", 20);
//
//        //那就统一先把对象存入集合中
//        ArrayList<Student> list = new ArrayList<>();
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//
//        //最后再序列化集合
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\learing\\myIO\\tryland\\objectstream\\stu.txt"));
//        oos.writeObject(list);
//        oos.close();


        //反序列化集合
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\learing\\myIO\\tryland\\objectstream\\stu.txt"));
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
//        System.out.println(list);
        for (Student student : list) {
            System.out.println(student);
        }
        ois.close();



    }
}
