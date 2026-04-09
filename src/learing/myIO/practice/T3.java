package learing.myIO.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class T3 {
    public static void main(String[] args) throws IOException {
        //需求:
        //将一个文件加密/解密

        //^:异或；
        //如果两个数相同，结果为0（false）；
        //如果两个数不同，结果为1（true）；

        //原理：将文件中得到的每个字节与密钥进行异或操作，得到加密后的字节；
        //将加密后的字节写入到目标文件中，即可实现文件的加密
        //解密时，将加密后的字节再次进行异或操作，即可得到原始文件内容
        //todo 一个数字异或另一个数字两次，结果为原始数字

//        //加密：将文件中得到的每个字节与密钥进行异或操作，得到加密后的字节
//        FileInputStream fis = new FileInputStream(new File("src/learing/myIO/tryland/0.png"));
//        FileOutputStream fos = new FileOutputStream(new File("src/learing/myIO/tryland/0_encr.png"));
        //解密：把加密后的字节再次进行异或操作，即可得到原始文件内容；下面的代码通用
        FileInputStream fis = new FileInputStream(new File("src/learing/myIO/tryland/0_encr.png"));
        FileOutputStream fos = new FileOutputStream(new File("src/learing/myIO/tryland/0_dec.png"));

        int bit;//记录每次读取到的字节
        int key = 100;//密钥
        while((bit=fis.read())!=-1){
            fos.write(bit^key);//将加密后的字节写入到目标文件中
        }
        fos.close();
        fis.close();



    }
}
