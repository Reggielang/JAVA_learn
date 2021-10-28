package TCPdemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

//客户端
public class socket {
    public static void main(String[] args) throws IOException {
        //1.创建一个socket对象
        Socket socket= new Socket("127.0.0.1",10000);
        //2.创建一个IO流写数据
        OutputStream os = socket.getOutputStream();
        os.write("hello".getBytes());

        //3.释放资源
        os.close();
        socket.close();
    }
}
