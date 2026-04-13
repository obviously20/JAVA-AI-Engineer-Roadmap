package learing.networkProgramming.homework.T1;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.DatagramPacket;

public class ReceiveMessages {
    public static void main(String[] args) throws IOException {
        //聊天室
        //按照下面的要求实现程序UDP发送数据:数据来自于键盘录入，直到输入的数据是886，
        //发送数据结束UDP接收数据:因为接收端不知道发送端什么时候停止发送，故采用死循环接收


        DatagramSocket dr = new DatagramSocket(10087);

        //接受数据包
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);

        while (true) {
            dr.receive(dp);
            //解析数据包
            byte[] data = dp.getData();
            int len = dp.getLength();
            String ip = dp.getAddress().getHostAddress();
            String name = dp.getAddress().getHostName();
            int port = dp.getPort();

            System.out.println(name+"/"+ip+":"+port+"发来的数据："+new String(data, 0, len));
        }

        //释放
//        dr.close();







    }
}
