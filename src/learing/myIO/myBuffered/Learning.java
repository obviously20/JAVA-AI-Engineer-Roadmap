package learing.myIO.myBuffered;

import java.io.*;

public class Learning {
    public static void main(String[] args) throws IOException {

          //todo 字节缓冲流(byte)
          //拷贝文件
//        //1.创建输入流，指向源文件
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/learing/myIO/tryland/buffered/a.txt"));
//        //2.创建输出流，指向目标文件
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/learing/myIO/tryland/buffered/b.txt"));
//        //3.读取源文件内容
//        int data ;
//        while((data = bis.read()) != -1){
//            bos.write(data);
//        }
//        //4.关闭流
//        bos.close();
//        bis.close();//不用关闭基础流，因为是BufferedInputStream，会自动关闭底层的FileInputStream和BufferedOutputStream


//        //拷贝文件，使用数组
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/learing/myIO/tryland/buffered/a.txt"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/learing/myIO/tryland/buffered/b.txt"));
//        int data ;
//        byte[] buf = new byte[1024];
//        while((data=bis.read(buf))!=-1){
//            bos.write(buf,0,data);
//        }
//        bos.close();
//        bis.close();


        //1.缓冲流有几种?
        //字节缓冲输入流:BufferedInputStream
        //字节缓冲输出流:BufferedOutputStream
        //字符缓冲输入流:BufferedReader
        //字符缓冲输出流:BufferedWriter
        //2.缓冲流为什么能提高性能
        //缓冲流自带长度为8192的缓冲区
        //可以显著提高字节流的读写性能
        //对于字符流提升不明显，对于字符缓冲流而言关键点是两个特有的方法
        //3.字符缓冲流两个特有的方法是什么?
        //字符缓冲输入流BufferedReader:readLine()
        //字符缓冲输出流BufferedWriter:newLine ()

        //todo 字符缓冲流(char)

//        //读取文件内容
//        BufferedReader br = new BufferedReader(new FileReader("src/learing/myIO/tryland/buffered/a.txt"));
//        String line ;
//        while ((line= br.readLine())!=null){
//            System.out.println(line);
//        }
//        br.close();
//
//        //写入文件内容
//        BufferedWriter bw = new BufferedWriter(new FileWriter("src/learing/myIO/tryland/buffered/b.txt",true));
//        bw.newLine();
//        bw.write("hello world");
//        bw.newLine();//换行
//        bw.write("hello java");
//        bw.close();








    }
}
