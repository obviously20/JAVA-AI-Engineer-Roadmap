package learing.networkProgramming.Learning;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class UDPreceive {
    public static void main(String[] args) throws IOException {
        //1.创建组播套接字MulticastSocket，且绑定端口号
        MulticastSocket ms = new MulticastSocket(10087);

        //2.todo 将当前本机添加到224.0.0.0~239.255.255.255的组播地址
        //      但其中预留给我们的是224.0.0.0~224.0.0.255的组播地址
        InetAddress address = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);

        //3.创建接收数据包DatagramPacket
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);


        //4.接收数据
        ms.receive(packet);

        //5.解析数据
        byte[] bytes = packet.getData();
        int len = packet.getLength();
        String ip = packet.getAddress().getHostAddress();
        String name = packet.getAddress().getHostName();
        int port = packet.getPort();

        System.out.println(name+"/"+ip+":"+port+"发来的数据："+new String(bytes, 0, len));

        //6.关闭资源
        ms.close();






























    }
}
