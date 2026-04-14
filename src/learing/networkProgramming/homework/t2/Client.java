package learing.networkProgramming.homework.t2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //客户端:多次发送数据
        //服务器:按收多次接收数据，并打印

        //创建socket对象
        Socket socket = new Socket("127.0.0.1", 11111);
        //获取输出流
        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入要发送的数据:");
            String send = sc.nextLine();
            if(send.equals("exit")){
                break;
            }
            //因为读取数据时是按行读取，所以需要在发送数据时添加换行符，否则服务器会读取到不完整的数据而一直等待塞满缓冲区，服务端没有数据可读
            os.write((send+"\n").getBytes());
            //刷新输出流:确保数据立即发送到服务器
            os.flush();
        }

        //关闭流
        os.close();
        socket.close();



    }
}
