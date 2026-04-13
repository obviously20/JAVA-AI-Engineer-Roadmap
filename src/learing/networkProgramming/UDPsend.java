package learing.networkProgramming;

import java.io.IOException;
import java.net.*;

public class UDPsend {
    public static void main(String[] args) throws IOException {
        /*
        static InetAddress getByName(String host)  确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
        String getHostName()                      获取此IP地址的主机名
        String getHostAddress()                    返回文本显示中的IP地址字符串
        */


//        InetAddress inetAddress = InetAddress.getByName("Wjm");
//        System.out.println(inetAddress);
//        System.out.println(inetAddress.getHostName());
//        System.out.println(inetAddress.getHostAddress());

        //UDP协议
        //发送方（端口随机） → 数据包 → 接收方（端口10086）
        //接收方（端口10086） → 回复数据包 → 发送方（端口随机）

        //发送数据

        //1.创建DatagramSocket对象
        //绑定端口，以后就是通过这个端口发送往外数据
        //无参：随机端口，所有可用的端口中随机选择一个端口
        //有参：指定端口
        DatagramSocket ds = new DatagramSocket();

        //2.打包数据
        //将要发送的数据转换为字节数组
        byte[] bytes = "hello world".getBytes();
        //获取要发送的服务器的IP地址
        InetAddress address = InetAddress.getByName("127.0.0.1");
        //获取要发送的服务器的端口号（接受端的端口号）
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        //3.发送数据
        ds.send(dp);

        //4.关闭资源
        ds.close();














    }
}
