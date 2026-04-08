package learing.myIO.myReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Learning {
    public static void main(String[] args) throws IOException {
        ///*
        //FileReader 字符输入流 三步操作：
        //第一步：创建对象（关联本地文件）
        //    public FileReader(File file)          创建字符输入流，关联File对象代表的文件
        //    public FileReader(String pathname)    创建字符输入流，关联字符串路径代表的文件
        //    注意：如果文件不存在，会直接抛出 FileNotFoundException
        //
        //第二步：读取数据
        //    public int read()                     【单字符读取】一次读取一个字符（中文会自动读取对应字节数），读到文件末尾返回-1
        //    public int read(char[] buffer)        【批量读取】一次读取多个字符到字符数组，读到末尾返回-1
        //    底层原理：字符流本质是字节流+解码器，会自动根据编码（GBK/UTF-8）读取对应字节数并解码为字符
        //
        //第三步：释放资源
        //    public void close()                   关闭流，释放系统资源，必须调用，否则会造成资源泄漏
        //*/

         /*
        字符输入流 FileReader 使用步骤：
        1. 创建对象，关联本地文件
        2. 读取数据 read()
        3. 释放资源 close()
         */

//        //================== 1. 创建对象并关联本地文件 ==================
//        // 路径写法：Windows系统用 \\ 转义，也可以用 / 跨平台
//        FileReader fr = new FileReader("src\\learing\\myIO\\tryland\\cn.txt");
//
//        //================== todo 2. 读取数据 read() 原理详解 ==================
//        /*
//       todo read() 细节：
//        1. 字符流的底层也是字节流，默认也是一个字节一个字节读取的
//           如果遇到中文就会一次读取多个：GBK一次读2个字节，UTF-8一次读3个字节
//        2. 读取之后，方法底层会自动解码，并把解码后的字符转成十进制整数作为返回值
//           这个十进制数就是该字符在字符集中的编号
//           英文示例：文件中二进制 0110 0001 → read读取 → 解码 → 十进制97（对应字符'a'）
//           中文示例：文件中二进制 11100110 10110001 10001001 → read读取 → 解码 → 十进制27721（对应汉字）
//        3. 想要看到中文汉字，需要把十进制整数强转为 char 类型
//         */
//
//        // 单字符循环读取：read()返回-1代表读到文件末尾
//        int ch;
//        while ((ch = fr.read()) != -1) {
//            // 强转char，打印字符
//            System.out.print((char) ch);
//        }
//
//        //================== 3. 释放资源 ==================
//        fr.close();


//        FileReader fr = new FileReader("src\\learing\\myIO\\tryland\\cn.txt");
//        int len;
//        char[] buffer = new char[3];
//        while ((len = fr.read(buffer)) != -1) {
//            System.out.print(new String(buffer, 0, len));
//        }
//        fr.close();

        //================== 1. 创建对象，关联本地文件 ==================
        // 路径：Windows系统用 \\ 转义，也可以用 / 跨平台写法
        FileReader fr = new FileReader("src\\learing\\myIO\\tryland\\cn.txt");

        //================== 2. 读取数据（字符数组批量读取） ==================
        // 1. 创建字符数组作为缓冲区，长度一般为1024的整数倍（这里示例用2，方便演示）
        char[] chars = new char[2];
        // 2. 定义变量len，记录每次实际读取到的字符个数
        int len;

        /*todo        read(chars) 核心原理：
            1. 把【读取数据、解码、强转】三步合并，直接把解码后的字符存入字符数组
            2. 等价于 空参read() + 手动强转 的批量版本，效率更高
            3. 返回值len：本次实际读取到的字符数，读到文件末尾返回-1
         */

        // 循环读取：read(chars)返回-1代表文件读取完毕
        while ((len = fr.read(chars)) != -1) {
            // 把数组中的有效数据转为字符串打印
            // new String(chars, 0, len)：从数组索引0开始，取len个有效字符，避免数组残留旧数据
            System.out.print(new String(chars, 0, len));
        }

        //================== 3. 释放资源 ==================
        fr.close();






    }
}
