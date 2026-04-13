package learing.networkProgramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPreceive {
    public static void main(String[] args) throws IOException {
        //接收数据
        //1.创建DatagramSocket对象（绑定端口号：要与发送端的端口号一致）
        DatagramSocket ds = new DatagramSocket(10086);

        //2.接收数据包
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);

        //细节:实际上接收数据包时，是阻塞式的，直到有数据包到达，才会继续执行
        //如果当前没有数据包到达，那么就会阻塞在这里，等待有数据包到达
        System.out.println("等待接收数据包...");
        ds.receive(dp);
        System.out.println("接收数据包成功!");


        //3.解析数据包
        //3.1获取数据包中的数据
        byte[] data = dp.getData();
        //3.2获取数据包中的有效数据长度
        int len = dp.getLength();
        //3.3获取数据包中的发送端地址
        InetAddress address = dp.getAddress();
        //3.4获取数据包中的发送端端口号
        int port = dp.getPort();

        System.out.println("发送端地址：" + address);
        System.out.println("发送端端口号：" + port);
        System.out.println("发送端发送的数据：" + new String(data, 0, len));

        //4.关闭资源
        ds.close();





























    }
}
