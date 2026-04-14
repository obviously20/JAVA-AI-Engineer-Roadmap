package learing.networkProgramming.homework.t3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        ////客户端:发送一条数据，按收服务端反馈的消息并打印
        ////服务器:按收数据并打印。再给客户端反馈沂息

        //创建socket对象(通道连接对象)
        Socket socket = new Socket("127.0.0.1", 11112);

        //----------------客户端发送数据给服务器----------------------

        //获取输出流
        OutputStream os = socket.getOutputStream();

        Scanner sc = new Scanner(System.in);
        //发送数据
       os.write("客户端发送消息\n".getBytes());
       os.flush();
       ////标记发送完一条数据，让其那边的while循环读取到标记后break-->去反馈消息
        socket.shutdownOutput();


        //----------------客户端按收服务端反馈的消息----------------------

        //获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        //关闭流
        br.close();
        os.close();
        socket.close();






    }
}
