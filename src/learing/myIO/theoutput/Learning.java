package learing.myIO.theoutput;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Learning {
    public static void main(String[] args) throws IOException {
//        //try
//        //OutputStream输出流：程序->文件;同时也是个抽象类-->要用它的子类实现它
//        FileOutputStream fos = new FileOutputStream("D:\\JAVA_learning\\Java-top-speed\\src\\learing\\myIO\\tryland\\hello.txt");
//        fos.write("hello world".getBytes());
//        fos.close();


        //创建字节输出流对象
        //细节1:参数是字符串表示的路径或者File对象都是可以的
        //细节3:如果文件已经存在，则会清空文件
        //细节2:如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的。
        //写数据
        //细节:write方法的参数是整数，但是实际上写到本地文件中的是整数在ASCIl上对应的字符
        //释放资源
        //细节:每次使用完流之后都要释放资源


        /*
        FileOutputStream的3种write方法说明：
        1. void write(int b)：一次写一个字节数据
        2. void write(byte[] b)：一次写一个字节数组数据
        3. void write(byte[] b, int off, int len)：一次写一个字节数组的部分数据
           参数一：数组
           参数二：起始索引（从0开始）
           参数三：要写入的字节个数
        */

//        // 1. 创建对象（如果文件不存在会自动创建；如果文件存在会清空原有内容）
//        FileOutputStream fos = new FileOutputStream("D:\\JAVA_learning\\Java-top-speed\\src\\learing\\myIO\\tryland\\hello.txt");
//
//        // 2. 写出数据（示例1：逐个字节写入，对应字符a、b）
//        // fos.write(97); // 97对应ASCII字符'a'
//        // fos.write(98); // 98对应ASCII字符'b'
//
//        // 示例2：字节数组写入
//        byte[] bytes = {97, 98, 99, 100, 101}; // 对应a、b、c、d、e
//        // fos.write(bytes); // 一次性写入整个数组，文件内容为abcde
//
//        // 示例3：写入数组的部分数据（从索引1开始，写2个字节）
//        // 索引1对应98（b），索引2对应99（c），最终写入bc
//        fos.write(bytes, 1, 2);
//
//        // 3. 释放资源（必须执行，否则会占用系统资源）
//        fos.close();



        //str.getBytes():将字符串转换为字节数组

        ///*
        //换行写：
        //    再次写出一个换行符就可以了
        //    windows： \r\n
        //    Linux：   \n
        //    Mac：     \r
        //
        //细节：
        //    在windows操作系统当中，java对回车换行进行了优化。
        //    虽然完整的是\r\n，但是我们写其中一个\r或者\n，
        //    java也可以实现换行，因为java在底层会补全。
        //
        //建议：
        //    不要省略，还是写全了。
        //
        //续写：
        //    如果想要续写，打开续写开关即可
        //
        //    开关位置：创建对象的第二个参数
        //    默认false：表示关闭续写，此时创建对象会清空文件
        //    手动传递true：表示打开续写，此时创建对象不会清空文件
        //*/

        FileOutputStream fos = new FileOutputStream("D:\\JAVA_learning\\Java-top-speed\\src\\learing\\myIO\\tryland\\hello.txt", true);
        fos.write("\r\n".getBytes());
        fos.write("hello world".getBytes());
        fos.close();




    }
}
