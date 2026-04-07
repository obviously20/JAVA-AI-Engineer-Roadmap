package learing.myFile.homework;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        //需求:
        //找到电脑中所有以avi结尾的电影。
        //(需要考虑子文件夹)
        //C:W
        //C:\\aaa
        //C:\\bbb


        File file = new File("D:\\JAVA_learning\\Java-top-speed\\src\\learing\\myFile\\homework\\testLand");
        findAvi2(file);




    }



    public static void findAvi2(File file) {
        File[] files = file.listFiles();
        for (File now : files) {
            if(now.isDirectory()){
                //如果是文件夹，递归调用方法
                findAvi2(now);
            }else if(now.getName().endsWith(".avi")&&now.isFile()){
                System.out.println(now.getAbsolutePath());//输出文件的绝对路径
            }
        }
    }


}
