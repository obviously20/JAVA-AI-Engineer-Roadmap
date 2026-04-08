package learing.myFile.homework;

import java.io.File;

public class Test6 {
    public static void main(String[] args) {
        //需求：统计一个文件夹的总大小

        File file = new File("D:\\JAVA_learning\\Java-top-speed\\src\\learing\\myFile\\homework\\testLand\\aaa");
        System.out.println(countSize(file));



    }

    //shift+F6:统一修改变量名
    public static long countSize(File file) {
        File[] files = file.listFiles();
        long len = 0;
        for (File f : files) {
            //如果是文件，直接加到count中
            if (f.isFile()) {
                len += f.length();
            } else if (f.isDirectory()) {
                //如果是文件夹，递归调用方法
                len += countSize(f);
            }
        }
        return len;
    }


}
