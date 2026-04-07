package learing.myFile.homework;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //需求:
        //在当前模块下的aaa文件夹中创建一个a.txt文件
        //path:D:\JAVA_learning\Java-top-speed\src\learing\myFile\homework\testLand\aaa
        File file = new File("D:\\JAVA_learning\\Java-top-speed\\src\\learing\\myFile\\homework\\testLand\\aaa\\a.txt");
        boolean isSuccess = file.createNewFile();
        System.out.println(isSuccess);//true

    }
}
