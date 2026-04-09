package learing.myIO.practice;

import java.io.*;

public class T7 {
    public static void main(String[] args) throws IOException {
        //软件运行次数
        //实现一个验证程序运行次数的小程序，要求如下:
        //1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
        //2.程序运行演示如下:
        //第一次运行控制台输出:欢迎使用本软件，第1次使用免费~
        //第二次运行控制台输出:欢迎使用本软件，第2次使用免费~
        //第三次运行控制台输出:欢迎使用本软件，第3次使用免费~
        //第四次及之后运行控制台输出:本软件只能免费使用3次，欢迎您注册会员后继续使用~

        //IO流随用随创建，用完立即关闭
        BufferedReader br = new BufferedReader(new FileReader("src/learing/myIO/tryland/buffered/T7.txt"));
        String line = br.readLine();
        Integer count = Integer.parseInt(line);
        count++;
        br.close();
        if(count<=3){
            System.out.println("欢迎使用本软件，第" + count + "次使用免费~");
        }else{
            System.out.println("本软件只能免费使用3次，欢迎您注册会员后继续使用~");
        }
        //将count写入文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/learing/myIO/tryland/buffered/T7.txt"));
        bw.write(count+"");
        bw.close();
    }
}
