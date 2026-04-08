package learing.myIO.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class T1 {
    public static void main(String[] args) throws IOException {
        //拷贝文件
//        //一次读取一个字节：效率低
//        //1.创建源文件对象(读取）
//        FileInputStream fis = new FileInputStream(new File("src\\learing\\myIO\\tryland\\like.mp4"));
//        //2.创建目标文件对象(写入)
//        FileOutputStream fos = new FileOutputStream(new File("src\\learing\\myIO\\tryland\\goal\\likecp.mp4"));
//        //3.读取源文件内容
//        int fileData;
//        while((fileData=fis.read())!=-1){
//            //边读边写
//            fos.write(fileData);
//        }
//        //4.关闭流
//        //最后关闭最早创建的流
//        fos.close();
//        fis.close();


        //plus:read(byte[] b)：一次读取多个字节，效率高
        long startTime = System.currentTimeMillis();
        //1.创建源文件对象(读取）
        FileInputStream fis = new FileInputStream(new File("src\\learing\\myIO\\tryland\\like.mp4"));
        //2.创建目标文件对象(写入)
        FileOutputStream fos = new FileOutputStream(new File("src\\learing\\myIO\\tryland\\goal\\likecp2.mp4"));
        //3.读取源文件内容
        int len;
        byte[] datas = new byte[1024 * 1024 * 5];
        while((len = fis.read(datas))!=-1){
            //边读边写
            fos.write(datas,0,len);
        }
        //4.关闭流
        //最后关闭最早创建的流
        fos.close();
        fis.close();
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("拷贝时间："+totalTime+"ms");//拷贝时间：4ms

    }
}
