package learing.networkProgramming.homework.T1;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SenMessages {
    public static void main(String[] args) throws IOException {
        //（单播 ）-------->广播和单播很像只要把地址改为255.255.255.255即可InetAddress address = InetAddress.getByName("255.255.255.255");
        //其他都一样
        //聊天室
        //按照下面的要求实现程序UDP发送数据:数据来自于键盘录入，直到输入的数据是886，
        // 发送数据结束UDP接收数据:因为接收端不知道发送端什么时候停止发送，故采用死循环接收


        DatagramSocket dsend = new DatagramSocket();

        //打包数据
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的数据：");
            String str = sc.nextLine();
            if(str.equals("886")){
                break;
            }
            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10087;
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, address, port);
            dsend.send(packet);
        }


        dsend.close();


    }
}
