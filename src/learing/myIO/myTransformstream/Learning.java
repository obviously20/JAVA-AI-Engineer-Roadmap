package learing.myIO.myTransformstream;

import learing.InnerClass.practice.p4.Outer;

import java.io.*;
import java.nio.charset.Charset;

public class Learning {
    public static void main(String[] args) throws IOException {
        //转换文件编码
        //需求1:手动创建一个GBK的文件，把文件中的中文读取到内存中，不能出现乱码
        //需求2:把一段中文按照GBK的方式写到本地文件
        //需求3:将本地文件中的GBK文件，转成UTF-8



        //淘汰方法
//        //1
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\learing\\myIO\\tryland\\transfrom\\1.txt"),"GBK");
//        int b;
//        while ((b = isr.read()) != -1) {
//            System.out.print((char)b);
//        }
//        isr.close();

//        //新
//        FileReader fr = new FileReader("src\\learing\\myIO\\tryland\\transfrom\\1.txt", Charset.forName("GBK"));
//        int b;
//        while ((b = fr.read()) != -1) {
//            System.out.print((char) b);
//        }
//        fr.close();


//        //2
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\learing\\myIO\\tryland\\transfrom\\1.txt"),"GBK");
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src\\learing\\myIO\\tryland\\transfrom\\2.txt"),"GBK");
//        int b;
//        while ((b = isr.read()) != -1) {
//            osw.write(b);
//        }
//        osw.close();
//        isr.close();

//        FileReader fr = new FileReader("src\\learing\\myIO\\tryland\\transfrom\\1.txt", Charset.forName("GBK"));
//        FileWriter fw = new FileWriter("src\\learing\\myIO\\tryland\\transfrom\\2.txt", Charset.forName("GBK"));
//        int b;
//        while ((b = fr.read()) != -1) {
//            fw.write(b);
//        }
//        fw.close();
//        fr.close();


//        //3
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\learing\\myIO\\tryland\\transfrom\\1.txt"),"GBK");
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src\\learing\\myIO\\tryland\\transfrom\\2.txt"),"UTF-8");
//        int b;
//        while ((b = isr.read()) != -1) {
//            osw.write(b);
//        }
//        osw.close();
//        isr.close();

//        FileReader fr = new FileReader("src\\learing\\myIO\\tryland\\transfrom\\1.txt", Charset.forName("GBK"));
//        FileWriter fw = new FileWriter("src\\learing\\myIO\\tryland\\transfrom\\2.txt", Charset.forName("UTF-8"));
//        int b;
//        while ((b = fr.read()) != -1) {
//            fw.write(b);
//        }
//        fw.close();
//        fr.close();




        //1.转换流的名字是什么?
        //字符转换输入流:InputStreamReader：把字节流转换为字符流
        //字符转换输出流:OutputStreamWriter：把字符流转换为字节流

        //2.转换流的作用是什么?
        //指定字符集读写数据(JDK11之后已淘汰)
        //字节流想要使用字符流中的方法了

        //利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码
        ////1.字节流在读取中文的时候，是会出现乱码的，但是字符流可以搞定
        // 2.字节流里面是没有读一整行的方法的，只有字符缓冲流才能搞定
        BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream("src\\learing\\myIO\\tryland\\transfrom\\gbkfile.txt"),"GBK"));
        String line;
        while ((line = fr.readLine()) != null) {
            System.out.println(line);
        }
        fr.close();
    }
}
