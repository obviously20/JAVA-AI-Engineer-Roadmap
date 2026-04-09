package learing.myIO.practice;

import java.io.*;

public class T5FrommyBuffered {
    public static void main(String[] args) throws IOException {
        //拷贝文件
        //四种方式拷贝文件，并统计各自用时:
        //字节流的基本流:一次读写一个字节
        //字节流的基本流:一次读写一个字节数组
        //字节缓冲流:一次读写一个字节
        //字节缓冲流:一次读写一个字节数组


//        //1.
//        //字节流的基本流:一次读写一个字节
//        FileInputStream fis = new FileInputStream("src/learing/myIO/tryland/buffered/T5.txt");
//        FileOutputStream fos = new FileOutputStream("src/learing/myIO/tryland/buffered/T5_copy.txt");
//        int b;
//        while((b=fis.read())!=-1){
//            fos.write(b);
//        }
//        fos.close();
//        fis.close();

//        //2
//        //字节流的基本流:一次读写一个字节数组
//        FileInputStream fis = new FileInputStream("src/learing/myIO/tryland/buffered/T5.txt");
//        FileOutputStream fos = new FileOutputStream("src/learing/myIO/tryland/buffered/T5_copy.txt",true);
//        fos.write("\r\n".getBytes());
//        int len;
//        byte[] buf = new byte[1024];
//        while ((len = fis.read(buf)) != -1) {
//            fos.write(buf, 0, len);
//        }
//        fos.close();
//        fis.close();


//        //3
//        //字节缓冲流:一次读写一个字节
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/learing/myIO/tryland/buffered/T5.txt"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/learing/myIO/tryland/buffered/T5_copy.txt",true));
//        bos.write("\r\n".getBytes());
//        int b;
//        while((b=bis.read())!=-1){
//            bos.write(b);
//        }
//        bos.close();
//        bis.close();

//        //4
//        //字节缓冲流:一次读写一个字节数组
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/learing/myIO/tryland/buffered/T5.txt"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/learing/myIO/tryland/buffered/T5_copy.txt",true));
//        bos.write("\r\n".getBytes());
//        int len;
//        byte[] arr = new byte[1024];
//        while((len=bis.read(arr))!=-1){
//            bos.write(arr,0,len);
//        }
//        bos.close();
//        bis.close();




    }
}
