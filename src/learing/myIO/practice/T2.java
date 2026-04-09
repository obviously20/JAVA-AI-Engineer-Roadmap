package learing.myIO.practice;

import java.io.*;

public class T2 {
    public static void main(String[] args) throws IOException {
        //需求:
        //拷贝一个文件夹，考虑子文件夹

        File src = new File("src/learing/myIO/tryland/goal");//源文件夹
        File dest = new File("src/learing/myIO/tryland/goal2");//目标文件夹
        copyDir(src,dest);//拷贝文件夹

    }
    public static void copyDir(File src,File dest) throws IOException {
        dest.mkdirs();//创建目标文件夹，如果不存在则创建，如果存在则创建失败但不会报错
        File[] files = src.listFiles();//获取源文件夹下的所有文件和子文件夹
        if (files!=null) {//如果不为空，说明源文件夹下有文件或子文件夹
            for (File f : files) {//遍历源文件夹下的所有文件和子文件夹
                if (f.isFile()) {//如果是文件，直接拷贝
                    FileInputStream fis = new FileInputStream(f);//源文件夹的输入流
                    FileOutputStream fos = new FileOutputStream(new File(dest,f.getName()));//目标文件夹的输出流
                    byte[] buffer = new byte[1024 * 1024 * 5];
                    int len;//读取到的字节数
                    while((len=fis.read(buffer))!=-1){
                        fos.write(buffer,0,len);
                    }
                    fos.close();//关闭输出流
                    fis.close();//关闭输入流
                }else if (f.isDirectory()) {//如果是子文件夹，递归拷贝
                    copyDir(f,new File(dest,f.getName()));//递归拷贝子文件夹
                }
            }
        }
    }
}
