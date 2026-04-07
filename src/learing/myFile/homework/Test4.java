package learing.myFile.homework;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        //需求:
        //删除一个多级文件夹
//        File file = new File("D:\\JAVA_learning\\Java-top-speed\\src\\learing\\myFile\\homework\\testLand\\bbb\\bb2\\bbb.txt");
//        boolean isSuccess = file.mkdirs();
//        System.out.println(isSuccess);//true

        File file = new File("D:\\JAVA_learning\\Java-top-speed\\src\\learing\\myFile\\homework\\testLand\\bbb");

        //
        boolean isSuccess = deleteDirs(file);
        System.out.println(isSuccess);//true


    }
    //删除一个多级文件夹：不经过回收站
    public static boolean deleteDirs(File file) {
        // 检查文件是否存在
        if (!file.exists()) {
            return false;
        }
        //先获取文件夹中的所有文件和文件夹
        File[] files = file.listFiles();
        //如果文件夹为空，直接删除
        if(files.length == 0){
            file.delete();
            return true;
        }else if(files.length > 0){//不为空
            //遍历文件夹中的所有文件和文件夹
            for (File f : files) {
                if(f.isDirectory()){//如果是文件夹，递归调用方法
                    deleteDirs(f);//递归调用方法
                }else if(f.isFile()){//如果是文件，直接删除
                    f.delete();//删除文件
                }
            }
            //里面的全删完，再最外面的删除文件夹
            file.delete();
            return true;
        }
        return false;
    }
}
