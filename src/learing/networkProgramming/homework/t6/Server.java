package learing.networkProgramming.homework.t6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        ////服务器:接收客户端上传的文件，上传完毕之后给出反馈。
        ////服务器:接收客户端上传的文件，上传完毕之后给出反馈。

        //用户上传多个文件，服务器端需要能够接收多个文件上传请求且不中断while循环+多线程处理

        ServerSocket serverSocket = new ServerSocket(11114);

        //创建线程池：处理客户端上传的文件
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,                          // corePoolSize：核心线程数量
                16,                         // maximumPoolSize：线程池总大小（最大线程数）
                60,                         // keepAliveTime：空闲时间
                TimeUnit.SECONDS,           // 空闲时间单位：秒
                new ArrayBlockingQueue<>(2),// 阻塞队列，容量为2
                Executors.defaultThreadFactory(), // 线程工厂，默认创建线程的方式
                new ThreadPoolExecutor.AbortPolicy() // 拒绝策略：队列满、线程满时直接抛出异常
        );

        while (true) {
            Socket socket = serverSocket.accept();

            //创建线程处理客户端上传的文件
            //一个用户对应一个线程
            pool.submit(new MyRun(socket));



            //只有循环远远不够。假如多个客户端同时上传文件，服务器端需要能够同时接收多个文件上传请求。
            //而不是上传完一个文件后，再接收下一个文件上传请求。
            //所以需要使用多线程处理。

//            //读取客户端上传的文件内容，保存到服务器端的文件中
//            //获取输入流
//            BufferedInputStream reader = new BufferedInputStream(socket.getInputStream());
//            //文件写入流：将客户端上传的文件内容写入服务器端的文件中
//            //todo 而如果客户端多次上传同一个文件，服务器端的文件会被覆盖，为了解决这个重名覆盖问题，用到UUID类的RandomUUID方法生成随机的文件名
//            //生成随机的文件名
//            String fileName = UUID.randomUUID().toString().replace("-", "") + ".jpg";
//            BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream("src\\learing\\networkProgramming\\homework\\t5\\serverdir\\" + fileName));
//            //读取客户端上传的文件内容
//            int len;
//            byte[] bytes = new byte[1024];
//            while ((len = reader.read(bytes)) != -1) {
//                writer.write(bytes, 0, len);
//            }
//
//
//            //结束上传，要回显反馈
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//            bw.write("success\n");
//            bw.flush();
//
//            bw.close();
//            writer.close();
//            reader.close();
//            socket.close();
        }
    }
}
