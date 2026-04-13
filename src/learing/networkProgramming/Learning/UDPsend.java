package learing.networkProgramming.Learning;

import java.io.IOException;
import java.lang.invoke.MutableCallSite;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class UDPsend {
    public static void main(String[] args) throws IOException {
        //todo:UDP组播发送数据

        //1.创建组播套接字MulticastSocket
        MulticastSocket ms = new MulticastSocket();

        //2.打包数据
        byte[] bytes = "hello".getBytes();
        InetAddress group = InetAddress.getByName("224.0.0.1");
        int port = 10087;
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, group, port);

        //3.发送数据
        ms.send(packet);

        //4.关闭资源
        ms.close();































    }
}
