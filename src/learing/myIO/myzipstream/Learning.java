package learing.myIO.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Learning {
    public static void main(String[] args) {
//        File file = new File("src/learing/myIO/tryland/zmh.txt");
//        System.out.println(file.toString());
//        System.out.println(file.getName());

        //创建一个方法来实现压缩文件夹
        //1.创建file对象表示要压缩的文件夹
//        File src = new File("");
        //2.创建file对象表示压缩包放那里
        //压缩包的父级路径
//        File destParent = src.getParentFile();
        //压缩包路径
        //文件getName()a.tx；文件夹getName()a
//        File dest =  new File(destParent,src.getName()+"zip");
        //3.创建压缩流关联压缩包
//        ZipOutputStream zos = new ZipOutputStream(new File(dest));
        //4.获取src里面每个文件，变成zipentry对象，放入到压缩包中
//        cometruecvfdir(src,zos,src.gegtName());
        //5.释放资源
//        zos.close();

    }

    //创建一个方法来实现解压缩（都里面的再写到目的地--out）
    public static void cometruexvf(File src, File dest) throws IOException {
        //读取压缩包
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        //把压缩包里面每一个zipentry给读出来
        ZipEntry ze;
        while((ze=zis.getNextEntry())!=null){//zis.getNextentry是拿到文件夹里的文件夹名或文件名
            //如果是文件夹
            if(ze.isDirectory()){
                //把文件夹名读取创建到对应目的文件夹下
                new File(dest, ze.toString()).mkdirs();
            }else{
                //如果是文件就拷贝里面的数据
                FileOutputStream fos = new FileOutputStream(new File(dest, ze.toString()));
                int data;
                while((data=zis.read())!=-1){
                    fos.write(data);
                }
                //关闭文件输出流，释放资源
                fos.close();
                //关闭当前ZIP条目，准备读取下一个
                zis.closeEntry();
            }
        }
        //关闭ZIP输入流，释放资源
        zis.close();
    }



    //创建一个方法来压缩一个文件
    public static void cometruecvffile(File src, File dest) throws IOException {
        //src.getName()拿到文件名字eg: a.txt
        //按.分割取第一个[0]再拼接上压缩后缀.zip
        //创建压缩流关联压缩包
        ZipOutputStream zis = new ZipOutputStream(new FileOutputStream(new File(dest,src.getName().split("\\.")[0]+".zip")));
        //创建Zipentry对象表示压缩包里面的每一个文件夹/文件对象
        //new ZipEntry(名字/路径)：如果存文件名那就是在xx.zip/xx.txt;如果是路径：xx.zip/D:/a/a.txt
        ZipEntry ze = new ZipEntry(src.getName());
        //把ze对象放进压缩包中
        zis.putNextEntry(ze);
        //把src文件的数据写到压缩包中
        //读
        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b=fis.read())!=-1){
            zis.write(b);
        }
        fis.close();
        zis.closeEntry();
        zis.close();

    }


    //创建一个方法来实现压缩文件夹
    public static void cometruecvfdir(File src, ZipOutputStream zos ,String name) throws IOException {
        //1.进入src文件夹
        File[] files = src.listFiles();
        //2.遍历
        for (File file : files) {//这里得到的也是文件的名
            if(file.isFile()){
                //是文件对象，就拷贝放入压缩包中
                //表示压缩包中每一个文件/文件夹对象
                ZipEntry ze = new ZipEntry(name+"\\"+file.getName());
                //将对象放入压缩包中
                zos.putNextEntry(ze);
                FileInputStream fis = new FileInputStream(file);
                int b;
                while((b=fis.read())!=-1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }else{
                //如果是文件的话，递归
                cometruecvfdir(file, zos, name+"\\"+file.getName());
            }
        }
    }

}
