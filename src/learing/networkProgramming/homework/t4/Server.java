package learing.networkProgramming.homework.t4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        ////服务器:接收客户端上传的文件，上传完毕之后给出反馈。
        ////服务器:接收客户端上传的文件，上传完毕之后给出反馈。

        ServerSocket serverSocket = new ServerSocket(11113);

        Socket socket = serverSocket.accept();

        //读取客户端上传的文件内容，保存到服务器端的文件中
        //获取输入流
        BufferedInputStream reader = new BufferedInputStream(socket.getInputStream());
        //文件写入流：将客户端上传的文件内容写入服务器端的文件中
        //todo 而如果客户端多次上传同一个文件，服务器端的文件会被覆盖，为了解决这个重名覆盖问题，用到UUID类的RandomUUID方法生成随机的文件名
        //生成随机的文件名
        String fileName = UUID.randomUUID().toString().replace("-", "") + ".jpg";
        BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream("src\\learing\\networkProgramming\\homework\\t4\\serverdir\\" + fileName));
        //读取客户端上传的文件内容
        int len;
        byte[] bytes = new byte[1024];
        while ((len = reader.read(bytes)) != -1) {
            writer.write(bytes, 0, len);
        }


        //结束上传，要回显反馈
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("success\n");
        bw.flush();

        bw.close();
        writer.close();
        reader.close();
        socket.close();



    }
}
