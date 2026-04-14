package learing.networkProgramming.homework.t6;

import java.io.*;
import java.net.Socket;

public class Cilent {
    public static void main(String[] args) throws IOException {
        ////客户端:将本地文件上传到服务器。接收服务器的反馈。
        ////服务器:接收客户端上传的文件，上传完毕之后给出反馈。


        Socket socket = new Socket("127.0.0.1", 11114);
        //本地读取文件内容
        BufferedInputStream reader = new BufferedInputStream(new FileInputStream("src\\learing\\networkProgramming\\homework\\t6\\cilentdir\\0.png"));
        //获取服务器输出流
        BufferedOutputStream writer = new BufferedOutputStream(socket.getOutputStream());

        //本地读取文件内容并写入服务器输出流
        byte[] bytes = new byte[1024];
        int len;
        while((len = reader.read(bytes)) != -1){
            writer.write(bytes, 0, len);
        }
        writer.flush();

        //结束上传，要回显反馈
        socket.shutdownOutput();

        //按收服务端反馈的消息
        //获取输入流
        BufferedReader feedback = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //读取反馈消息
        String line;
        while((line = feedback.readLine()) != null){
            System.out.println(line);
        }

//        feedback.close();
//        writer.close();
        socket.close();
    }
}
