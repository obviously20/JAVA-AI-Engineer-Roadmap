package learing.networkProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //TCP协议接收数据

        //1.创建服务器端ServerSocket对象
        //在创建服务器端ServerSocket对象时，会监听指定端口号
        //如果端口号被占用，代码会报错
        ServerSocket ss = new ServerSocket(10088);

        //2.监听客户端链接请求
        //如果客户端无链接请求，会阻塞在accept方法中
        Socket sc = ss.accept();

        //3.可以从链接通道中获取输入流
        /*InputStream is = sc.getInputStream();//但中文不能用字节流接收，否则会乱码
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);*/
        BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
        //4.使用输入流接收数据
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        //5.关闭流
        br.close();
        sc.close();
        ss.close();


    }
}
