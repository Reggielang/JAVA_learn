package TCPdemo6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

//循环上传文件
public class Serverdemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10001);

        while (true) {
            Socket accept = ss.accept();
            Threadsocket ts = new Threadsocket(accept);
            new Thread(ts).start();

        }
        //ss.close();
    }
}
