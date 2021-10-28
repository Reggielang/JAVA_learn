package TCPdemo6;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class Threadsocket implements Runnable{

    private Socket accpetsocket;
    public Threadsocket(Socket accept) {
        this.accpetsocket =accept;
    }

    @Override
    public void run() {
        BufferedOutputStream bos = null;
        try {
            //接收客户端的数据
            BufferedInputStream bis = new BufferedInputStream(accpetsocket.getInputStream());
            //写到本地，实现永久化存储
            bos = new BufferedOutputStream(new FileOutputStream("D:\\大数据相关学习\\JAVA\\网络编程\\"+ UUID.randomUUID().toString()+".jpg"));

            int b;
            while ((b=bis.read())!=-1){
                bos.write(b);
            }

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accpetsocket.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (accpetsocket!=null){
                try {
                    accpetsocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
