package learing.myIO.myPrintstream;

import java.io.*;

public class Learning {
    public static void main(String[] args) throws IOException {
        ///*
        // 字节打印流：
        //    构造方法
        //        public PrintStream(OutputStream/File/String)            关联字节输出流/文件/文件路径
        //        public PrintStream(String fileName, Charset charset)    指定字符编码
        //        public PrintStream(OutputStreamout, boolean autoFlush)  自动刷新
        //        public PrintStream(OutputStream out, boolean autoFlush, String encoding)  指定字符编码且自动刷新
        //    成员方法：
        //        public void write(int b)            常规方法：规则跟之前一样，将指定的字节写出
        //        public void println(Xxx xx)          特有方法：打印任意数据，自动刷新，自动换行
        //        public void print(Xxx xx)            特有方法：打印任意数据，不换行
        //        public void printf(String format, Object... args)  特有方法：带有占位符的打印语句，不换行
        //*/


        PrintStream ps = new PrintStream(new FileOutputStream("src\\learing\\myIO\\tryland\\printStream\\a.txt") );
        ps.println("hello world");
        ps.print("hello world");
        ps.println();
        ps.printf("hello world %d", 100);
        ps.close();


        ///*
        // 字符打印流：
        //    构造方法
        //        public PrintWriter(Write/File/String)            关联字节输出流/文件/文件路径
        //        public PrintWriter(String fileName, Charset charset)    指定字符编码
        //        public PrintWriter(Write, boolean autoFlush)  自动刷新
        //        public PrintWriter(Write out, boolean autoFlush, String encoding)  指定字符编码且自动刷新
        //    成员方法：
        //        public void write(int b)            常规方法：规则跟之前一样，将指定的字节写出
        //        public void println(Xxx xx)          特有方法：打印任意数据，自动刷新，自动换行
        //        public void print(Xxx xx)            特有方法：打印任意数据，不换行
        //        public void printf(String format, Object... args)  特有方法：带有占位符的打印语句，不换行
        //*/

        // 自动刷新autoFlush: true 自动刷新，false 不自动刷新
        PrintWriter pw  = new PrintWriter(new FileWriter("src\\learing\\myIO\\tryland\\printStream\\b.txt"),true);
        pw.println("hello world");
        pw.print("hello world");
        pw.println();
        pw.printf("hello world %d", 100);
        pw.close();


        //打印流有几种?各有什么特点?
        //有字节打印流和字符打印流两种
        //打印流不操作数据源，只能操作目的地--这只能打印数据，不能读取数据
        //字节打印流:默认自动刷新，特有的println自动换行
        //字符打印流:自动刷新需要开启，特有的println自动换行



    }
}
