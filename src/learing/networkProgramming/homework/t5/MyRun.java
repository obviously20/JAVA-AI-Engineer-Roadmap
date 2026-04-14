package learing.networkProgramming.homework.t5;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRun implements Runnable {

    Socket socket;

    public MyRun(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {


        try {
            //读取客户端上传的文件内容，保存到服务器端的文件中
            //获取输入流
            BufferedInputStream reader = new BufferedInputStream(socket.getInputStream());
            //文件写入流：将客户端上传的文件内容写入服务器端的文件中
            //todo 而如果客户端多次上传同一个文件，服务器端的文件会被覆盖，为了解决这个重名覆盖问题，用到UUID类的RandomUUID方法生成随机的文件名
            //生成随机的文件名
            String fileName = UUID.randomUUID().toString().replace("-", "") + ".jpg";
            BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream("src\\learing\\networkProgramming\\homework\\t5\\serverdir\\" + fileName));
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

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭socket
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
