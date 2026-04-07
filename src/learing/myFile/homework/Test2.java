package learing.myFile.homework;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        //需求:
        //定义一个方法找某一个文件夹中，是否有以avi结尾的电影。
        //(暂时不需要考虑子文件夹)
        File file = new File("D:\\JAVA_learning\\Java-top-speed\\src\\learing\\myFile\\homework\\testLand\\aaa");
        boolean hasAvi = hasAvi(file);
        System.out.println(hasAvi);//false
    }

    //定义一个方法，找某一个文件夹中，是否有以avi结尾的电影。
    public static boolean hasAvi(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.getName().endsWith(".avi") && f.isFile()){
                return true;
            }
        }
        return false;
    }
}
