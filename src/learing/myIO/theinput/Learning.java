package learing.myIO.theinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Learning {
    public static void main(String[] args) throws IOException {
        //演示:字节输入流FileInputStream实现需求:读取文件中的数据。(暂时不写中文)
        //实现步骤:
        //创建对象
        //读取数据
        //释放资源

//        //try
//        FileInputStream fis = new FileInputStream("D:\\JAVA_learning\\Java-top-speed\\src\\learing\\myIO\\tryland\\hello.txt");
//        int data = fis.read();
//        System.out.println((char)data);
//        data = fis.read();
//        System.out.println((char)data);
//        fis.close();


        ///*
        //字节输入流的细节:
        //1.创建字节输入流对象
        //    细节1: 如果文件不存在, 就直接报错。
        //    Java为什么会这么设计呢?
        //    输出流: 不存在, 创建
        //        把数据写到文件当中
        //
        //    输入流: 不存在, 而是报错呢?
        //        因为创建出来的文件是没有数据的, 没有任何意义。
        //        所以Java就没有设计这种无意义的逻辑, 文件不存在直接报错。
        //
        //程序中最重要的是: 数据。
        //
        //2.读数据
        //    细节1: 一次读一个字节, 读出来的是数据在ASCII上对应的数字
        //    细节2: 读到文件末尾了, read方法返回-1。
        //
        //3.释放资源
        //    细节: 每次使用完流之后都要释放资源
        //*/

//        //todo 字节输入流的循环读取
//        FileInputStream fis = new FileInputStream("D:\\JAVA_learning\\Java-top-speed\\src\\learing\\myIO\\tryland\\hello.txt");
//        int charData;//定义第三方变量, 用于存储每次读取到的字节数据，以防重复调用read方法时跳过数据
//        while((charData=fis.read())!=-1){
//            System.out.print((char)charData);
//        }
//        fis.close();


        //todo read()一一次读取一个字节太慢了；
        // 那就一次读取多个字节，效率高了。-->read(byte[] b)方法:数组越大,效率越高，但是数组不能太大的话, 会导致内存溢出。建议1024的倍数。
        // str.getBytes()方法:把字符串转换为字节数组。;还有一个构造方法:取对应长度的字节数组：new String(byte[] b, int off(开始下标), int len)

//        FileInputStream fis = new FileInputStream("src\\learing\\myIO\\tryland\\read.txt");//abcdefg
//        byte[] datas = new byte[3];//一次读取3个字节
//        int len = fis.read(datas);//读取3个字节, 并返回读取到的字节数
//        System.out.println(new String(datas,0,len));//abc
//        len = fis.read(datas);
//        System.out.println(new String(datas,0,len));//def
//        len = fis.read(datas);
//        System.out.println(new String(datas,0,len));//g
//        fis.close();

        FileInputStream fis = new FileInputStream("src\\learing\\myIO\\tryland\\read.txt");
        int len;
        byte[] datas = new byte[3];
        while((len = fis.read(datas))!=-1){
            System.out.println(new String(datas,0,len));
        }
        fis.close();





    }
}
