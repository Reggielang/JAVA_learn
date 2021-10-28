package TCPdemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
/*
accept方法是阻塞的，作用是等待客户端连接
客户端，创建对象并连接服务器，此时是通过三次握手协议保证跟服务器之间的连接
针对客户端来讲，是往外写的，所以是输出流
针对服务器来讲，是往里读的，所以是输入流
read方法也是阻塞的，
在关流的时候，还多了一个往服务器写结束标记的动作
最后一步断开连接，通过四次挥手协议，保证连接终止
 */
public class Serversocket {
    public static void main(String[] args) throws IOException {
        //1.创建Socket对象
        ServerSocket ss = new ServerSocket(10000);

        //2.等待客户端链接
        Socket accept = ss.accept();
        //3.获得输入流对象
        InputStream is = accept.getInputStream();
        int b;
        while ((b = is.read())!=-1){
            System.out.println((char) b);
        }

        //4.释放资源
        is.close();
        ss.close();
    }
}
