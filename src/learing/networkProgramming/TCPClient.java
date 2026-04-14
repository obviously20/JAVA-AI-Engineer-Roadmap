package learing.networkProgramming;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //TCP协议发送数据

        //1.创建客户端Socket对象
        //在创建客户端Socket对象时，会链接到服务器端的Socket对象
        //如果链接失败，代码会报错
        Socket sc = new Socket("127.0.0.1", 10088);

        //2.可以从链接通道中获取输出流
        OutputStream os = sc.getOutputStream();
        //3.使用输出流发送数据
        os.write("Hello Server!\n你好，服务器！".getBytes());

        //4.关闭流
        os.close();
        sc.close();
    }
}
