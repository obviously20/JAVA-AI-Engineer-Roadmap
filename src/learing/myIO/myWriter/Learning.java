package learing.myIO.myWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Learning {
    public static void main(String[] args) throws IOException {
        ///*
        //FileWriter 字符输出流 三大步骤：
        //===============================================
        //第一步：创建对象（绑定文件）
        //===============================================
        //public FileWriter(File file)
        //    关联File对象，覆盖模式（文件存在则清空，不存在则创建）
        //public FileWriter(String pathname)
        //    关联字符串路径，覆盖模式
        //public FileWriter(File file, boolean append)
        //    关联File对象，append=true 为追加模式，false为覆盖
        //public FileWriter(String pathname, boolean append)
        //    关联字符串路径，append=true 追加，false 覆盖
        //
        //===============================================
        //第二步：写入数据（write系列方法）
        //===============================================
        //void write(int c)
        //    写入单个字符（例如 '我' 的编码 25105）
        //void write(String str)
        //    写入整个字符串
        //void write(String str, int off, int len)
        //    写入字符串的一部分（从索引off开始，取len个字符）
        //void write(char[] cbuf)
        //    写入字符数组
        //void write(char[] cbuf, int off, int len)
        //    写入字符数组的一部分
        //
        //===============================================
        //第三步：释放资源
        //===============================================
        //public void close()
        //    必须调用！刷新流缓冲区并关闭流，释放系统资源
        //*/


        //第一步：创建对象（绑定文件）
        FileWriter fw = new FileWriter("src\\learing\\myIO\\tryland\\a.txt", true/*追加*/);

        //第二步：写入数据（write系列方法）

//        fw.write(25105);

//        char[] cbuf = {'我', '好', '啊', '?'};
//        fw.write(cbuf);
//        fw.write(cbuf, 0, 4);

        fw.write("你好啊???");
        //第三步：释放资源
        //刷新流缓冲区并关闭流，释放系统资源
        fw.close();







    }
}
