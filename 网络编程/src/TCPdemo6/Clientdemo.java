package TCPdemo6;

import java.io.*;
import java.net.Socket;

//多个不重复文件的上传
public class Clientdemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10001);
        //用来读取本地文件的缓冲流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\REGGIE\\Desktop\\useful\\学位材料\\微信图片_20211021102744.jpg"));

        //写到服务器
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);

        int b;
        while ((b=bis.read())!=-1){
            bos.write(b);
        }

        //给服务器一个结束标记，告诉服务器文件已经传输完毕
        socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }

        bis.close();
        socket.close();

    }
}
