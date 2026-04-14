package learing.networkProgramming.homework.t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(11111);

        //等待客户端连接
        Socket socket = serverSocket.accept();

        //获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;

        while ((line = br.readLine()) != null) {

            System.out.println(line);

        }

        //关闭流
        br.close();
        socket.close();
        serverSocket.close();

    }
}
