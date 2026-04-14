package learing.networkProgramming.homework.t3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //服务器:按收数据并打印。再给客户端反馈沂息


        //----------------服务器按收数据并打印。----------------------

        //ServerSocket
        ServerSocket serverSocket = new ServerSocket(11112);
        //等待客户端连接
        Socket socket = serverSocket.accept();
        //获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }




        //----------------服务器给客户端反馈消息----------------------
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write("服务器反馈消息\n");
        bw.flush();

        //关闭流
        bw.close();
        os.close();
        socket.close();
        serverSocket.close();




    }
}
