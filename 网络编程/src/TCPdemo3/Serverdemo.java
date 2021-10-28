package TCPdemo3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Serverdemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10001);

        Socket accept = ss.accept();

        //接收客户端的数据
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        //写到本地，实现永久化存储
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\大数据相关学习\\JAVA\\网络编程\\copy.pdf"));

        int b;
        while ((b=bis.read())!=-1){
            bos.write(b);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        bw.flush();


        bos.close();
        accept.close();
        ss.close();
    }
}
